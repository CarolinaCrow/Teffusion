package fr.eql.ai110.appcat.ibusiness;

import java.util.List;

import fr.eql.ai110.appteffusion.entity.Product;

public interface ProductIBusiness {
	
	public List<Product> getAllProducts();
	
	public Product getProduct(Integer idProduct);
	
	public Product addProduct(Product product);
	
	public boolean deleteProduct(Integer idProduct);

}
