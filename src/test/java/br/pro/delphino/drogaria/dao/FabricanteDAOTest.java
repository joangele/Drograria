package br.pro.delphino.drogaria.dao;


import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

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
	public void Listar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado =  fabricanteDAO.listar();
		
		System.out.println("Total de Fabricantes Encontrados = " + resultado.size());
		
		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " / " + fabricante.getNome());
		}
		
		
	}	
}

 
