package app.renatafloro.desafio;

/**
 * D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a 
 * senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os 
 * seguintes crit�rios
 * 
 * D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza 
 * se � uma senha forte. Para ajudar D�bora, <u>construa um algoritmo que informe qual 
 * � o n�mero m�nimo de caracteres que devem ser adicionados para uma string qualquer ser 
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
