package br.pro.delphino.drogaria.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();

    
	private static SessionFactory criarFabricaDeSessoes(){
		
		try {
			Configuration configuracao = new Configuration().configure() ;
			
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			
			return fabrica ;
			
		} catch (Throwable ex) {
			System.out.println("A fabrica de Sessao não pode ser criada." + ex );
		    throw new ExceptionInInitializerError(ex);
		   
		}
	}
	
	
	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}

}
