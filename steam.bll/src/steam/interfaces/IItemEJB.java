package steam.interfaces;

import java.util.List;

import steam.bll.util.Mensagem;
import steam.dal.entidade.Item;

public interface IItemEJB {

	public Mensagem salvar(Item item);
	public Mensagem excluir(Short idItem);
	public List<Item> listar();
}
