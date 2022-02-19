package fr.eql.ai110.appteffusion.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduit")
	private Integer idProduit;
	@Column(name="description")
	private String description;
	@Column(name="prix")
	private Integer prix;
	@Column(name="image")
	private String image;
	@Column(name="titre")
	private String titre;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idProduit")
	private Client client;
	
	public Produit() {	

	}

	public Produit(Integer idProduit, String description, Integer prix, String image, String titre, Client client,
			Set<Client> clients) {
		super();
		this.idProduit = idProduit;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.titre = titre;
		this.client = client;
	}

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
