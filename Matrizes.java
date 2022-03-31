/*
A ideia de arranjos de arranjos em que todas as linhas 
tem igual tamanho é conhecido como MATRIZ. Nesse aula iremos
fazer algumas operações com matrizes.

SOMA DE MATRIZES - CORRETO

//1 - condicional if para saber se as linhas da matriz a é diferente da matriz b ou se o numero de colunas da matriz é a é diferente da colunasde b
*/

public class Matrizes {
	
	static double a[][] = {{1500,1100,750,500},{1500,1100,750,500}}; //matriz 1, do tipo double com 4 posicoes 
	static double b[][] = {{1500,1100,750,500},{1500,1100,750,500}};// matriz 2, do tipo double com 4 posicoes
	
	
	static double[][] somaMatrizes(double [][]a, double[][]b){
		if (a.length != b.length || a[0].length != b[0].length){ //1 - se esse problema ocorrer retorna null
			return null;
		}
		else{
			double[][] res = new double[a.length][a[0].length];//matriz resultado que deve ter mesmo numero de linhas e colunas
				for (int i=0; i<res.length; i++){ //i irá iterar nas linhas 
					for (int j=0; j<res[0].length;j++){ //j irá iterar nas colunas
						res[i][j] = a[i][j] + b[i][j]; //na matriz resultado irá ser inserido a respectiva posicão da matriz a e b
					}	
				}
		return res; //escopo restrito - apenas do método
		}
	}
	
	 static void imprimeMatriz(double [][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; i<matriz[i].length; j++){
                System.out.print(matriz [i][j] + " \t | ");   
                }
                    System.out.println();
            }
        }
	
    public static void main(String[] args) {
		
		imprimeMatriz(somaMatrizes(a,a));
	}
}


            double[][] res = new double[a.length][a[0].length];//matriz resultado que deve ter mesmo numero de linhas e colunas
                for (int i=0; i<res.length; i++){ //i irá iterar nas linhas 
                    for (int j=0; j<res[0].length;j++){ //j irá iterar nas colunas
                        res[i][j] = a[i][j] + b[i][j]; //na matriz resultado irá ser inserido a respectiva posicão da matriz a e b
                    }    
                }
        return res; //escopo restrito - apenas do método