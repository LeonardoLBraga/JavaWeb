package steam.bll.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Usuario;

public interface IUsuarioEJB {

	public Mensagem salvar(Usuario usuario);
	public Mensagem excluir(Short idUsuario);
	public List<Usuario> listar();
	
}
