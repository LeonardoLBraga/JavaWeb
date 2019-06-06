package steam.test;

import java.util.*;
import javax.ejb.embeddable.*;
import javax.naming.*;

import steam.dal.entidade.*;
import steam.dal.dao.*;
import steam.dal.dao.interfaces.IPessoaDAO;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		p.put("steamDB", "new://Resource?type=DataSource");
		p.put("steamDB.JdbcDriver", "com.mysql.jdbc.Driver");
		p.put("steamDB.JdbcUrl","jdbc:mysql://localhost:3306/steam");
		p.put("steamDB.userName","root");
		p.put("steamDB.password","root");
		
		
		Context context = EJBContainer.createEJBContainer(p).getContext();
		
		IPessoaDAO pessoaDAO = (IPessoaDAO) context
				.lookup("java:global/steam.dal/PessoaDAO");
	
		
		//Pessoa pessoa = new Pessoa();
		//pessoa.setNome("Leonardo");
		
		//pessoaDAO.insert(pessoa);
		
		
		//List<Modelo> modelos = modeloDAO.findByMarca("Fiat");
		
		//for (Pessoa pessoa : pessoas) {
		//	System.out.println(pessoa.getNome());
		//}
		
		
		
	
	}
}
