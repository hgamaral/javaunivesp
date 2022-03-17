/*
Arranjos de Arranjos
No arranjo de arranjos temos espaços de memoria alocados para guardar cada um dos arranjos
No exemplo abaixo temos 3 arranjos, ouro, cobre e prata.
TEm se um endereço de memoria maior, divido em 3 partes,e cada uma dessas partes quarda um
desses arranjos
*/

public class Arranjos2 {
	
	static char[][]nomes = { 
		{'o','u','r','o'},
		{'c','o','b','r','e'},
		{'p','r','a','t','a'}
	};

    public static void main(String[] args) {

		System.out.println(nomes[1]); //ira imprimir o arranjo na posicao 1 cobre
		System.out.println(nomes[1][2]); // ira imprimir a letra b, 3 caractere de cobre
		System.out.println(nomes.length);
		System.out.println(nomes[0].length);
		
		for (int i = 0; i<=2; i++){
			System.out.println( "na posicao" +i+ " temos "+nomes[i].length+"caracteres");
				//System.out.println(i+ " corresponde ao tamanho da palavra ");
		}
		System.out.println();
		System.out.println();
		
		for (char[] nome:nomes){ //nome é uma variavel do tipo caractere
			System.out.println( "na segunda posicao temos o caractere " +nome[1]);
		}
	}
}