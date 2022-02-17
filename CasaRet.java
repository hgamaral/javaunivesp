class CasaRet {	
/*Programa para calcular a area de uma casa (e seu cômodos)
de 3 comodos: int lateral com 11 de lateral, alterando de int para float
*/									
	public static void main (String[] args) {	
		
		float lateral = 11; //alteração de 10 para 11
		
		float cquarto = 7; //comprimento da lateral maior do quarto
	
		float areaq; //area do quarto e uma variavel

		float areas; //area da sala e uma variavel

		float areat; //area total e uma variavel


		System.out.println("Programama para calculo da area da casa");

		areas = lateral*lateral;
		System.out.println("Area da sala e:" + areas);

		areaq = cquarto*(lateral/2);
		System.out.println("Area do quarto e:" + areaq);
		System.out.println("Area do quarto e:" + areaq);

		areat= areas +2*areaq;
		System.out.println("Area do quarto e:" + areat);

	}
}