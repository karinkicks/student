package karinkicks.utils;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class EntityManagerService {
    static final EntityManagerFactory entityManagerFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static EntityManager getEntityManager(){
        return entityManager;
    }
}
