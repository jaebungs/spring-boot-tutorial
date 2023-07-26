package come.fun.code.crudedemo.dao;

import java.util.List;

import come.fun.code.crudedemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);
    
    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);
}
