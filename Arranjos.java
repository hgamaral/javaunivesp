/*
Como se utilizar cópias de arranjo e declarações corretas.
a2 = a1; maneira incorreta de realizar uma cópia de arranjos
A maneira certa de se fazer copias de arranjos é copiar termo a termo os valores do arranjo
correspondente a a1 para o referenciado por a2
*/

class Arranjos {



    public static void main(String[] args) {

        int[] a1 = {0,1,2,3};

        int[] a2 = new int[4];

        //a2 = a1; maneira incorreta
        //a1[3] = 9; maneira incorreta

        //copia se termo a termo... copie na primeira posição de a2 o primeiro elemento de a1 e assim por diante

        for (int i = 0; i < a1.length; i++) a2[i] = a1[i];
        a1[3] = 9;
        for (int val: a1)
            System.out.println(val + ", ");
        System.out.println();
        for (int val: a2)
            System.out.println(val + ", ");
        System.out.println();


    }
}