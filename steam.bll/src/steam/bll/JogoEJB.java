package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IJogoDAO;
import steam.dal.entidade.Jogo;
import steam.interfaces.IJogoEJB;;

@Stateless
public class JogoEJB implements IJogoEJB{

	@Inject
	private IJogoDAO jogoDAO;
	
	@Override
	public Mensagem salvar(Jogo jogo) {
		
		try {
			
			jogoDAO.insertOrUpdate(jogo);
			
			return new Mensagem("Salvo com sucesso.",
					TipoMensagem.sucesso);
			
		}catch(Exception ex) {
			
			return new Mensagem("Erro inesperado: " 
					+ ex.getMessage(), TipoMensagem.erro);
		}
	}

	@Override
	public Mensagem excluir(Short idJogo) {
		
		try {
			
			Jogo jogo = jogoDAO.findById(idJogo);
			
			if(jogo == null) {
				throw new Exception("Jogo já foi excluído.");
			}
			
			jogoDAO.delete(jogo);
			
			return new Mensagem("Jogo excluído.", TipoMensagem.sucesso);
		}catch(Exception ex) {
			return new Mensagem("Erro inesperado: "
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
	}

	@Override
	public List<Jogo> listar() {
		return jogoDAO.findAll();
	}

}
