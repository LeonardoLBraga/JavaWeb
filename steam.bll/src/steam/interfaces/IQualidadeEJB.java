package steam.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Qualidade;

public interface IQualidadeEJB {

	public Mensagem salvar(Qualidade qualidade);
	public Mensagem excluir(Short idQualidade);
	public List<Qualidade> listar();
	
}
