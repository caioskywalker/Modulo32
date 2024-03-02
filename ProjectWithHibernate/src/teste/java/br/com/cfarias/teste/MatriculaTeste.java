package br.com.cfarias.teste;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.cfarias.dao.IMatriculaDao;
import br.com.cfarias.dao.MatriculaDao;
import br.com.cfarias.domain.Matricula;

public class MatriculaTeste {
	
	private IMatriculaDao matriculaDao;
	Matricula mat = new Matricula();
	
	public MatriculaTeste() {
		matriculaDao = new MatriculaDao();
		
	}
	
	@Before
	@Test
	public void cadastrar() {
		
		
		mat.setDataMatricula(Instant.now());
		mat.setCodigo("A8");
		mat.setStatus("Ativa");
		mat.setValor(2000d);
		
		Matricula result = matriculaDao.cadastrar(mat);
		
		assertNotNull(result);
		
		
	}
	
	@After
	@Test
	public void excluirTeste() {
		
		
		boolean bol = matriculaDao.excluir(mat);
		assertTrue(bol);
		
		
		
		
		
	}
	@Test
	public void buscarMatriculaTeste() {
		
		Matricula mat1 = matriculaDao.buscarMatricula("A8");
		
		assertNotNull(mat1);
		
		
	}

}
