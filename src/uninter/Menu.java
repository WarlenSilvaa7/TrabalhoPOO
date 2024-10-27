package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	 	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}




	public void exibirOpcoes() {
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		
		String opcaoSelecionada = sc.next();
		System.out.println(opcaoSelecionada);
	//utilizando switch para verificar a opção selecionada
		switch (opcaoSelecionada) {
		
		case "0":
			System.out.println("Sistema Finalizado!");
			break;
			
		case "1":
			exibirSubMenuAdicionar();
			exibirOpcoes();
			
			break;
			
		case "2":
			exibirSubMenuRemover();
			exibirOpcoes();
			
			break;
			
		case "3":
			cofrinho.listagemMoedas();
			exibirOpcoes();
			
			break;
		
		case "4":
			//formatando e transformando o total convertido de double para string
			double valorTotalConvertido = cofrinho.totalConvertido();
			String valorStringTotalConvertido = String.format("%.2f",valorTotalConvertido);
			valorStringTotalConvertido = valorStringTotalConvertido.replace(".", ",");
			System.out.println("O valor total convertido para real?" + valorStringTotalConvertido);
			
		default:
			System.out.println("Opcao Invalida");
			exibirOpcoes();
		}
	}
	//método para adicionar moedas
	private void exibirSubMenuAdicionar() {
		System.out.println("Escolha Moeda:");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		int moedaEscolhida = sc.nextInt();
		System.out.println("Digite o valor:");
		String moedaStringValor = sc.next();
		//substituindo a "," por "." e transformando em double
		moedaStringValor = moedaStringValor.replace(",", ".");
		double moedaDoubleValor = Double.valueOf(moedaStringValor);
		
		//conferindo a moeda escolhida
		Moeda moeda = null;
		
		if (moedaEscolhida == 1) {
				moeda = new Real(moedaDoubleValor);
		} else if (moedaEscolhida == 2) {
			 	moeda = new Dolar(moedaDoubleValor);

		} else if (moedaEscolhida == 3) {
				moeda = new Euro(moedaDoubleValor);

		} else {
			System.out.println("Opção de Moeda inválida!");
			exibirOpcoes();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda Adicionada!");
	}
	
	//método para remover moedas
	private void exibirSubMenuRemover() {
		System.out.println("Escolha Moeda:");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		int moedaEscolhida = sc.nextInt();
		System.out.println("Digite o valor:");
		String moedaStringValor = sc.next();
		moedaStringValor = moedaStringValor.replace(",", ".");
		double moedaDoubleValor = Double.valueOf(moedaStringValor);
		
		Moeda moeda = null;
		
		if (moedaEscolhida == 1) {
				moeda = new Real(moedaDoubleValor);
		} else if (moedaEscolhida == 2) {
			 	moeda = new Dolar(moedaDoubleValor);

		} else if (moedaEscolhida == 3) {
				moeda = new Euro(moedaDoubleValor);

		} else {
			System.out.println("Opção de Moeda inválida!");
			exibirOpcoes();
		}
		
		cofrinho.remover(moeda);
	}
	
	
}
