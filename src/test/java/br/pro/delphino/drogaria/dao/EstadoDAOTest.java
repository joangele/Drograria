package br.pro.delphino.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delphino.drogaria.domain.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");
		EstadoDAO dao = new EstadoDAO();
		dao.salvar(estado);

	}
    @Test 
    @Ignore
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		System.out.println("Total de registros encontrados = " +  resultado.size());
		for (Estado estado : resultado) {
			 System.out.println(estado.getCodigo() + " / " +   estado.getSigla() + " - " + estado.getNome());
		}

	}
    
    @Test
    @Ignore
    public void buscar() {
		
    	//coloca o L apos a variavel do tiolong senao o  java acha que é inteiro
    	Long codigo = 2L ;    	
    	EstadoDAO estadoDAO = new EstadoDAO();    	
    	Estado estado = estadoDAO.buscar(codigo);
    	
    	
    	if (estado == null) {
		  System.out.println("Nenhum registro encontrado");	
		} else {
		  System.out.println("Registro encontrado");	
    	  System.out.println(estado.getCodigo() + " / " +   estado.getSigla() + " - " + estado.getNome());
		}
	}
    
    @Test
    @Ignore
    public void excluir(){
    	
    	//coloca o L apos a variavel do tiolong senao o  java acha que é inteiro
    	Long codigo = 4L ;    	
    	EstadoDAO estadoDAO = new EstadoDAO();    	
    	Estado estado = estadoDAO.buscar(codigo);   
    	
    	if (estado == null) {
			System.out.println("Nenhum Registro Encontrado");
		}else 
		{
			estadoDAO.excluir(estado);  
			System.out.println("Registro Excluido com sucesso!"); 
			System.out.println(estado.getCodigo() + " / " +   estado.getSigla() + " - " + estado.getNome());
		}
    	   
    	
    }
    
    @Test
    public void editar(){
    	//coloca o L apos a variavel do tiolong senao o  java acha que é inteiro
    	Long codigo = 8L ;    	
    	EstadoDAO estadoDAO = new EstadoDAO();    	
    	Estado estado = estadoDAO.buscar(codigo);   
    	
    	if (estado == null) {
			System.out.println("registro nao existe");
		} else {
    	
			System.out.println("Registro Editado Antes:");
			System.out.println(estado.getCodigo() + " / " +   estado.getSigla() + " - " + estado.getNome());
	    	estado.setSigla("MG");
	    	estado.setNome("Minas");	    	
	    	estadoDAO.editar(estado);
	    	System.out.println("Registro Editado Depois:");
	    	System.out.println(estado.getCodigo() + " / " +   estado.getSigla() + " - " + estado.getNome());
	    	
		}
    	
    }

}
