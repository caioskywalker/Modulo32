package br.com.cfarias.domain;

import java.time.Instant;

import javax.persistence.*;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "matricula_seq")
	@SequenceGenerator(name = "matricula_seq", sequenceName = "seq_matricula", initialValue = 1, allocationSize = 1  )
	private long id;
	
	@Column(name = "CODIGO" , nullable = false , unique = true ,length = 10)
	private String codigo;
	
	@Column(name = "DATA_MATRICULA", nullable = false)
	private Instant dataMatricula;
	
	@Column(name = "VALOR", nullable = false)
	private Double valor;
	
	@Column(name = "Status", nullable = false)
	private String Status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Instant getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Instant dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	

}
