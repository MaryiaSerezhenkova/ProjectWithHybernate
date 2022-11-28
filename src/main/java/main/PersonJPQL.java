package main;

import javax.persistence.EntityManager;

import util.HybernateUtil;

public class PersonJPQL {

	public static void main(String[] args) {
		EntityManager em = HybernateUtil.getEntityManager();
		javax.persistence.Query query = em.createQuery("from person e where e.age>:age and e.name=? and e.surname=?");
		query.setParameter("age", 20).getResultList().forEach(System.out::println);
		
	HybernateUtil.close();

}
}