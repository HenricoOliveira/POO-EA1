import java.util.Scanner;

public class Cinema {
	public static void main(String[] args) {
		Menu cinema = new Menu();
		Scanner entrada = new Scanner(System.in);
		
		String[] filmes = {"Homem-Aranha 2","Scott Pilgrim contra o Mundo","Jogos Vorazes"};
		String[] sessoes = {"14h","16h","18h"};
		int[] ingressos = {32,16};
		
		System.out.println("Escolha um filme");
		cinema.menuFilme();
		
		String filmeEscolhido = "null";
		while(filmeEscolhido.equals("null")) {
			int filme = entrada.nextInt();
			if(filme == 1) {
				filmeEscolhido = filmes[0];
			}else if(filme == 2) {
				filmeEscolhido = filmes[1];
			}else if(filme == 3) {
				filmeEscolhido = filmes[2];
			}else {
				System.out.println("Resposta inválida, digite novamente");
			}
		}
		
		System.out.println("Escolha uma sessão");
		cinema.menuSessao();
		
		String sessaoEscolhida = "null";
		while(sessaoEscolhida.equals("null")) {
			int sessao = entrada.nextInt();
			if(sessao == 1) {
				sessaoEscolhida = sessoes[0];
			}else if(sessao == 2) {
				sessaoEscolhida = sessoes[1];
			}else if(sessao == 3) {
				sessaoEscolhida = sessoes[2];
			}else {
				System.out.println("Resposta inválida, digite novamente");
			}
		}
		
		System.out.println("Escolha o tipo de ingresso");
		cinema.menuIngresso();
		
		String ingressoTipo = "null";
		int ingressoEscolhido = 0;
		while(ingressoEscolhido == 0) {
			int ingresso = entrada.nextInt();
			if(ingresso == 1) {
				ingressoEscolhido = ingressos[0];
				ingressoTipo = "Inteira - R$32";
			}else if(ingresso == 2) {
				ingressoEscolhido = ingressos[1];
				ingressoTipo = "Meia - R$16";
			}else {
				System.out.println("Resposta inválida, digite novamente");
			}
		}
		System.out.println("Digite quantos ingressos");
		int quantidade = entrada.nextInt();
		int valor = quantidade * ingressoEscolhido;
		
		System.out.println("-----Relatório-----\n");
		System.out.println("Filme: " + filmeEscolhido);
		System.out.println("Sessão: " + sessaoEscolhida);
		System.out.println("Ingresso: " + ingressoTipo);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Valor a pagar: R$" + valor);
		System.out.println("\nTenha um bom filme!");
		
		
		
		
		
		


	}

}
