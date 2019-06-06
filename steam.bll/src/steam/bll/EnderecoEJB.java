package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IEnderecoDAO;
import steam.dal.entidade.Endereco;
import steam.interfaces.IEnderecoEJB;

@Stateless
public class EnderecoEJB implements IEnderecoEJB{

	@Inject
	private IEnderecoDAO enderecoDAO;
	
	@Override
	public Mensagem salvar(Endereco endereco) {
		
		try {
		
			enderecoDAO.insertOrUpdate(endereco);
			
			return new Mensagem("Salvo com sucesso.",
					TipoMensagem.sucesso);
			
		}catch(Exception ex) {
			
			return new Mensagem("Erro inesperado: " 
					+ ex.getMessage(), TipoMensagem.erro);
			
		}
	}

	@Override
	public Mensagem excluir(Short idEndereco) {
		
		try {
			
			Endereco endereco = enderecoDAO.findById(idEndereco);
			
			if(endereco == null) {
				throw new Exception("Endereço já foi excluído.");
			}
			
	
			
			enderecoDAO.delete(endereco);
			
			return new Mensagem("Endereço excluído.", TipoMensagem.sucesso);
		}catch(Exception ex) {
			return new Mensagem("Erro inesperado: "
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
	}

	@Override
	public List<Endereco> listar() {
		return enderecoDAO.findAll();
	}

}
