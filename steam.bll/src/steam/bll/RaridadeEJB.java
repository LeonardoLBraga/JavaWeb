package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IRaridadeDAO;
import steam.dal.entidade.Raridade;
import steam.interfaces.IRaridadeEJB;

@Stateless
public class RaridadeEJB implements IRaridadeEJB{

	@Inject
	private IRaridadeDAO raridadeDAO;
	
	@Override
	public Mensagem salvar(Raridade raridade) {
		
		try {
			
			raridadeDAO.insertOrUpdate(raridade);
			
			return new Mensagem("Salvo com sucesso.",
					TipoMensagem.sucesso);
			
		}catch(Exception ex) {
			
			return new Mensagem("Erro inesperado: " 
					+ ex.getMessage(), TipoMensagem.erro);
			
		}finally {
			//fecha a conexão
		}
	}

	@Override
	public Mensagem excluir(Short idRaridade) {
		
		try {
			
			Raridade raridade = raridadeDAO.findById(idRaridade);
			
			if(raridade == null) {
				throw new Exception("Raridade já foi excluída.");
			}
			
			raridadeDAO.delete(raridade);
			
			return new Mensagem("Raridade excluída.", TipoMensagem.sucesso);
		}catch(Exception ex) {
			return new Mensagem("Erro inesperado: "
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
	}

	@Override
	public List<Raridade> listar() {
		return raridadeDAO.findAll();
	}

}
