package br.com.cfarias.dao;

import br.com.cfarias.domain.Produto;

public interface Iproduto {

	Produto cadastrar(Produto produto);

	Boolean removerProduto(Long codigo);

	Produto buscarProduto(Long codigo);

}
