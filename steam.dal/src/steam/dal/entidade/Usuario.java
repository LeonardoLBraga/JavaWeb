package steam.dal.entidade;

import javax.persistence.*;

import java.util.*;

@Entity
public class Usuario {

	
	@Id
	@Column(name="idPessoaUsuario",
	insertable = false, updatable = false)
	private Integer idPessoaUsuario;
	
	private String login;
	
	private String senha;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPessoa",nullable=false)
	private Pessoa pessoa;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<Item> itens;

	
	
	public Integer getIdPessoaUsuario() {
		return idPessoaUsuario;
	}

	public void setIdPessoaUsuario(Integer idPessoaUsuario) {
		this.idPessoaUsuario = idPessoaUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
	
}
