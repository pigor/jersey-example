package example.facade;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import example.domain.TodasUnidades;
import example.domain.Unidade;

public class CadastrarUnidadeFacadeImpl implements CadastrarUnidadeFacade {
	@Inject TodasUnidades todasUnidades;

	@Transactional
	public List<Unidade> listar() {
		return todasUnidades.listar();
	}
}
