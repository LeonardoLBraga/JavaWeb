package steam.dal.entidade;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idPessoa;
	
	private String nome;
	
	private Long cpf;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@ManyToOne
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "pessoa",
	cascade =CascadeType.ALL)
	private Usuario usuario;


	
	public Short getIdPessoa() {
		return idPessoa;
	}



	public void setIdPessoa(Short idPessoa) {
		this.idPessoa = idPessoa;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Long getCpf() {
		return cpf;
	}



	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		return true;
	}
	
	
}
