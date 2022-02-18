class AreaPiscina {	
/*Programa para calcular a area de uma piscina redonda
area piscina é pi x raio ao quadrado
*/									
	public static void main (String[] args) {	
		
		double raio = 2; //raio da piscina
		
		double areap; //area da pisicina
	
		final double pi = 3.14159; 
		/*Pi tem um valor exato, logo seu valor não deve variar
		para isso utilizamos o elemento final para que não haja alteração*/

		

		areap = pi * raio *raio;
		System.out.println("Area da pisicina e  " + areap);

		

	}
}