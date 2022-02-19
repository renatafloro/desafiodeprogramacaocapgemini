package app.renatafloro.desafio;

/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * 
 * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não 
 * deve conter nenhum espaço.
 * 
 * @author Renata Floro
 *
 */
public class Escada {

	// Método main
	public static void main(String[] args) {

		int n = 6;
		int x = n;

		// Laço para percorrer as linhas
		for (int linha = 0; linha < n; linha++) {
			// Controla quantos espaços terá por linha
			x--;

			// Laço para percorrer as colunas
			for (int coluna = 0; coluna < n; coluna++) {
				if (coluna >= x) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Quebra de linha
			System.out.println();
		}
	}
}
