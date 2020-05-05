package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import Entidades.Cliente;
import Entidades.Produto;
import Servicos.Compra;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.CANADA);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Olá, Seja Bem Vindo ao Sistema de Compras!!!");
		
		System.out.println("Entre com os Dados do Cliente: ");
		
		Cliente cliente = new Cliente(1, "Fulano", 7900.0);
		
		Produto produto1 = new Produto(1, "Produto 1", 800.0, sdf.parse("10/09/2022"), 1);
		
		Produto produto2 = new Produto(2, "Produto 2", 1400.0, sdf.parse("15/10/2023"), 9);
		
		Produto produto3 = new Produto(3, "Produto 3", 900.0, sdf.parse("01/08/2020"), 2);
		
		Compra compra = new Compra(1, cliente);
		
		compra.adicionarProduto(produto1);
		compra.adicionarProduto(produto2);
		compra.adicionarProduto(produto3);
		
		System.out.println(compra.toString());
		
		compra.realizarPagamento();
	}
	
}
