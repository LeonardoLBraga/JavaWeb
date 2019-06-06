package steam.dal.dao;

import javax.enterprise.context.RequestScoped;

import steam.dal.dao.interfaces.IItemDAO;
import steam.dal.entidade.Item;
import steam.dal.generics.JPAGenericDAO;

@RequestScoped
public class ItemDAO 
		extends JPAGenericDAO<Item, Short>
		implements IItemDAO{

}
