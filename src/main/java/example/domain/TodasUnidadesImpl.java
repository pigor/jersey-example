package example.domain;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class TodasUnidadesImpl implements TodasUnidades {
	@Inject Provider<EntityManager> provider;
	
	public List<Unidade> listar() {
		return provider.get().createQuery(" from Unidade").getResultList();
	}
}
