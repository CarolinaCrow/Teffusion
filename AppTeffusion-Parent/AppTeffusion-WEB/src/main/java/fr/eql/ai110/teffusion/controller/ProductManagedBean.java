package fr.eql.ai110.teffusion.controller;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.eql.ai110.appcat.ibusiness.ProductIBusiness;
import fr.eql.ai110.appteffusion.entity.Product;

@ManagedBean(name="mbCat")
@RequestScoped
public class ProductManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{product}")
	private Set<Product> products;
	
	@EJB
	private ProductIBusiness productBusiness;

	@PostConstruct
	public void init() {
		productBusiness.getAllProducts();
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	


}
