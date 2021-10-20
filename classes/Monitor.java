package classes;
import java.util.Scanner;

public class Monitor {
	private String resolucao;
	private double preco;
	private int polegadas, voltagem;
	
	/**
	 * Setter Resolução
	 * @param resolucao
	 */
	public void setResolucao(String resolucao) {
		if(!resolucao.isEmpty()) {
			this.resolucao = resolucao + " ";
		}
	}
	
	/**
	 * Getter Resolução
	 * @return
	 */
	public String getResolucao() {
		return resolucao;
	}
	
	/**
	 * Setter Preço
	 * @param preco
	 */
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}
	}
	
	/**
	 * Getter Preço
	 * @return
	 */
	public double getPreco() {
		return preco;
	}
	
	/**
	 * Setter Polegadas
	 * @param polegadas
	 */
	public void setPolegadas(int polegadas) {
		if(polegadas > 0) {
			this.polegadas = polegadas;
		}
	}
	
	/**
	 * Getter Polegadas
	 * @return
	 */
	public int getPolegadas() {
		return polegadas;
	}
	
	/**
	 * Setter Voltagem
	 * @param voltagem
	 */
	public void setVoltagem(int voltagem) {
		if(voltagem > 0) {
			this.voltagem = voltagem;
		}
	}
	
	/**
	 * Getter Voltagem
	 * @return
	 */
	public int getVoltagem() {
		return voltagem;
	}
	
	/*
	 * Este exemplo conta com um construtor vazio e outro com o corpo 
	 * definindo as variáveis utilizadas. Assim é possível chamar o construtor 
	 * vazio para instanciar um novo objeto na array
	 */
	public Monitor() {
		
	}
	
	/**
	 * Construtor com os parâmetros
	 * @param resolucao
	 * @param preco
	 * @param polegadas
	 * @param voltagem
	 */
	public Monitor(String resolucao, double preco, int polegadas, int voltagem) {
		setResolucao(resolucao);
		setPreco(preco);
		setPolegadas(polegadas);
		setVoltagem(voltagem);
	}
	
	/**
	 * Método para cadastro
	 * @param resolucao
	 * @param preco
	 * @param polegadas
	 * @param voltagem
	 */
	public void cadastrar(String resolucao, double preco, int polegadas, int voltagem) {
		setResolucao(resolucao);
		setPreco(preco);
		setPolegadas(polegadas);
		setVoltagem(voltagem);
	}
	
	/**
	 * Método para entrada de dados
	 */
	public void entradaDeDados() {
		// SupressWarnings resolve o aviso de erro 
		// gerado ao não encerrar o uso da classe Scanner
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a resolução:");
		setResolucao(scan.next());
		System.out.print("Informe o preço:");
		setPreco(Double.parseDouble(scan.next()));
		System.out.print("Informe o tamanho da tela em polegadas:");
		setPolegadas(Integer.parseInt(scan.next()));
		System.out.print("Informe a voltagem:");
		setVoltagem(Integer.parseInt(scan.next()));
		System.out.println("\n");
	}

	/**
	 * Método para exibição
	 */
	public void imprimir() {
		System.out.println("Resolução:\t" + getResolucao());
		System.out.println("Preço:\t\tR$ " + getPreco());
		System.out.println("Polegadas:\t" + getPolegadas());
		System.out.println("Voltagem:\t" + getVoltagem());
	}

}
