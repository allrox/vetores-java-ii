package aplicacoes;

// Importa��o da classe ArrayList, que constr�i vetores de tamanho vari�vel
// Permite a inser��o de dados em qualquer ponto do vetor
import java.util.ArrayList;

// Importa��o da classe Iterator, que permite acessar sequencialmente ArrayLists
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// Defini��o das vari�veis para realiza��o de swap entre elementos
		String oldItem, newItem;
		
		// Defini��o de vari�veis para o contador do la�o e o �ndice da ArrayList
		int i, index;
		
		/*
		 * Instanciando uma nova ArrayList
		 */
		ArrayList<String> testList = new ArrayList<String>();
		
		/*
		 * La�o para preencher a lista com um n�mero predefinido de itens		
		 */
		for(i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i+1) + "� elemento: ");
			testList.add(scan.nextLine());
		}
		
		// Retorna o tamanho da lista utilizando .size()
		System.out.println("\nN�mero de elementos no grupo: " + testList.size());
		System.out.println("\n>>> Substitui��o de elementos <<<");
		System.out.print("\nAgora escolha um elemento a ser substitu�do: ");
		
		// Captura o objeto a ser manipulado
		oldItem = scan.nextLine();
		
		// Atribui � vari�vel index o �ndice do elemento a ser manipulado
		index = testList.indexOf(oldItem);
		
		System.out.println("O elemento " + testList.get(index) + " ser� substitu�do.");
		System.out.print("Informe o nome do novo elemento: ");
		
		// Atribui � vari�vel newItem o novo conte�do para o elemento
		newItem = scan.nextLine();		
		
		// Insere o conte�do da vari�vel newItem no �ndice informado
		testList.set(index, newItem);
		
		System.out.println("\n>>> Retirada de um elemento do grupo <<<");
		System.out.print("Informe o elemento a ser removido: ");
		
		// Captura o objeto a ser manipulado
		oldItem = scan.next();
		
		// Localiza o elemento informado na lista e identifica seu �ndice
		index = testList.indexOf(oldItem);
		
		// Remove o conte�do do �ndice
		testList.remove(index);
		System.out.println("Composi��o atual do grupo = " + testList.size() + " elementos na lista.");
		System.out.println("\nListando os elementos do grupo: ");
		
		
		/*
		 * Instanciando o Iterator para acessar sequencialmene a ArrayList
		 */
		Iterator<String> iterator = testList.iterator();
		i = 0;
		
		/**
		 * Enquanto o Iterator contiver um pr�ximo item, 
		 * exibir as informa��es e incrementar o contador
		 */
		while(iterator.hasNext()) {
			System.out.println("Componente " + iterator.next() + " no �ndice [" + i + "]");
			i++;
		}
		
		System.out.println("\n...Limpando a ArrayList");
		
		// Esvazia a ArrayList com .clear()
		testList.clear();
		System.out.println("\nN�mero de elementos no grupo: " + testList.size() + " Lista vazia.");

		scan.close();
		
	}

}
