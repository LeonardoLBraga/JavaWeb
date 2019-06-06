package steam.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Raridade;

public interface IRaridadeEJB {

	public Mensagem salvar(Raridade raridade);
	public Mensagem excluir(Short idRaridade);
	public List<Raridade> listar();
	
}
