package web2.ifpe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projeto {

	@Id
	@GeneratedValue
	private Integer id;
	@Column (length = 20)
	private String nomeDoProjeto;
	@Column (length = 30)
	private String descricao;
	@ManyToOne
	private Candidato candidato;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeDoProjeto() {
		return nomeDoProjeto;
	}
	public void setNomeDoProjeto(String nomeDoProjeto) {
		this.nomeDoProjeto = nomeDoProjeto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}
