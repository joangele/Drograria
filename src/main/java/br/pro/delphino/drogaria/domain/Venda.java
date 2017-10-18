package br.pro.delphino.drogaria.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * classe responsavel por manter a tabela venda
 * @author joangele
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="venda")
public class Venda extends GenericDomain {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date horario;
	
	/**
	 * paraguardar o somatorio do total de itens vendidos (caso mude o preco de um produto de uma venda
	 * o histórico sera mantido)
	 */
	@Column(nullable = false , precision = 7 , scale = 2 )
	private BigDecimal  precoTotal; 
	
	/**
	 * neste caso trata-se de uma combosição (o cliente nao é obrigatorio numa venda 
	 * a vista e sim somente numa venda aprazo)
	 */
	@ManyToOne	
	private Cliente cliente;
	
	/**
	 * neste caso sera sempre obrigatorio o  preenchimento de um usuario para avenda 
	 */
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	

}
