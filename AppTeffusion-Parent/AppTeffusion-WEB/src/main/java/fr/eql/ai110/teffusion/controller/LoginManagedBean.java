package fr.eql.ai110.teffusion.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbLogin")
@SessionScoped
public class LoginManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
//
//	private String login;
//	private String password;
//	private Owner owner;
//	
//	@EJB
//	private AccountIBusiness accountBusiness;
//
//	public String connect() {
//		String forward = null;
//		owner = accountBusiness.connect(login, password);
//		if (isConnected()) {
//			forward = "/index.xhtml?faces-redirection=true";
//		} else {
//			FacesMessage facesMessage = new FacesMessage(
//					FacesMessage.SEVERITY_WARN,
//					"Identifiant et/ou mot de passe incorrect(s)",
//					"Identifiant et/ou mot de passe incorrect(s)"
//					);
//			FacesContext.getCurrentInstance().addMessage("loginForm:inpLogin", facesMessage);
//			FacesContext.getCurrentInstance().addMessage("loginForm:inpPassword", facesMessage);
//			forward = "/login.xhtml?faces-redirection=false";
//		}
//		return forward;
//	}
//	
//	public boolean isConnected() {
//		return owner != null;
//	}
//	
//	public String disconnect() {
//		HttpSession session = (HttpSession) FacesContext
//				.getCurrentInstance()
//				.getExternalContext()
//				.getSession(true);
//		session.invalidate();
//		owner = null;
//		return "/login.xhtml?faces-redirection=true";
//	}
//	
//	public String getLogin() {
//		return login;
//	}
//	public void setLogin(String login) {
//		this.login = login;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public Owner getOwner() {
//		return owner;
//	}
//	public void setOwner(Owner owner) {
//		this.owner = owner;
//	}
}
