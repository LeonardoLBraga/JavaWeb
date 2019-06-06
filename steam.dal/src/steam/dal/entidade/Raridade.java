package steam.dal.entidade;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Raridade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idRaridade;
	
	@Column(name = "descricao") //Opcional
	@NotNull(message = "Campo descri��o � obrigat�rio")
	@Size(max = 50, message = "O campo descri��o pode ter no m�ximo 50 caracteres")
	private String descricao;
	
	@OneToMany(mappedBy = "raridade")
	private List<Item> itens;

	public Short getIdRaridade() {
		return idRaridade;
	}

	public void setIdRaridade(Short idRaridade) {
		this.idRaridade = idRaridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
}
