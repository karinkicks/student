package karinkicks;



import karinkicks.dao.StudentDao;
import karinkicks.entity.Student;
import karinkicks.utils.EntityManagerService;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {
        EntityManager em = EntityManagerService.getEntityManager();
        StudentDao studentDao = new StudentDao();
        em.getTransaction().begin();
        for (int i = 0; i<1000; i++){
            studentDao.create(new Student("Student"+i, "mark"+i));
        }

        studentDao.delete(studentDao.getById(1L));

        Student student = studentDao.getById(2L);
        student.setName("NEW");
        studentDao.update(student);

        System.out.println(studentDao.findAll().size());

        em.getTransaction().commit();
        em.close();
    }
}
