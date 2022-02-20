/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina
Foram inseridos nos metodos PARAMETROS - o metodos agora deve receber um valor (ARGUMENTO) em seu parametro 

static void areaCasa(); o VOID no método significa que não irá retornar valor algum, apenas irá executar a tarefa e terminar

static double areaPiscina (double raio); onde double raio é igual a 2
return no método é quando o valor é efetivamente retornado

*/	
								
class AreaCasa{
		
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
		
		
	
		public static void main (String[] args) {	

		double areap;
		areaCasa(11,7);
		areap = areaPiscina(2);

		System.out.println("Area da piscina e: " + areap);
		

	}		
}
	