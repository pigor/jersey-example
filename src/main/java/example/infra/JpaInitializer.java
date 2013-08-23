package example.infra;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.google.inject.persist.PersistService;

@Singleton
public class JpaInitializer {
	
	public JpaInitializer(){
		
	}
	
	@Inject 
	public JpaInitializer(PersistService service) {
		service.start(); 
	} 
}
