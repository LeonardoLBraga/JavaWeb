package steam.dal.entidade;

import javax.persistence.*;

import java.util.List;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idEndereco;
	
	private String estado;
	
	private String cidade;
	
	private String bairro;
	
	private String rua;
	
	private Integer numero;
	
	@OneToMany(mappedBy = "endereco")
	private List<Pessoa> pessoas;
	
	

	public Short getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Short idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
}
