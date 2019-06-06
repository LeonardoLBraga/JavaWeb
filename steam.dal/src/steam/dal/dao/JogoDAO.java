package steam.dal.dao;

import javax.enterprise.context.RequestScoped;

import steam.dal.dao.interfaces.IJogoDAO;
import steam.dal.entidade.Jogo;
import steam.dal.generics.JPAGenericDAO;

@RequestScoped
public class JogoDAO 
		extends JPAGenericDAO<Jogo, Short>
		implements IJogoDAO{

}
