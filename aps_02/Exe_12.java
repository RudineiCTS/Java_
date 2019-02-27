/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_02;

import java.util.Scanner;

/**
 *
 * @author costa
 */
public class Exe_12 {
    public static void main(String [] args) {
		Scanner sc=  new Scanner(System.in);
/*número de colunas da primeira matriz (n) 
 * tem que ser igual ao número de linhas (p) da segunda matriz.
*/
		//info da primeira matriz
		System.out.println("digite o numero de linha da primeira matriz:");
		int linha1=sc.nextInt();
		System.out.println(" digite o numero de coluna da primeira matriz:");
		int coluna1=sc.nextInt();
		System.out.println("primeira matriz é de:"+linha1+ " "+ coluna1 );
		int [][]matriz1= new int[linha1][coluna1];
		//fim da info
		System.out.println(" ");
		//info da segunda matriz
		System.out.println("digite o numero de linha da segunda matriz:");
		int linha2=sc.nextInt();
		System.out.println(" digite o numero de coluna da segunda matriz:");
		int coluna2=sc.nextInt();
                System.out.println("primeira matriz é de:"+linha2+ " "+ coluna2 );
		int [][]matriz2= new int[linha2][coluna2];
		//fim da info
		int[][] result=new int[coluna1][linha2];
                int l=0; int c=0; int r=0;
		
		if(coluna1 == linha2) {
			Atribuirvalores(linha1,coluna1,linha2,coluna2,matriz1,matriz2);
                        mostrar(linha1,linha2,coluna1,coluna2,matriz1,matriz2);
                       // for(l=0;l < linha1;l++){
                           // for(c=0;c < coluna1;c++){
                              //  for(r=0;r < coluna2;r++){
                                //    result[l][c]= matriz1[l][c]*matriz2[c][r];
                               // }
                           // }
                       // }
		}
		else
System.out.println("não é possivel fazer o produto da matriz, pois a linha da segunda matriz não bate com a primeira");
		
	
 
	}
	

	private static void Atribuirvalores(int linha1, int coluna1, int linha2, int coluna2, int[][] matriz1,
			int[][] matriz2) {
		// TODO Auto-generated method stub
		int l1=0,c1=0;
		int l2=0,c2=2;
		int i=0;
		Scanner sc=new Scanner(System.in);
		for(l1=0; l1 < linha1 ;l1++) {
			for(c1=0; c1 < coluna1; c1++) {
				System.out.println("digite os valores da matriz 1:");
				matriz1[l1][c1]= sc.nextInt();
			}
			System.out.println("");
		}
                for(l2=0; l2 < linha2 ;l2++) {
			for(c2=0; c2 < coluna2; c2++) {
				System.out.println("digite os valores da matriz 1:");
				matriz2[l2][c2]= sc.nextInt();
			}
			System.out.println("");
		
	}

    
       
}

    private static void mostrar(int linha1, int linha2, int coluna1, int coluna2, int[][] matriz1, int[][] matriz2) {
         int l1=0, c1=0; int l2=0, c2=0;
         System.out.println(" matriz 1");
        
    
                   for(l1=0; l1 < linha1 ;l1++) {
			for(c1=0; c1 < coluna1; c1++) {
                            System.out.print(matriz1[l1][c1]+" ");  
                        }
                        System.out.print(" ");
        
    }
                   System.out.println("");
                   System.out.println("matriz 2");
                   for(l2=0; l2 < linha2 ;l2++) {
			for(c1=0; c1 < coluna2; c1++) {
                            System.out.print(matriz2[l2][c2]+" ");  
                        }
                        System.out.print(" ");

                   

}
    }
}
    

