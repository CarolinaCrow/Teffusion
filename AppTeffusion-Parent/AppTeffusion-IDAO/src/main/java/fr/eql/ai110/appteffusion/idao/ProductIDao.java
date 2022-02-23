package fr.eql.ai110.appteffusion.idao;

import java.util.List;

import fr.eql.ai110.appteffusion.entity.Product;

public interface ProductIDao extends GenericIDao<Product> {

	List<Product> getAllProducts(Product product);
}

