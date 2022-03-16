/*
Uma variavel char nada mais é que um inteiro que corresponde a um caractere
UNICODE

ponto de atenção - codigo 0 é diferente de valor 0;
ponto de atenção - um arranjo de caracteres forma uma STRING

Maneiras possiveis de se atribuir valores a caracteres
https://unicodetable.archive.thomasorlita.com/ - tabela unicode COMPLETA


char c = 'o'; 		- variavel c do tipo caracteres recebe o valor entre aspas
char x = '\u00F6'; 	- faz mapeamento da tabela UNICODE
int y = 246;		- "utiliza-se um recurso para interpretar um int como um char
O nome atribuito a essa interpretação é TypeCasting

*/


public class Char {

    public static void main(String[] args) {
		char c = 'o'; 	
		char x = '\u00F6'; 	
		int y = 246;
		
		int a = (int)3.46;
		int b = 97; 
		
		System.out.println(c);
		System.out.println(x);
		System.out.println((char)y);
		
		System.out.println(a);
		System.out.println((char)b);
		
		//TypeCasting para inspeção da Tabela Asci
		//i irá varia de 97 a 122, sempre fazendo um incremento posterior, interpretando o valor como char.
		
		for(int i = 97; i<= 122; i++){
			System.out.println(i+ " corresponde a letra "+(char)i);
		}
		
	}
}