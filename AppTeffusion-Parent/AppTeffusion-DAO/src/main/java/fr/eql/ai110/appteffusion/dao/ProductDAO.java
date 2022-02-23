package fr.eql.ai110.appteffusion.dao;

import java.util.List;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai110.appteffusion.entity.Product;
import fr.eql.ai110.appteffusion.idao.ProductIDao;

	@Remote(ProductIDao.class)
	@Stateless
	public class ProductDAO extends GenericDao<Product> implements ProductIDao {

//		@Override
//		public Product authenticate(String login, String password) {
//			Owner owner = null;
//			List<Owner> owners;
//			Query query = em.createQuery("SELECT o FROM Client o WHERE o.login = :loginParam "
//					+ "AND o.password = :passwordParam");
//			query.setParameter("loginParam", login);
//			query.setParameter("passwordParam", password);
//			owners = query.getResultList();
//			if (owners.size() > 0) {
//				owner = owners.get(0);
//			}
//			return owner;
//		}


		@Override
		public List<Product> getAllProducts(Product product) {
			Query query = em.createQuery("SELECT COUNT(o) FROM Owner o");
			return (List<Product>) query.getResultList();
		}

	/*
	 * @Remote(ClientIDao.class)
	 * 
	 * @Stateless public class ClientDao extends GenericDao<Client> implements
	 * ClientIDao {
	 * 
	 * public Client authenticate(String login, String password) { Client client =
	 * null; List<Client> clients; Query query =
	 * em.createQuery("SELECT c FROM Client c WHERE c.login = :loginParam " +
	 * "AND c.password = :passwordParam"); query.setParameter("loginParam", login);
	 * query.setParameter("passwordParam", password); clients =
	 * query.getResultList(); if (clients.size() > 0) { client = clients.get(0); }
	 * return client; }
	 * 
	 * @Override public Long findNbClients() { Query query =
	 * em.createQuery("SELECT COUNT(c) FROM Client c"); return (Long)
	 * query.getSingleResult(); }
	 */
}
