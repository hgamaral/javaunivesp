class AreaCasa {	
/*Programa para calcular a area de uma casa (e seu cômodos) juntamente com a piscina

*/									
	public static void main (String[] args) {	
		
		float lateral = 11; //variavel tipo float com valor atribuido de 11
		float cquarto = 7; //variavel tipo float com valor atribuido de 7
		float areaq; //variavel tipo float sem valor atribuido
		float areas; //variavel tipo float sem valor atribuido
		float areat; //variavel tipo float sem valor atribuido
		double raio = 2;
		double areap;


		System.out.println("PROGRAMA PARA CASA DA AREA DA CASA = CASARET + PISCINA");

		areas = lateral*lateral;
		System.out.println("Area da sala e:" + areas);

		areaq = cquarto*(lateral/2);
		System.out.println("Area do quarto e:" + areaq);
		System.out.println("Area do quarto e:" + areaq);

		areat= areas +2*areaq;
		System.out.println("Area do quarto e:" + areat);

		areap = Math.PI * Math.pow(raio,2);
		System.out.println("Area da piscina e: " + areap);


	}
}