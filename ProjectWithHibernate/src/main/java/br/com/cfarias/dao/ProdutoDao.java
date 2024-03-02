package br.com.cfarias.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import br.com.cfarias.domain.Produto;

public class ProdutoDao implements Iproduto {

	@Override
	public Produto cadastrar(Produto produto) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return produto;
	}

	@Override
	public Boolean removerProduto(Long codigo) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		Produto prodRemove = entityManager.merge(buscarProduto(codigo));
		entityManager.remove(prodRemove);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		return true;
		
		
	}

	@Override
	public Produto buscarProduto(Long codigo) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		TypedQuery<Produto> query = entityManager.createQuery("""
				SELECT p FROM Produto p 
				WHERE p.codigo = :codigo
				""", Produto.class);
        query.setParameter("codigo", codigo);
		Produto prod = query.getSingleResult();    
		
		entityManager.close();
		entityManagerFactory.close();
		
		return prod;
        
		
	
	}

}
