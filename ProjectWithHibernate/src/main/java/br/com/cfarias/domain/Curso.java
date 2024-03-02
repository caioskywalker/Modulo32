package br.com.cfarias.domain;

import javax.persistence.*;


@Entity
@Table(name = "TB_CURSO")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curso_seq")
	@SequenceGenerator(name="curso_seq", sequenceName="sq_curso", initialValue = 1, allocationSize = 1)
	private Long id;
	//Geração automática da sequence da id no banco de dados, inicia em 1 e incrementa de 1 em 1;
	
	@Column(name = "CODIGO" , nullable = false , unique = true ,length = 10)
	private String codigo;
	
	@Column(name = "NOME" , nullable = false , length = 50)
	private String nome;
	
	@Column(name = "DESCRICAO" , nullable = true , length = 100)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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
	
	

}
