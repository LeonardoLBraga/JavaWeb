package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IQualidadeDAO;
import steam.dal.entidade.Qualidade;
import steam.interfaces.IQualidadeEJB;

@Stateless
public class QualidadeEJB implements IQualidadeEJB{

	@Inject
	private IQualidadeDAO qualidadeDAO;
	
	@Override
	public Mensagem salvar(Qualidade qualidade) {
		
		try {
			
			qualidadeDAO.insertOrUpdate(qualidade);
			
			return new Mensagem("Salvo com sucesso.",
					TipoMensagem.sucesso);
			
		}catch(Exception ex) {
			
			return new Mensagem("Erro inesperado: " 
					+ ex.getMessage(), TipoMensagem.erro);
			
		}
	}

	@Override
	public Mensagem excluir(Short idQualidade) {
		
		try {
			
			Qualidade qualidade = qualidadeDAO.findById(idQualidade);
			
			if(qualidade == null) {
				throw new Exception("Qualidade já foi excluída.");
			}
			
			qualidadeDAO.delete(qualidade);
			
			return new Mensagem("Qualidade excluída.", TipoMensagem.sucesso);
		}catch(Exception ex) {
			return new Mensagem("Erro inesperado: "
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
	}

	@Override
	public List<Qualidade> listar() {
		return qualidadeDAO.findAll();
	}

}
