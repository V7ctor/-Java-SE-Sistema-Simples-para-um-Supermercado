package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Produto;
import Servicos.Compra;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Olá, Seja Bem Vindo ao Sistema de Compras!!!");
				
		try {
			
			System.out.println("Entre com os Dados do Cliente: ");

			System.out.print("Insira o ID: ");
			Integer idCliente = sc.nextInt();
			
			System.out.print("Insira o Nome: ");
			String nomeCliente = sc.next();
			
			System.out.print("Insira o Saldo do Cliente: $");
			Double saldoCliente = sc.nextDouble();
			
			Cliente cliente = new Cliente(idCliente, nomeCliente, saldoCliente);
			
			Compra compra = new Compra(1, cliente);

			System.out.println("------------------------------------------------");
			
			System.out.print("Quantos Produtos deseja Comprar: ");
			Integer quantidade = sc.nextInt();
			
			for (int i = 1; i <= quantidade; i++) {
				
				System.out.println("Insira Dados do " + i + "° Produto: ");
				
				System.out.print("Insira o Id do Produto: ");
				Integer idProduto = sc.nextInt();
				
				System.out.print("Insira o Nome do Produto: ");
				String nomeProduto = sc.next();
				
				System.out.print("Insira o valor do Produto: $");
				Double valorProduto = sc.nextDouble();
				
				System.out.println("Insira a Data de Validade do Produto: (dd/MM/AAAA)");
				Date dataValidade = sdf.parse(sc.next());
				
				System.out.print("Insira a Quantidade desse Produto: ");
				Integer quantidadeProduto = sc.nextInt();
				
				compra.adicionarProduto(new Produto(idProduto, nomeProduto, valorProduto, dataValidade, quantidadeProduto));
				
			}
			
			System.out.println(compra.toString());
			
			compra.realizarPagamento();
			
		} catch (ParseException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Erro: Dado Inválido!!");
		} finally {
			sc.close();
		}
	}
	
}
