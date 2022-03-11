/*
Como se utilizar cópias de arranjo e declarações corretas.
a2 = a1; maneira incorreta de realizar uma cópia de arranjos
*/

class Arranjos {
 static double valorM2 = 1500; //valor do metro quadrado
    static double precos[] = {1500,1100,750,500}; //arranjo de double contém 5 posições 



    public static void main(String[] args) {

	int[] a1 = {0,1,2,3};
	int[] a2 = new int[4];

	a2 = a1; //copiou o endereço da memória -- posições do array
	//a1[3] = 9;

	for (int val: a1){
		System.out.println(val+", ");
		System.out.println();
	}
	
	for (int val: a2){
		System.out.println(val+", ");
		System.out.println();
	}	
		
		System.out.println(a1);
		System.out.println(a2);

}
}