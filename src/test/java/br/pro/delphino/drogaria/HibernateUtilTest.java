package br.pro.delphino.drogaria;

import org.hibernate.Session;
import org.junit.Test;

import br.pro.delphino.drogaria.util.HibernateUtil;

public class HibernateUtilTest {
   
	@Test
	public void conectar(){
		Session sessao =	HibernateUtil.getFabricaDeSessoes().getCurrentSession();	   
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();   
	   
   }
	 
}
