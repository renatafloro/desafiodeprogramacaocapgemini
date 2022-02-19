package app.renatafloro.desafio;

/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * 
 * e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o 
 * deve conter nenhum espa�o.
 * 
 * @author Renata Floro
 *
 */
public class Escada {

	// M�todo main
	public static void main(String[] args) {

		int n = 6;
		int x = n;

		// La�o para percorrer as linhas
		for (int linha = 0; linha < n; linha++) {
			// Controla quantos espa�os ter� por linha
			x--;

			// La�o para percorrer as colunas
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
