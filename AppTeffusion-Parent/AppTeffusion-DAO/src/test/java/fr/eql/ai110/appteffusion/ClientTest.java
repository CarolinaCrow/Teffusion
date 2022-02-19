package fr.eql.ai110.appteffusion;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import fr.eql.ai110.appteffusion.entity.Client;


public class ClientTest {


	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
			.createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	// Method To Fetch All client Details From The Database
	@Test
	@SuppressWarnings("unchecked")
	public  void testGetAllClients() {
		if (!transactionObj.isActive()) {
			transactionObj.begin();
		}

		Query queryObj = entityMgrObj.createQuery("SELECT client FROM Client client");
		List<Client> clientList = queryObj.getResultList();
		
        for (Client result: clientList) {
        assertNotNull(result.getIdClient());
    }
		
		transactionObj.commit();
	}


}
