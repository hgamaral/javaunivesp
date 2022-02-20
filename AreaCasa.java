/*

Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina
Foram inseridos 2 métodos: 
static void areaCasa(); o VOID no método significa que não irá retornar valor algum, apenas irá executar a tarefa e terminar

static double areaPiscina; o DOUBLE no método indica um valor do tipo double
return no método é quando o valor é efetivamente retornado

*/	
								
class AreaCasa{
		
	static void areaCasa(){		//criação do método. void indica que nao ha retorno	

		float lateral = 11; //variavel tipo float com valor atribuido de 11
		float cquarto = 7; //variavel tipo float com valor atribuido de 7
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
		

		static double areaPiscina(){ //criaco do metodo, com retorno tipo double 		
		
		double raio = 2; //criacao da variavel raio do tipo double com valor atribuido de 2

		return(Math.PI * Math.pow(raio,2));
		
		}
		
		
	
		public static void main (String[] args) {	

		areaCasa(); //chama o método com todo as váriaveis e implementações que ele possui
		
		double areap; //criação da váriavel sem atribuição referente a area da piscina

		areap = areaPiscina();

	
		System.out.println("Area da piscina e: " + areap);
		

	}		
}
	
