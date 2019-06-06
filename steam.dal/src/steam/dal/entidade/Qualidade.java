package steam.dal.entidade;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Qualidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idQualidade;
	
	@Column(name = "descricao") //Opcional
	@NotNull(message = "Campo descrição é obrigatório")
	@Size(max = 50, message = "O campo descrição pode ter no máximo 50 caracteres")
	private String descricao;
	
	@OneToMany(mappedBy = "qualidade")
	private List<Item> itens;

	public Short getIdQualidade() {
		return idQualidade;
	}

	public void setIdQualidade(Short idQualidade) {
		this.idQualidade = idQualidade;
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
