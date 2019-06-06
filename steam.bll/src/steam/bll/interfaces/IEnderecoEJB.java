package steam.bll.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Endereco;

public interface IEnderecoEJB {

	public Mensagem salvar(Endereco endereco);
	public Mensagem excluir(Short idEndereco);
	public List<Endereco> listar();
	
}
