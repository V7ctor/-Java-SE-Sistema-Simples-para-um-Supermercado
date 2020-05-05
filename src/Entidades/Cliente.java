package Entidades;

public class Cliente {

	private Integer id;
	private String nome;
	private Double saldo;
	
	public Cliente(Integer id, String nome, Double saldo) {
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
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

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
}
