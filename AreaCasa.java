/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos usar um metodo para calcular a média dos preços dos materiais.
Para isso iremos utilizar um arranjo (interando um item de cada vez).

Passagem de parametros: por valor - o conteudo de uma determinada regiao da memoria e copiada para outra
por referencia - o conteudo de uma determinada regiao da memoria é copiado para outra

*/

class AreaCasa {

    static double valorM2 = 1500; //valor do metro quadrado
    static double precos[] = {1500,1100,750,500}; //arranjo de double contém 5 posições 


    static void areaCasa(float lateral, float cquarto) { //método com dois argumentos

        float areaq;
        float areas;
        float areat;

        if (lateral >= 0 && cquarto >= 0) {

            System.out.println("PROGRAMA PARA CASA DA AREA DA CASA RETANGULAR");

            areas = lateral * lateral;
            System.out.println("Area da sala e:" + areas);

            areaq = cquarto * (lateral / 2);
            System.out.println("Area do quarto e:" + areaq);
            System.out.println("Area do quarto e:" + areaq);

            areat = areas + 2 * areaq;
            System.out.println("Area total:" + areat);

        } else {

            System.out.println("Erro lateral do quarto menor que 0");
        }
    }

    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;


    static double valorPiscina(double area, int material) {

        if (material < ALVENARIA || material > PLASTICO || area < 0) //testa condições
            return (-1);
        		return (area * precos[material]); //substitui o switch case de uso
    }





    static double areaPiscina(double raio) { //criaco do metodo, com retorno tipo double raio
        double resp; //criacao da variavel resp do tipo double para verificar a condicao 		
        resp = (raio >= 0) ? Math.PI * Math.pow(raio, 2) : -1;
        return (resp);

    }

    static double valor(double area) {
        if (area >= 0)
            return (valorM2 * area);
        return (-1);

    }
	
	static double media(double[] arranjo) { 	//metodo resposta que recebe como parametro um arranjo
		double resp = 0;						//inicia com 0
			 for (double valor: arranjo){
				 resp += valor;					//intera cada valor ou seja 0 + primeiro número e divide pelo tamanho do arranjo e assim por diante
			 }
        return(resp/arranjo.length);

    }

    public static void main(String[] args) {

        double areap;
		
        areaCasa(11, 7);

        double preco;
        boolean valorOK = false;

        areap = areaPiscina(2);

        System.out.println("Area da piscina e: " + areap);

        preco = valor(20);
        valorOK = preco >= 0;

        //double area = 50;
        //int tipo = ALVENARIA;

        /*	System.out.println("Material \t Valor"); //varia o material
        		while(tipo <= PLASTICO){
        		 System.out.println(tipo + "\t\t"+ valorPiscina(area,tipo));
        		 tipo = tipo + 1; //SE FOR RETIRADO OCORRE UM LOOP INFINITO PORQUE A VARIAVEL TIPO FICARa COM O VALOR DE 0 INFITAMENTE
        }
        	System.out.println("Area \t Valor");
        		while(area <= 200){ //varia a area
        		 System.out.println(area + "\t\t"+ valorPiscina(area,ALVENARIA));
        		 area = area+ 50; 
        }
        */

        System.out.println("Area\tMaterial\tValor");
        for (double area = 50; area <= 200; area = area + 50) {
            for (int tipo = ALVENARIA; tipo <= PLASTICO; tipo = tipo + 1) {
                System.out.println(area + "\t" + tipo + "\t\t" + valorPiscina(area, tipo));
            }
        }
		
		System.out.println("A media do preço dos materiais e:" + media(precos));

	
    }
}