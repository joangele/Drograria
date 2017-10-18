package br.pro.delphino.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 
 * @author joangele classe responsavel por manter Estado hedando sua chave
 *         primaria de GenricDomain (Chave primaria generica )
 */
@SuppressWarnings("serial")
@Entity
public class Estado extends GenericDomain {

	
	@Column(length = 50 , nullable = false , unique = true  )
	private String sigla;
	
	@Column(length = 50 , nullable = false , unique = true)
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
