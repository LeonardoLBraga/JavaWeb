package steam.dal.entidade;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idItem;
	
	private Float Preco;
	
	@ManyToMany
	@JoinTable(name = "ItemUsuario",
			joinColumns = @JoinColumn(name = "idItem"),
			inverseJoinColumns = @JoinColumn(name = "idUsuario"))
	private List<Usuario> usuarios;
	
	@NotNull(message = "Informe o jogo")
	@ManyToOne
	@JoinColumn(name = "idJogo")
	private Jogo jogo;
	
	@NotNull(message = "Informe a qualidade")
	@ManyToOne
	@JoinColumn(name = "idQualidade")
	private Qualidade qualidade;
	
	@NotNull(message = "Informe a raridade")
	@ManyToOne
	@JoinColumn(name = "idRaridade")
	private Raridade raridade;

	public Short getIdItem() {
		return idItem;
	}

	public void setIdItem(Short idItem) {
		this.idItem = idItem;
	}

	public Float getPreco() {
		return Preco;
	}

	public void setPreco(Float preco) {
		Preco = preco;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public Qualidade getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}

	public Raridade getRaridade() {
		return raridade;
	}

	public void setRaridade(Raridade raridade) {
		this.raridade = raridade;
	}
	
	
}
