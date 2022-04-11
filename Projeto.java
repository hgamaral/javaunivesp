/*
Memoria com mais de um objeto


*/

class Projeto {	
	static double area(double lateral, double cquarto, double raio){
		return(AreaCasa.area(lateral,cquarto) + AreaPiscina.areaPiscina(raio));
	}

	public static void main (String[] args) {
		//Cria-se um objeto, que é uma instancia da Classe AreaCasa
		AreaCasa casa1 = new AreaCasa();
		AreaCasa casa2 = new AreaCasa();
		
		casa2.valorM2 = 1270; //mudança do valor do M2 para o objeto casa2
	
		System.out.println(casa1.valor(casa1.area(15,10))); 
		System.out.println(casa2.valor(casa1.area(18,8)));
		
		System.out.println(area(11.0,7.0,2.0)); 
	}
}


