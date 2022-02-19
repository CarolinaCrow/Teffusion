package fr.eql.ai110.appteffusion.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai110.appteffusion.entity.Client;

public class ClientDao {

	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	@PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
			.createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	// Method To Fetch All client Details From The Database
	@SuppressWarnings("unchecked")
	public static List getAllClients() {
		Query queryObj = entityMgrObj.createQuery("SELECT client FROM Client client");
		List clientList = queryObj.getResultList();
		if (clientList != null && clientList.size() > 0) {
			return clientList;
		} else {
			return null;
		}
	}

	// Method To Add Create Client Details In The Database
	public static String createNewClient(String nom, String prenom, String login, String mdp) {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}

		Client clientObj = new Client();
		clientObj.setIdClient(getMaxClientId());
		clientObj.setNom(nom);
		clientObj.setPrenom(prenom);
		clientObj.setLogin(login);
		clientObj.setMdp(mdp);
		entityMgrObj.persist(clientObj);
		transactionObj.commit();
		return "clientObj.xhtml?faces-redirect=true";
	}

	// Helper Method 1 - Fetch Maximum Client Id From The Database
	private static int getMaxClientId() {
		int maxClientID = 1;
		Query queryObj = entityMgrObj.createQuery("SELECT MAX(c.id)+1 FROM Client c");
		if (queryObj.getSingleResult() != null) {
			maxClientID = (Integer) queryObj.getSingleResult();
		}
		return maxClientID;
	}

	public static void main(String[] args) {
		createNewClient("a", "b", "c", "d");
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
