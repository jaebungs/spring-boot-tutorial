package come.fun.code.crudedemo.dao;

import come.fun.code.crudedemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);
    
    Student findById(Integer id);
}
