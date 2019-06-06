package steam.dal.dao;

import javax.enterprise.context.RequestScoped;

import steam.dal.dao.interfaces.IEnderecoDAO;
import steam.dal.entidade.Endereco;
import steam.dal.generics.JPAGenericDAO;

@RequestScoped
public class EnderecoDAO 
	extends JPAGenericDAO<Endereco, Short>
	implements IEnderecoDAO{

}
