package br.pro.delphino.drogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author joangele
 * Classe responsavel por implementar um ID generico projeto WEB 2 Delphino 
 * observação: superclasse nao grava em tabela no hibernate serve apenas para deixar generica a geracao de chave primario de 
 * tabelas que dela herdar
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable {
	
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo ;

	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	

}
