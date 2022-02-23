package fr.eql.ai110.appteffusion.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai110.appteffusion.entity.Product;
import fr.eql.ai110.appteffusion.idao.ProductIDao;

@Remote(ProductIDao.class)
@Stateless
public class ProductDAO extends GenericDao<Product> implements ProductIDao {

}
