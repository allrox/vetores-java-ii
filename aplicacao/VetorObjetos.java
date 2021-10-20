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
		 * Definindo o tamanho do vetor com a entrada do usu�rio
		 */
		System.out.println("Quantos monitores ser�o cadastrados?");
		int qtd = Integer.parseInt(scan.nextLine());
		Monitor monitor[] = new Monitor[qtd];
		
		/**
		 * Bloco try and catch para tratamento de exce��es
		 */
		try {
			
			/**
			 * La�o para o preenchimento do vetor
			 */
			for(int i=0 ; i < qtd; i++ ) {
				monitor[i] = new Monitor();
				System.out.println("Cadastrando o item n�" + (i+1));
				// Estrutura para aplicar um m�todo de entrada
				// ao vetor na posi��o 'i' do �ndice
				monitor[i].entradaDeDados();
			}
			
			/**
			 * La�o para a exibi��o dos dados do vetor
			 */
			for(int i=0; i<monitor.length; i++) {
				System.out.println("*********************************");
				System.out.println("Exibindo informa��es do monitor " + (i+1));
				// Estrutura para aplicar um m�todo de impress�o
				// ao vetor na posi��o 'i' do �ndice
				monitor[i].imprimir();
				System.out.println("**********************************\n");
			}
				
		/**
		 * Tratamento de exce��es por condi��o aritm�tica ou convers�o	
		 */
		} catch ( ArithmeticException excecao ) {
			System.out.println("\nOcorreu uma exce��o! " + excecao.getMessage());	
			
		} catch ( NumberFormatException excecao ) {
			System.out.println("\nOcorreu uma exce��o! " + excecao.getMessage());
			System.out.println("Entrada de dados inv�lida. Formato incorreto.");
			
		} finally {
			scan.close();
		}
		
	}

}
