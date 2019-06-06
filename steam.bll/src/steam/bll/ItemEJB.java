package steam.bll;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import steam.bll.util.Mensagem;
import steam.bll.util.TipoMensagem;
import steam.dal.dao.interfaces.IItemDAO;
import steam.dal.entidade.Item;
import steam.interfaces.IItemEJB;

@Stateless
public class ItemEJB implements IItemEJB{

	@Inject
	private IItemDAO itemDAO;
	
	@Override
	public Mensagem salvar(Item item) {
		
		try {
			
			itemDAO.insertOrUpdate(item);
			
			return new Mensagem("Salvo com sucesso.",
					TipoMensagem.sucesso);
			
		}catch(Exception ex) {
			
			return new Mensagem("Erro inesperado: " 
					+ ex.getMessage(), TipoMensagem.erro);
			
		}
	}

	@Override
	public Mensagem excluir(Short idItem) {
		
		try {
			
			Item item = itemDAO.findById(idItem);
			
			if(item == null) {
				throw new Exception("Item já foi excluído.");
			}
			
		//	if(item.getAutomoveis().size() > 0) {
			//	throw new Exception("Essa combustivel possui autmoveis vinculados");
		//	}
			
			itemDAO.delete(item);
			
			return new Mensagem("Item excluído.", TipoMensagem.sucesso);
		}catch(Exception ex) {
			return new Mensagem("Erro inesperado: "
					+ ex.getMessage(), TipoMensagem.erro);
		}
		
	}

	@Override
	public List<Item> listar() {
		return itemDAO.findAll();
	}

}
