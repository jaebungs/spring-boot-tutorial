package come.fun.code.crudedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import come.fun.code.crudedemo.dao.StudentDAO;
import come.fun.code.crudedemo.entity.Student;

@SpringBootApplication
public class CrudedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudedemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) { // inject StudentDAO
		return runner -> { // Java Lamda expression
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Create new student object...");
		Student tempStudent = new Student("John", "Doe", "JohnJone@gmailc.om");

		// save the student object
		System.out.println("Save the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
