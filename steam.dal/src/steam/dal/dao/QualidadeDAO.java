package steam.dal.dao;

import javax.enterprise.context.RequestScoped;

import steam.dal.dao.interfaces.IQualidadeDAO;
import steam.dal.entidade.Qualidade;
import steam.dal.generics.JPAGenericDAO;

@RequestScoped
public class QualidadeDAO 
		extends JPAGenericDAO<Qualidade, Short>
		implements IQualidadeDAO{

}
