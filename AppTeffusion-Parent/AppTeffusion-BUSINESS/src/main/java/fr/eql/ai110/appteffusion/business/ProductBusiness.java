package fr.eql.ai110.appteffusion.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai110.appcat.ibusiness.ProductIBusiness;
import fr.eql.ai110.appteffusion.entity.Product;
import fr.eql.ai110.appteffusion.idao.ProductIDao;

@Remote(ProductIBusiness.class)
@Stateless
public class ProductBusiness implements ProductIBusiness {

	@EJB
	private ProductIDao productDao;

	@Override
	public List<Product> getAllProducts() {

		return productDao.getAll();
	}

	@Override
	public Product getProduct(Integer idProduct) {
		return productDao.getById(idProduct);
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.add(product);
	}

	@Override
	public boolean deleteProduct(Integer idProduct) {
		Product p = new Product();
		p.setIdProduit(idProduct);
		return productDao.delete(p);
	}
}
