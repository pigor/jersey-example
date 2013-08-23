package example.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.inject.Injector;

import example.domain.Unidade;
import example.facade.CadastrarUnidadeFacade;
import example.infra.GuiceModule;

@Path("/unidades")
public class UnidadeController {

	private CadastrarUnidadeFacade facade;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String unidades(){
		Injector inj = GuiceModule.getInjector();
		facade = inj.getInstance(CadastrarUnidadeFacade.class);

		List<Unidade> lista = facade.listar();
		
		Gson gson = new Gson();
		
		return gson.toJson(lista); 
	}
}
