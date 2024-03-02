package br.com.cfarias.dao;

import br.com.cfarias.domain.Matricula;

public interface IMatriculaDao {
	
	Matricula cadastrar(Matricula matricula);

	boolean excluir(Matricula mat);

	Matricula buscarMatricula(String codigo);

}
