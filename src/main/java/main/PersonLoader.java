package main;

import javax.persistence.EntityManager;

import core.Person;
import util.HybernateUtil;

public class PersonLoader {
	public static void main(String[] args) throws Exception{
		
		Person person = new Person(null, 35, "Yuri", "Slabko");
		EntityManager em = HybernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		HybernateUtil.close();
		
	}
}
