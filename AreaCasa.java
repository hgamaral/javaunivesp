/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos usar uma matriz que apresenta desconto nos materiais
Criação de uma nova matriz que apresente os descontos para cada material
pFinal[i][j] = preco[i][j] * (1-desconto[i][j]);
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
		
	/* Retorna matriz com os precos finais.
		Parametros:
			val - matriz de valores;
			desc - matriz de descontos
			saida - matriz de resposta
	*/
	
	public static double [][] calculaFinal(double [][] val, double [][]desc){
		double [][] saida = new double[val.length][val[0].length];
			for (int i=0; i<saida.length; i++){
				for (int j=0; j<saida[0].length;j++){
					saida[i][j] = val[i][j]*(1-desc[i][j]);				
				}
			}
		return (saida);
	}

    public static void main(String[] args) {

		double [][] valores = new double [4][4];
		double [][] descontos = {{0,0,0.2,0.2},
								{0.05,0.05,0.1,0.15},
								{0.02,0.04,0.08,0.16},
								{0,0,0,0.05}};
		double [][] pFinal;
		
		carregaVal(valores);
		
		pFinal = calculaFinal(valores, descontos); //matriz marzenada
		
		
		carregaVal(valores);
		System.out.println("A media do preço dos materiais e:" + media(precos));
		
		//for com matriz valores para vizualização de valores
		for (int i=0; i<valores.length; i++){
			for (int j=0; j<valores[i].length; j++)
				System.out.println(valores[i][j]+ " ");
			System.out.println();
		}
		
		//for pFinal para valores com desconto
		for (int i=0; i<pFinal.length; i++){
			for (int j=0; j<pFinal[i].length; j++)
				System.out.println(pFinal[i][j]+ " ");
			System.out.println();
		}
    }
}