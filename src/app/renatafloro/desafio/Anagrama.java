package app.renatafloro.desafio;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras 
 * de uma palavra podem ser realocadas para formar a outra palavra. Dada uma 
 * string qualquer, desenvolva um algoritmo que encontre o número de pares 
 * de substrings que são anagramas.
 * 
 * @author Renata Floro
 *
 */
public class Anagrama {

	public static void main(String[] args) {
		
		String palavra = "renata";
		
		contarAnagramas(palavra);
		
	}
	
	/**
	 * Método para contas a quantidade de anagramas
	 * @param palavra
	 */
	static void contarAnagramas(String palavra){
		
		// Lista de substrings dos para comparar a ocorrência dos anagramas
        HashMap<String, Integer> listaAnagramas = new HashMap<>();
  
        // Laços para percorrer cada caractere da palavra formando substrings ou verificando se há ocorrências
        for(int index1 = 0; index1 < palavra.length(); index1++){
            for(int index2 = index1; index2 < palavra.length(); index2++){
            	
            	// Armazena as substrings como arrays de char
                char[] valC = palavra.substring(index1, index2+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
        
                // Se já existir um anagrama substitui o value
                if (listaAnagramas.containsKey(val)) {
                    listaAnagramas.put(val, listaAnagramas.get(val)+1);
                }
                else { 
                    listaAnagramas.put(val, 1);
                }
            }
        }
        
        int quantidadePares = 0;
        
        // Realiza a contagem a partir da lista de anagramas
        for(String key: listaAnagramas.keySet()){
            int n = listaAnagramas.get(key);
            quantidadePares += (n * (n-1))/2;
        }
        
        System.out.println(quantidadePares);
    }
}

