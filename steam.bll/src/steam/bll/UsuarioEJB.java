package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IUsuarioDAO;
import steam.dal.entidade.Usuario;
import steam.interfaces.IUsuarioEJB;


@Stateless
public class UsuarioEJB implements IUsuarioEJB{

	@Inject
	private IUsuarioDAO usuarioDAO;
	
	@Override
	public Mensagem salvar(Usuario usuario) {
		
		try {
			
			usuarioDAO.insertOrUpdate(usuario);
			
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
	public Mensagem excluir(Short idUsuario) {
		
		try {
			
			Usuario usuario = usuarioDAO.findById(idUsuario);
			
			if(usuario == null) {
				throw new Exception("Usuario já foi excluído.");
			}
			
			usuarioDAO.delete(usuario);
			
			return new Mensagem("Usuario excluído.", TipoMensagem.sucesso);
		}catch(Exception ex) {
			return new Mensagem("Erro inesperado: "
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
	}

	@Override
	public List<Usuario> listar() {
		return usuarioDAO.findAll();
	}

}
