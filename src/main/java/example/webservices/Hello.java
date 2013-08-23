package example.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/{name}")
public class Hello {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String hello(@PathParam("name") String name){		
		
				
		if(name.equals("")){
			return "Hello stranger!!!";
		}
		
		return "Hello " + name + "!!! ";
	}
}
