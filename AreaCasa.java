/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos usar EXRPESSÕES CONTRAIDAS, que são bastante uteis para realizar
a operação e armazenar o resultado na mesma variavel.

PONTOS DE ATENÇÃO: SINTAXE: x = x + 5 EQUIVALE a x + = 5 - LEIA X RECEBE = X MAIS 5
PRE INCREMETO E POS INCREMENTO
LAÇOS - INICIALIZAÇÃO, CONDIÇÃO E ATUALIZAÇÃO SÃO OPCIONAIS
A CONDIÇÃO ACEITA QUALQUER EXPRESSÃO QUE RESULTE EM VERDADEIRO OU FALSO (EXPRESSÕES LÓGICAS E RELACIONAIS). INICIALIZAÇÃO E ATUALIZAÇÃO SÃO APENAS CÓDIGOS RODADOS, RESPECTIVAMENTE, NO INICIO E NO FIM DO LAÇO.
}
							
							inicialização
							while(condição){
								comandos;
								atualização;
							}

*/

class AreaCasa {

    static double valorM2 = 1500; //valor do metro quadrado


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

        switch (material) {
            case ALVENARIA:
                return (area * 1500);
            case VINIL:
                return (area * 1100);
            case FIBRA:
                return (area * 750);
            case PLASTICO:
                return (area * 500);
            default:
                return (-1);
        }

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
	    for (double area =50; area <=200; area = area +50){
			for (int tipo = ALVENARIA;
						tipo <= PLASTICO;
						tipo = tipo+1){

                System.out.println(area + "\t" + tipo + "\t\t" + valorPiscina(area, tipo));
            }  
        } 


        if (valorOK)
            System.out.println("O valor da construcao e " + preco);
        else
            System.out.println("Valor de area negativo");

        //System.out.println("O valor para construção da piscina e: " + valorPiscina(100,3));

    }
}