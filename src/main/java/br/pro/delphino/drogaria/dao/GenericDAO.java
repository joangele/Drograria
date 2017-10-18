package br.pro.delphino.drogaria.dao;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pro.delphino.drogaria.util.HibernateUtil;

/**
 * implementa u
 * 
 * @author joangele classe generica usando generics do java
 *
 * @param <Entidade>
 * 
 *            entidade sera qualquer tipo de objeto (classe localizado no
 *            domain)
 * 
 *            evita implementacoes comuns repetitivas como salvar incluir
 *            deletar na camada dao
 */
public class GenericDAO<Entidade> {

	private Class<Entidade> classe;

	/**
	 * este codigo serve para que a classe generica permita a pesquisa na classe
	 * ela permite pegar o nome da classe(classe ) para permitir a pesquisa no
	 * genericDAO (a referencia a classe principal passada genericamente)
	 */
	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public void salvar(Entidade entidade) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = session.beginTransaction();
			session.save(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {

			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;

		} finally {
			session.close();

		}

	}

	public List<Entidade> listar() {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = session.createCriteria(classe) ; 
			List<Entidade> resultado = consulta.list();
			return resultado;

		} catch (RuntimeException erro) {
			throw erro;
		}finally {
			session.close();
		}

	}

}
