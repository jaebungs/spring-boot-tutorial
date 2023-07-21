package come.fun.code.crudedemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import come.fun.code.crudedemo.entity.Student;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO  {

    // define field for entity manager
    private EntityManager entityManager;
    
    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional // add transactional annotation since we update data
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
