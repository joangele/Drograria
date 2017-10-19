package br.pro.delphino.drogaria.dao;


import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delphino.drogaria.domain.Estado;
import br.pro.delphino.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
    @Ignore
	public void salvar() {
	  Fabricante fabricante = new Fabricante();
	  fabricante.setNome("Farmalogus");
	  
	  FabricanteDAO fabricanteDAO = new FabricanteDAO();
	  fabricanteDAO.salvar(fabricante);
	}

	@Test
	@Ignore
	public void Listar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado =  fabricanteDAO.listar();
		
		System.out.println("Total de Fabricantes Encontrados = " + resultado.size());
		
		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " / " + fabricante.getNome());
		}
		
		
	}	
	
	    @Test
	    @Ignore
	    public void buscar() {
			
	    	//coloca o L apos a variavel do tiolong senao o  java acha que é inteiro
	    	Long codigo = 2L ;    	
	    	FabricanteDAO fabricanteDAO = new FabricanteDAO();    	
	    	Fabricante fabricante = fabricanteDAO.buscar(codigo);
	    	
	    	
	    	if (fabricante == null) {
			  System.out.println("Nenhum registro encontrado");	
			} else {
			  System.out.println("Registro encontrado");	
	    	  System.out.println(fabricante.getCodigo() + " / " +   fabricante.getNome());
			}
		}
	    
	    @Test
	    @Ignore
	    public void excluir(){
	    	
	    	//coloca o L apos a variavel do tiolong senao o  java acha que é inteiro
	    	Long codigo = 2L ;    	
	    	FabricanteDAO fabricanteDAO = new FabricanteDAO();    	
	    	Fabricante fabricante = fabricanteDAO.buscar(codigo);   
	    	
	    	if (fabricante == null) {
				System.out.println("Nenhum Registro Encontrado");
			}else 
			{
				fabricanteDAO.excluir(fabricante);  
				System.out.println("Registro Excluido com sucesso!"); 
				System.out.println(fabricante.getCodigo() + " / " +   fabricante.getNome());
			}
	    	   
	    	
	    }
	    
	    @Test
	    	
	    public void editar(){
	    	//coloca o L apos a variavel do tiolong senao o  java acha que é inteiro
	    	Long codigo = 1L ;    	
	    	FabricanteDAO fabricanteDAO = new FabricanteDAO();    	
	    	Fabricante fabricante = fabricanteDAO.buscar(codigo);   
	    	
	    	if (fabricante == null) {
				System.out.println("registro nao existe");
			} else {
	    	
				System.out.println("Registro Editado Antes:");
				System.out.println(fabricante.getCodigo() + " / " +   fabricante.getNome() );
		    	fabricante.setNome("Farmalogus SG");
		    	  	
		    	fabricanteDAO.editar(fabricante);
		    	System.out.println("Registro Editado Depois:");
		    	System.out.println(fabricante.getCodigo() + " / " +   fabricante.getNome());
		    	
			}
	    	
	    }
	
   	
}

 
