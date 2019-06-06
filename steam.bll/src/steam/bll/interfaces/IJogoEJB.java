package steam.bll.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Jogo;

public interface IJogoEJB {

	public Mensagem salvar(Jogo jogo);
	public Mensagem excluir(Short idJogo);
	public List<Jogo> listar();
	
}
