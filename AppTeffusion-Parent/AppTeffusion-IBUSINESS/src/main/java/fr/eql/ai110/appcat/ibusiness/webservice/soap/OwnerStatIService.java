package fr.eql.ai110.appcat.ibusiness.webservice.soap;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

//TODO 
@WebService(targetNamespace = "http://ai110.owner.stat.com", name="ownerStatIService")
public interface OwnerStatIService {

	@WebMethod(operationName = "getNbOwners")
	@WebResult(name="nbOwners", targetNamespace="http://ai110.owner.stat.com")
	Long getNbOwners();
}
