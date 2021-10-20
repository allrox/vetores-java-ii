package aplicacoes;

// Importação da classe ArrayList, que constrói vetores de tamanho variável
// Permite a inserção de dados em qualquer ponto do vetor
import java.util.ArrayList;

// Importação da classe Iterator, que permite acessar sequencialmente ArrayLists
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// Definição das variáveis para realização de swap entre elementos
		String oldItem, newItem;
		
		// Definição de variáveis para o contador do laço e o índice da ArrayList
		int i, index;
		
		/*
		 * Instanciando uma nova ArrayList
		 */
		ArrayList<String> testList = new ArrayList<String>();
		
		/*
		 * Laço para preencher a lista com um número predefinido de itens		
		 */
		for(i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i+1) + "º elemento: ");
			testList.add(scan.nextLine());
		}
		
		// Retorna o tamanho da lista utilizando .size()
		System.out.println("\nNúmero de elementos no grupo: " + testList.size());
		System.out.println("\n>>> Substituição de elementos <<<");
		System.out.print("\nAgora escolha um elemento a ser substituído: ");
		
		// Captura o objeto a ser manipulado
		oldItem = scan.nextLine();
		
		// Atribui à variável index o índice do elemento a ser manipulado
		index = testList.indexOf(oldItem);
		
		System.out.println("O elemento " + testList.get(index) + " será substituído.");
		System.out.print("Informe o nome do novo elemento: ");
		
		// Atribui à variável newItem o novo conteúdo para o elemento
		newItem = scan.nextLine();		
		
		// Insere o conteúdo da variável newItem no índice informado
		testList.set(index, newItem);
		
		System.out.println("\n>>> Retirada de um elemento do grupo <<<");
		System.out.print("Informe o elemento a ser removido: ");
		
		// Captura o objeto a ser manipulado
		oldItem = scan.next();
		
		// Localiza o elemento informado na lista e identifica seu índice
		index = testList.indexOf(oldItem);
		
		// Remove o conteúdo do índice
		testList.remove(index);
		System.out.println("Composição atual do grupo = " + testList.size() + " elementos na lista.");
		System.out.println("\nListando os elementos do grupo: ");
		
		
		/*
		 * Instanciando o Iterator para acessar sequencialmene a ArrayList
		 */
		Iterator<String> iterator = testList.iterator();
		i = 0;
		
		/**
		 * Enquanto o Iterator contiver um próximo item, 
		 * exibir as informações e incrementar o contador
		 */
		while(iterator.hasNext()) {
			System.out.println("Componente " + iterator.next() + " no índice [" + i + "]");
			i++;
		}
		
		System.out.println("\n...Limpando a ArrayList");
		
		// Esvazia a ArrayList com .clear()
		testList.clear();
		System.out.println("\nNúmero de elementos no grupo: " + testList.size() + " Lista vazia.");

		scan.close();
		
	}

}
