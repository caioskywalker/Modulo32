package br.com.cfarias.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto1_seq")
	@SequenceGenerator(name="produto1_seq", sequenceName="sq_produto1", initialValue = 1, allocationSize = 1)
	private Long id;
	@Column(name = "CODIGO" , nullable = false , unique = true ,length = 10)
	private Long codigo;
	@Column(name = "NOME" , nullable = false , length = 50)
	private String nome;
	@Column(name = "DESCRICAO" , nullable = true , length = 100)
	private String descricao;
	@Column(name = "VALOR" , nullable = false , length = 100)
	private String valor;
	@Column(name = "MARCA" , nullable = true , length = 100)
	private String marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
