/*
Construtores - são metodos chamados na criação dos objeto
eles podem atribuir valores pros atributos de um objeto quanto 
executar qualquer metodo durante a inicialização desses objetos.
AreaCasa casa1 = new AreaCasa(); -- exemplo de construtor padrão

Construtores pode ter um quantidade variade de parametros
e pode executar qualquer codigo dentro dele. É bom para
atribuir valores para os atributos, evitando esquecimentos out
seja objeto criou se necessário já modifica

*/

class Projeto {	
	static double area(double lateral, double cquarto, double raio){
		return(AreaCasa.area(lateral,cquarto) + AreaPiscina.areaPiscina(raio));
	}

	public static void main (String[] args) {
		//Cria-se um objeto, que é uma instancia da Classe AreaCasa
		AreaCasa casa1 = new AreaCasa();
		AreaCasa casa2 = new AreaCasa(1270);
	
		System.out.println(casa1.valor(casa1.area(15,10))); 
		System.out.println(casa2.valor(casa1.area(18,8)));
		
		System.out.println();
		System.out.println("area da casa mais piscina");
		System.out.println(area(11.0,7.0,2.0)); 
	}
}


