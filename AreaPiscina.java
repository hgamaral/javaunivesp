class AreaPiscina {	
/*Programa para calcular a area de uma piscina redonda
area piscina � pi x raio ao quadrado
M�todos MATH - power (exponecia��o) passando a e b - leia-se (raio ao quadrado)
*/									
	public static void main (String[] args) {	
		
		double raio = 2; //raio da piscina
		
		double areap; //area da pisicina
	
		areap = Math.PI * raio * raio; 
		/*Pi tem um valor exato, logo seu valor n�o deve variar
		para isso utilizamos o elemento final para que n�o haja altera��o*/

		

		
		System.out.println("A area da pisicina e  " + areap);

		
	}
}