/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos testar os parâmetros

SE o parâmetro for positivo ENTÃO calcule a área;
SENÃO retorne um valor indicado erro (exemplo retorna -1)
USANDO SOMENTE IF 

PONTOS DE ATENÇÃO: não há código após o RETURN. Nesse caso há devido
ao condicional, porque não há como dizer antemão se haverá o retorno.

*/
class AreaCasa {

    static double valorM2 = 1500; //valor do metro quadrado


    static void areaCasa(float lateral, float cquarto) { //método com dois argumentos, float 			lateral, cquarto	

        float areaq;
        float areas;
        float areat; //variavel tipo float sem valor atribuido

        System.out.println("PROGRAMA PARA CASA DA AREA DA CASA RETANGULAR");

        areas = lateral * lateral;
        System.out.println("Area da sala e:" + areas);

        areaq = cquarto * (lateral / 2);
        System.out.println("Area do quarto e:" + areaq);
        System.out.println("Area do quarto e:" + areaq);

        areat = areas + 2 * areaq;
        System.out.println("Area total:" + areat);
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

            areap = areaPiscina(2);

            System.out.println("Area da piscina e: " + areap);

            preco = valor(-20);
            if (preco >= 0)
                System.out.println("O valor da construção e " + preco);
            else
                System.out.println("Valor de area negativo: ");



        }
    }