package aplicacao;
import java.util.Scanner;
import classes.*;

public class VetorObjetos {

	public static void main(String[] args) {
		
		/**
		 * Instanciando um novo objeto Scanner
		 */
		Scanner scan = new Scanner(System.in);
		
		/**
		 * Definindo o tamanho do vetor com a entrada do usuário
		 */
		System.out.println("Quantos monitores serão cadastrados?");
		int qtd = Integer.parseInt(scan.nextLine());
		Monitor monitor[] = new Monitor[qtd];
		
		/**
		 * Bloco try and catch para tratamento de exceções
		 */
		try {
			
			/**
			 * Laço para o preenchimento do vetor
			 */
			for(int i=0 ; i < qtd; i++ ) {
				monitor[i] = new Monitor();
				System.out.println("Cadastrando o item n°" + (i+1));
				// Estrutura para aplicar um método de entrada
				// ao vetor na posição 'i' do índice
				monitor[i].entradaDeDados();
			}
			
			/**
			 * Laço para a exibição dos dados do vetor
			 */
			for(int i=0; i<monitor.length; i++) {
				System.out.println("*********************************");
				System.out.println("Exibindo informações do monitor " + (i+1));
				// Estrutura para aplicar um método de impressão
				// ao vetor na posição 'i' do índice
				monitor[i].imprimir();
				System.out.println("**********************************\n");
			}
				
		/**
		 * Tratamento de exceções por condição aritmética ou conversão	
		 */
		} catch ( ArithmeticException excecao ) {
			System.out.println("\nOcorreu uma exceção! " + excecao.getMessage());	
			
		} catch ( NumberFormatException excecao ) {
			System.out.println("\nOcorreu uma exceção! " + excecao.getMessage());
			System.out.println("Entrada de dados inválida. Formato incorreto.");
			
		} finally {
			scan.close();
		}
		
	}

}
