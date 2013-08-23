package example.infra;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.jpa.JpaPersistModule;

import example.domain.TodasUnidades;
import example.domain.TodasUnidadesImpl;
import example.facade.CadastrarUnidadeFacade;
import example.facade.CadastrarUnidadeFacadeImpl;

public class GuiceModule extends AbstractModule {

	static Injector inj;

	@Override
	protected void configure() {
		bind(CadastrarUnidadeFacade.class).to(CadastrarUnidadeFacadeImpl.class);

		bind(TodasUnidades.class).to(TodasUnidadesImpl.class);
	}

	public static Injector getInjector() {

		if (inj == null) {
			inj = Guice.createInjector(new Module[] { new GuiceModule(),
					new JpaPersistModule("JerseyUnit") });
			inj.getInstance(JpaInitializer.class);
		}

		return inj;
	}
}
