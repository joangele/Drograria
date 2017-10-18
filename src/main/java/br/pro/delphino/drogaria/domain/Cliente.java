package br.pro.delphino.drogaria.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Cliente extends GenericDomain {
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(nullable = false)
	private Boolean liberado;
	
	/**
	 * cadastro de cliente é unico por isso é de um para um
	 * lembre-se do exemplo de um cliente esta impedido de comprar e nao poder crir um novo cadastro herdando de pessoa 
	 * por isso é de um para um
	 */
	@OneToOne 
	@JoinColumn(nullable=false)
	private Pessoa pessoa ;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Boolean getLiberado() {
		return liberado;
	}

	public void setLiberado(Boolean liberado) {
		this.liberado = liberado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
