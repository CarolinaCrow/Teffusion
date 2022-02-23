package fr.eql.ai110.appteffusion.entity;

import java.util.Set;
import java.io.Serializable;

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
@Table(name="client")
public class Client implements Serializable {
	
	private static final long serialVersionUID =1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idClient")
	private Integer idClient;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="mail")
	private String mail;
	@Column(name="login")
	private String login;
	@Column(name="mdp")
	private String mdp;
	@Column(name="tel")
	private Double tel;
	@Column(name="adresse")
	private String adresse;
	@Column(name="numRue")
	private Integer numRue;
	@Column(name="nomRue")
	private String nomRue;
	@Column(name="ville")
	private String ville;
	@Column(name="codepostal")
	private Integer codepostal;	

	@OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Set<Product> produits;
	
	public Client() {
		
	}
	
	public Client(Integer idClient, String nom, String prenom, String mail, String login, String mdp,
			Double tel, String adresse, Integer numRue, String nomRue, String ville, Integer codepostal, 
			Set<Product>produits) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.login = login;
		this.mdp = mdp;
		this.tel = tel;
		this.adresse = adresse;
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.ville = ville;
		this.codepostal = codepostal;
		this.produits = produits;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Double getTel() {
		return tel;
	}

	public void setTel(Double tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getNumRue() {
		return numRue;
	}

	public void setNumRue(Integer numRue) {
		this.numRue = numRue;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Integer getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(Integer codepostal) {
		this.codepostal = codepostal;
	}

	public Set<Product> getProduits() {
		return produits;
	}

	public void setProduits(Set<Product> produits) {
		this.produits = produits;
	}
	
}
