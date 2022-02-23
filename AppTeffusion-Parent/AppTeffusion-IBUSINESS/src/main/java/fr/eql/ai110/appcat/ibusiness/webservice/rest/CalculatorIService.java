package fr.eql.ai110.appcat.ibusiness.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/calc")
public interface CalculatorIService {

	// "localhost:8090/AppCat-Web/rest/calc/add/22/12" -> 34
	@GET
	@Produces("text/plain")
	@Path("/add/{first}/{second}")
	public int add(@PathParam("first") int firstNumber, @PathParam("second") int secondNumber);
	
	// "localhost:8090/AppCat-Web/rest/calc/mult/2/3" -> 6
	@GET
	@Produces("text/plain")
	@Path("/mult/{first}/{second}")
	public int multiply(@PathParam("first") int firstNumber, @PathParam("second") int secondNumber);
}
