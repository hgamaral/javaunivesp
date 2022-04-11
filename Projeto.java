/*
Calcula a área de uma casa com piscina
sintaxe para chamara o metodo da AreaCasa -- insere NomedaClasse.metodo(argumentos)

Area da casa mais area da piscina
*/

class Projeto {	
	static double area(double lateral, double cquarto, double raio){
		return(AreaCasa.area(lateral,cquarto) + AreaPiscina.areaPiscina(raio));
	}
	
	public static void main (String[] args) {	
	
	System.out.println(area(11.0,7.0,2.0)); 
	}
}

//Quando executo minha classe projeto é alocado um espaço de memoria pra ela
//com os argumentos que vem do metodo main... chamamos o metodo area com 3 argumentos
//Execucao do metodo area de AreaCasa dentro do metodo main da classe Projeto