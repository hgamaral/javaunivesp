/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos usar um metodo para calcular a média dos preços dos materiais.
Para isso iremos utilizar um arranjo (interando um item de cada vez).

Passagem de parametros: por valor - o conteudo de uma determinada regiao da memoria e copiada para outra
por referencia - o conteudo de uma determinada regiao da memoria é copiado para outra

*/

class AreaCasa {

    static double valorM2 = 1500; //valor do metro quadrado
    static double precos[] = {1500,1100,750,500}; //arranjo de double contém 4 posições 
	
    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;


	static double media(double[] arranjo) { 	//metodo resposta que recebe como parametro um arranjo
		double resp = 0;						//inicia com 0
			 for (double valor: arranjo){
				 resp += valor;					//intera cada valor ou seja 0 + primeiro número e divide pelo tamanho do arranjo e assim por diante
			 }
        return(resp/arranjo.length);
    }
	
	//Carrega os valores das piscinas na matriz por materil
	public static void carregaVal(double[][] m){
		for (int i= 0; i<m.length; i++){ //linhas (material)
			for(int j=50; j<=200; j+=50){ //colunas (áreas)
				m[i][j/50 - 1] = precos[i] * j;
				}
			}
		}

    public static void main(String[] args) {

		double [][] valores = new double [4][4];

		System.out.println("A media do preço dos materiais e:" + media(precos));
		
		carregaVal(valores);
		
		for (int i=0; i<valores.length; i++){
			for (int j=0; j<valores[i].length; j++)
				System.out.println(valores[i][j]+ " ");
			System.out.println();
		}
		
		System.out.println("Pisina de plastico de 150m2: " +valores[PLASTICO][2]);
	
    }
}