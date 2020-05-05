package Servicos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.Cliente;
import Entidades.Produto;

public class Compra {
	
	private SimpleDateFormat sdf = new SimpleDateFormat();

	private Integer id;
	private Date dataCompra;
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();

	
	public Compra(Integer id, Cliente cliente) {
		this.id = id;
		this.dataCompra = new Date();
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public Date getDataCompra() {
		return dataCompra;
	}	

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}

	public Double valorCompra() {
		
		double somatoria = 0.0;
		
		for (Produto p : produtos) {
			somatoria += p.getValorUnitario() * p.getQuantidade();
		}
	
		return somatoria;
	}
	
	public void realizarPagamento() {
		
		System.out.println("O Valor da Compra é de $" + String.format("%.2f", valorCompra()));
		System.out.println("O  Valor do Saldo que o Cliente Emitiu é de $"+ String.format("%.2f", cliente.getSaldo()));
		
		if (valorCompra() > cliente.getSaldo()) {
			System.out.println("Infelizmente não foi Possível efetuar o pagamento pois o cliente ficou devendo $" 
		+ String.format("%.2f", troco()).replace('-', ' '));
			
		} else if (valorCompra() < cliente.getSaldo()) {
			System.out.println("Compra Efetuada com Sucesso!!! Troco $" + String.format("%.2f", troco()));
		}
	}
	
	private Double troco() {
		return valorCompra() - cliente.getSaldo();
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + "\n dataCompra=" + sdf.format(dataCompra) + 
				"\n cliente=" + cliente + "\n produtos=" + produtos + "\n"
				+ "]";
	}
	
	
}
