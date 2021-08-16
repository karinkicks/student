package karinkicks.dao;


import karinkicks.entity.Student;
import karinkicks.utils.EntityManagerService;

import java.util.Collection;
import javax.persistence.EntityManager;

public class StudentDao {
    EntityManager em = EntityManagerService.getEntityManager();
    public Student create (Student student){
        em.persist(student);
        return student;
    }

    public Student delete (Student student){
        em.remove(student);
        return student;
    }

    public Student update (Student student){
        student = em.merge(student);
        return student;
    }

    public Student getById (Long id){
        Student student = em.find(Student.class, id);
        return student;
    }

    public Collection<Student> findAll (){
        return (Collection<Student>) em.createQuery("from Student").getResultList();
    }

}
