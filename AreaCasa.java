/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos inserir 4 materiais para construção da piscina.
Irá ser utilizado o elemento SWITH dentro do NOVO método valorPiscina para análise do 
material que será utilizado para construção da piscina.



PONTOS DE ATENÇÃO: default é o opcional

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


                System.out.println("Erro lateral do quarto menor que 0");

              
            }
    }


		static final int ALVENARIA = 0;
		static final int VINIL = 1;
		static final int FIBRA = 2;
		static final int PLASTICO = 3;
		
		
	static double valorPiscina(double area, int material){
			double valor=0;
			switch (material){
				case ALVENARIA: valor = 1500;
								break;
				case VINIL: valor = 1100;
								break;
				case FIBRA: valor = 750;
								break;
				case PLASTICO: valor = 500;
								break;
				default: valor = -1;
			}
			return (area*valor);
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
		
		System.out.println("O valor para construção da piscina e: " + valorPiscina(100,3));



    }
}