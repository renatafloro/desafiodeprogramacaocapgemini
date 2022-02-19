package app.renatafloro.desafio;

/**
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a 
 * senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os 
 * seguintes critérios
 * 
 * Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza 
 * se é uma senha forte. Para ajudar Débora, <u>construa um algoritmo que informe qual 
 * é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser 
 * considerada segura</u>.
 * 
 * @author Renata Floro
 *
 */
public class PasswordValidation {

	public static void main(String args[]) {
		String password = "Ya3";

		int tamMinimo = 6;
		if (password.length() < tamMinimo) {
			System.out.println(tamMinimo - password.length());
		}
	}
}
