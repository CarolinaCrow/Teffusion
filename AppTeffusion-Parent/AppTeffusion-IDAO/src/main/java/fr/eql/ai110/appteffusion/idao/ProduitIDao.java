package fr.eql.ai110.appteffusion.idao;

import java.util.Set;

import fr.eql.ai110.appteffusion.entity.Client;
import fr.eql.ai110.appteffusion.entity.Produit;

public interface ProduitIDao extends GenericIDao<Produit> {

	Set<Produit> findProductsByClient(Client client);
}

