/*
Arranjos de objetos, agora nosso projeto envolve um condominio de residências
Cada uma com uma casa e uma piscina
Criaremos uma nova classe Residencia

*/

class Projeto {	
	Residencia[] condominio; //arranjo de objetos no caso arranjo de enderecos da memoria
	int ultimo = -1; //ultimo alocado
	
	boolean adicionaRes(Residencia r){
		if(this.ultimo < this.condominio.length-1){
			ultimo++;
			this.condominio[ultimo] = r;
			return(true);
		}
		return (false);
	}
	
	Projeto(int tam){
		condominio = new Residencia[tam];
	}


	static double area(AreaCasa casa, AreaPiscina piscina){
		return(casa.area() + piscina.area());
	}
	
	
	public static void main (String[] args) {
		//Cria-se um objeto, que é uma instancia da Classe AreaCasa
		AreaCasa casaPrinc1 = new AreaCasa(10,5); // 150
		AreaCasa casaPrinc2 = new AreaCasa(20,5); 
		
		AreaPiscina piscina1 = new AreaPiscina(10);// PI * (10 elevado 2)  = 314
	
		System.out.println(area(casaPrinc1, piscina1));
		
		/*Projeto proj = new Projeto(3);
		AreaCasa c = new AreaCasa(10,5);
		AreaPiscina p = new AreaPiscina(5);
		Residencia r = new Residencia(c,p);
		proj.adicionaRes(r);
		
		c = new AreaCasa(12,7);
		p = new AreaPiscina(6);
		r = new Residencia(c,p);
		proj.adicionaRes(r);
		
		c = new AreaCasa(10,6);
		p = new AreaPiscina(3.5);
		r = new Residencia(c,p);
		proj.adicionaRes(r);
		*/
		
		Projeto proj = new Projeto(3);
		for(Residencia re : proj.condominio){
			System.out.println("Endereco do objeto: " +re);
		}
			
	}
}

