package steam.dal.entidade;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

@Entity
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idJogo;
	
	@Column(name = "descricao") //Opcional
	@NotNull(message = "Campo descri��o � obrigat�rio")
	@Size(max = 50, message = "O campo descri��o pode ter no m�ximo 50 caracteres")
	private String descricao;
	
	@OneToMany(mappedBy = "jogo")
	private List<Item> itens;

	public Short getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(Short idJogo) {
		this.idJogo = idJogo;
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
