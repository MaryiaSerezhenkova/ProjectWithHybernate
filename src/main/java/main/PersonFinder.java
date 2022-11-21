package main;

import javax.persistence.EntityManager;

import core.Person;
import util.HybernateUtil;

public class PersonFinder {
	public static void main(String[] args) throws Exception {

		Person person = new Person(null, 35, "Yuri", "Slabko");
		EntityManager em = HybernateUtil.getEntityManager();
		try {
			em.getTransaction();
			em.persist(person);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		em.getTransaction().begin();
		Person personFromDb = em.find(Person.class, person.getId());
		// assertEquals(person, personFromDb);
		em.getTransaction().commit();
	}
}
