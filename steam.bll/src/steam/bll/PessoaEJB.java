package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IPessoaDAO;
import steam.dal.entidade.Pessoa;
import steam.interfaces.IPessoaEJB;


@Stateless
public class PessoaEJB implements IPessoaEJB {

	@Inject
	private IPessoaDAO pessoaDAO;
	
	@Override
	public Mensagem salvar(Pessoa pessoa) {

		try {
			pessoaDAO.insertOrUpdate(pessoa);
		}catch(Exception ex) {
			return new Mensagem("Ocorreu um erro inesperado: " 
						+ ex.getMessage(),TipoMensagem.erro);
		}
		
		return new Mensagem("Salvo com sucesso.", TipoMensagem.sucesso);
	}

	@Override
	public Mensagem excluir(Short idPessoa) {
		
		
		try {
			
			Pessoa pessoa = pessoaDAO.findById(idPessoa);
			
			if(pessoa == null) {
				throw new Exception("Pessoa inexistente.");
			}
			
			pessoaDAO.delete(pessoa);
			
		}catch(Exception ex) {
			return new Mensagem("Não foi possível excluir: " 
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
		return new Mensagem("Excluído com sucesso.",
				TipoMensagem.sucesso);
		
	}


	@Override
	public List<Pessoa> listar() {
		return pessoaDAO.findAll();
	}

}
