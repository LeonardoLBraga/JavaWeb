package steam.bll.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Pessoa;

public interface IPessoaEJB {

	public Mensagem salvar(Pessoa pessoa);
	public Mensagem excluir(Short idPessoa);
	public List<Pessoa> listar();
}
