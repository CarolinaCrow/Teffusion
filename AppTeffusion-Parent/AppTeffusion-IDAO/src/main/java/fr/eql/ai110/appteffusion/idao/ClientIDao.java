package fr.eql.ai110.appteffusion.idao;

import fr.eql.ai110.appteffusion.entity.Client;

public interface ClientIDao extends GenericIDao<Client> {

	Client authenticate(String login, String mdp);
	Long findNbClients();
}

