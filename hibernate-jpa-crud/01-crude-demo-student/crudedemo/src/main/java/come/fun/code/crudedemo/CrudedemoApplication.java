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
			// createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating a new Student...");
		Student tempStudent = new Student("Mok", "Wee", "Mok@Gmail.com");

		studentDAO.save(tempStudent);
		int theId = tempStudent.getId();
		
		Student myStudent = studentDAO.findById(theId);
		System.out.println("Found student: " + myStudent);
	}

	// Create students
	private void createMultipleStudents(StudentDAO studentDAO) {
		Student tempStudent1 = new Student("Mark", "Hawk", "Mark@gmailc.om");
		Student tempStudent2 = new Student("Marry", "Cat", "Marry@gmailc.om");
		Student tempStudent3 = new Student("William", "Dog", "William@gmailc.om");
		
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		System.out.println("Saved student. Generated id: " + tempStudent1.getId());
		System.out.println("Saved student. Generated id: " + tempStudent2.getId());
		System.out.println("Saved student. Generated id: " + tempStudent3.getId());
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
