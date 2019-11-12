package web2.ifpe.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Eleicao {
  
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	@Column (length = 30)
	private String descricao;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dataVotacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	} 
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataVotacao() {
		return dataVotacao;
	}
	public void setDataVotacao(Date dataVotacao) {
		this.dataVotacao = dataVotacao;
	}	
	
}
