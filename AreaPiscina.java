class AreaPiscina {	
/*Programa para calcular a area de uma piscina redonda
area piscina é pi x raio ao quadrado
Métodos MATH - power (exponeciação) passando a e b - leia-se (raio ao quadrado)
*/									
	public static void main (String[] args) {	
		
		double raio = 2; //raio da piscina
		
		double areap; //area da pisicina
	
		areap = Math.PI * raio * raio; 
		/*Pi tem um valor exato, logo seu valor não deve variar
		para isso utilizamos o elemento final para que não haja alteração*/

		

		
		System.out.println("A area da pisicina e  " + areap);

		
	}
}