package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer id;
	private String nome;
	private Double valorUnitario;
	private Date dataValidade;
	private Integer quantidade;
	
	public Produto(Integer id, String nome, Double valorUnitario, Date dataValidade, Integer quantidade) {
		this.id = id;
		this.nome = nome;
		this.valorUnitario = valorUnitario;
		this.dataValidade = dataValidade;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "\n Produto [id=" + id + ", nome=" + nome + ", valorUnitario=" + valorUnitario + ", dataValidade="
				+ sdf.format(dataValidade) + ", quantidade=" + quantidade + "]";
	}
}
