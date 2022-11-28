package main;

import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import core.Person;
import util.HybernateUtil;

public class PersonTest {
    @Test
    public void saveTest() {
        Person person = new Person(null, 35, "Yuri", "Slabko");
        EntityManager em = HybernateUtil.getEntityManager();
 
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        } catch (HibernateException e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        em.getTransaction().begin();
        Person personFromDb = em.find(Person.class, person.getId());
        Assert.assertEquals(person, personFromDb);
        em.getTransaction().commit();
    }
 
    @AfterClass
    public static void cleanUp() {
        HybernateUtil.close();
    }
 
}