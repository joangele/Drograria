package br.pro.delphino.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="item_venda")
public class ItemVenda extends GenericDomain {
	
	@Column(nullable = false)
	private  Short quantidade;
	
	@Column(nullable = false , precision = 6 , scale = 2)
	private  BigDecimal precoParcial;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private  Produto produto ;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private  Venda venda ;

	public Short getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoParcial() {
		return precoParcial;
	}

	public void setPrecoParcial(BigDecimal precoParcial) {
		this.precoParcial = precoParcial;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	

}
