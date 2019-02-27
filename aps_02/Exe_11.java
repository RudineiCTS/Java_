/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_02;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author costa
 */
public class Exe_11 {public static void main(String [] args) throws InterruptedException {
		Scanner sc=  new Scanner(System.in);
                System.out.println("digite a linha da sua matriz ");
                int linha=sc.nextInt();
                System.out.println("digite a caluna da sua matriz");
                int coluna=sc.nextInt();
                int[][] matriz= new int[linha][coluna];
                
           for(int l=0; l < linha ;l++) {
		for(int c=0; c < coluna; c++) {
                            System.out.print("digite os valores de sua matriz: ");
                            matriz[l][c]=sc.nextInt();
        }
                        System.out.println(" ");
    
}
            System.out.println("matriz resultante é :");
               for(int l=0; l < linha ;l++) {
			for(int c=0; c < coluna; c++) {
                            System.out.print(matriz[l][c]+" ");
        }
                        System.out.println(" "); 
}
               System.out.println("fazendo transposta...");
               sleep(1000);
               
                        transposta(linha,coluna,matriz);
                        
                  
               
               
}

    private static void transposta(int linha, int coluna, int[][] matriz) {
     int l=0; int c=0;
     for(l=0;l<coluna;l++){
         for(c=0;c<linha;c++){
              System.out.print(matriz[c][l]+" ");
        }
                        System.out.println(" "); 
         
     }
      
    }
    
}
