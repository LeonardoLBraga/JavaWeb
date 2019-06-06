package steam.dal.dao;
import javax.enterprise.context.RequestScoped;

import steam.dal.dao.interfaces.IPessoaDAO;
import steam.dal.entidade.Pessoa;
import steam.dal.generics.JPAGenericDAO;

@RequestScoped
public class PessoaDAO 
		extends JPAGenericDAO<Pessoa, Short>
		implements IPessoaDAO{

}
