/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

Nessa parte do nosso programa iremos inserir ATRIBUTOS para saber o valor R$ da construção
Algo que em softwares gerais, estaria em algum menu "Opções, "Setup" etc
Para facilitar esse programa declaramos fora de qualquer método no programa, deixamos váriavel para
que se permita mudanças

*/	
								
class AreaCasa{
	
		static double valorM2 = 1500; //valor do metro quadrado
		

		static void areaCasa(float lateral, float cquarto){	//método com dois argumentos, float lateral, cquarto	

		float areaq; //variavel tipo float sem valor atribuido
		float areas; //variavel tipo float sem valor atribuido
		float areat; //variavel tipo float sem valor atribuido

		System.out.println("PROGRAMA PARA CASA DA AREA DA CASA RETANGULAR");

		areas = lateral*lateral;
		System.out.println("Area da sala e:" + areas);

		areaq = cquarto*(lateral/2);
		System.out.println("Area do quarto e:" + areaq);
		System.out.println("Area do quarto e:" + areaq);

		areat= areas +2*areaq;
		System.out.println("Area total:" + areat);
		}
		

		static double areaPiscina(double raio){ //criaco do metodo, com retorno tipo double raio		
		return(Math.PI * Math.pow(raio,2));
		
		}
		
		static double valor(double area){
		return(valorM2*area);
		}
	
		public static void main (String[] args) {	

		double areap;
		areaCasa(11,7);
		
		
		valorMetro = valor(198);
		
		areap = areaPiscina(2);

		System.out.println("Area da piscina e: " + areap);
		
		

	}		
}
	
