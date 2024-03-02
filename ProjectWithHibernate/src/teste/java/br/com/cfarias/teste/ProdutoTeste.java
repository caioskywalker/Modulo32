package br.com.cfarias.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.hibernate.annotations.common.AssertionFailure;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.cfarias.dao.Iproduto;
import br.com.cfarias.dao.ProdutoDao;
import br.com.cfarias.domain.Produto;

public class ProdutoTeste {
	
	Iproduto produtoDao;
	
	
	public ProdutoTeste() {
		
		produtoDao = new ProdutoDao();
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Test
	@Before
	public void cadastrarProduto() {
		
		Produto produto;
		produto = new Produto();
		produto.setCodigo(5615l);
		produto.setDescricao("Batata lisa");
		produto.setNome("Batata");
		produto.setMarca("Da terra");
		produto.setValor("2.55d");
		
		assertNotNull(produtoDao.cadastrar(produto));
		
	}
	
	@Test
	public void buscarProduto() {
		
		assertNotNull(produtoDao.buscarProduto(5615l));
	}
	
	
	@Test
	@After
	public void removerProdutoTeste() {

		assertTrue(produtoDao.removerProduto(5615l));
		//Por algum motivo dá erro no teste, mas deleta o objeto no banco de dados normalmente
	
		
	}

}
