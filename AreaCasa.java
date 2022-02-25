/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos testar OPERADOR ? "ATALHO" PARA CONDIÇÕE
LEIA-SE If (condição) var recebe expressao 1;
	   else var = expressao 2;



PONTOS DE ATENÇÃO: NESSE CASO O OPERADOR ? sera inserido no metodo areaPiscina
se raio for maior 0 primeira condição, caso contrario retorno -1

*/
class AreaCasa {

    static double valorM2 = 1500; //valor do metro quadrado


    static void areaCasa(float lateral, float cquarto) { //método com dois argumentos

        float areaq;
        float areas;
        float areat;

        if (lateral >=0 && cquarto >=0){

		 	System.out.println("PROGRAMA PARA CASA DA AREA DA CASA RETANGULAR");

                areas = lateral * lateral;
                System.out.println("Area da sala e:" + areas);

                areaq = cquarto * (lateral / 2);
                System.out.println("Area do quarto e:" + areaq);
                System.out.println("Area do quarto e:" + areaq);

                areat = areas + 2 * areaq;
                System.out.println("Area total:" + areat);

             }

        else {

            if (cquarto < 0)

                System.out.println("Erro lateral do quarto menor que 0");

              
            }
    }


    static double areaPiscina(double raio) { //criaco do metodo, com retorno tipo double raio
	   double resp; //criacao da variavel resp do tipo double para verificar a condicao 		
        resp = (raio >=0) ? Math.PI * Math.pow(raio, 2) : -1;
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


        if (valorOK)
            System.out.println("O valor da construção e " + preco);
        else
            System.out.println("Valor de area negativo");



    }
}