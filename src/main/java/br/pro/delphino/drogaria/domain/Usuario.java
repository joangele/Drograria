package br.pro.delphino.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import javassist.bytecode.annotation.BooleanMemberValue;

/**
 * 
 * @author joangele
 
 */

@SuppressWarnings("serial")
@Entity
@Table(name="usuario")
public class Usuario extends GenericDomain {
	
	/**
	 *   senha com tamanho 32 pois esta variavel manipulará HASH MD5
	 */
	@Column(length = 32 , nullable = false)
	private String senha; 
	
	//definido sem tamanho colocara no banco tamanho defalt 1
	@Column(nullable= false)
	private Character tipo ;  // A-Administrador ,  B - Balconista
	
    
	@Column(nullable = false)
	private Boolean ativo ;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa ;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
	

}
