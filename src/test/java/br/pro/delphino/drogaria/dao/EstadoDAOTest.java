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
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		System.out.println("Total de registros encontrados = " +  resultado.size());
		for (Estado estado : resultado) {
			 System.out.println(estado.getCodigo() + " / " +   estado.getSigla() + " - " + estado.getNome());
		}

	}

}
