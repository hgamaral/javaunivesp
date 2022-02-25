/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos testar OPERADORES LÓGICOS para testar as condições no método areaCASA



PONTOS DE ATENÇÃO: O método irá executar o codigo somente se lateral >= 0 e cquarto >= 0 (&&) para duas condições verdadeiras - operador lógico and if (lateral>0 && cquart>0)

Se não for verdade lateral >=0 e c quarto >=0, em java if (!(lateral>=0 && cquarto>0))

NESSE CASO O OPERADOR LOGICO && no metodo areaCasa

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
        return (Math.PI * Math.pow(raio, 2));

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