package example.webservices;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import example.domain.Unidade;

@ApplicationPath("/")
public class MyApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		// register root resource
		classes.add(Hello.class);
		classes.add(UnidadeController.class);
		return classes;
	}
}