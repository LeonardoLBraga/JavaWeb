package steam.dal.dao;

import javax.enterprise.context.RequestScoped;

import steam.dal.dao.interfaces.IRaridadeDAO;
import steam.dal.entidade.Raridade;
import steam.dal.generics.JPAGenericDAO;

@RequestScoped
public class RaridadeDAO 
		extends JPAGenericDAO<Raridade, Short>
		implements IRaridadeDAO{

}
