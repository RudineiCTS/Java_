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
public class Exe_09 {
    public static void main (String [] args) throws InterruptedException{
        Scanner sc =new Scanner (System.in);
        System.out.println("digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int []vetor= new int[tamanho];
        for(int i=0;i < tamanho;i++){
            vetor[i]= (int) (Math.random()*10+5);
            System.out.print(vetor[i]+ " ");
           
        }
         System.out.println(" ");
       int inicio=0;
       int fim = vetor.length-1;
       while(inicio < fim){
          invert(vetor,inicio, fim);
          inicio++; fim--;   
       }
        System.out.println("invertendo vetor...");
       sleep(1000);
       mostar(vetor);
       
       
    }
// invertendo valor:
    private static void invert(int[] v,int i, int f) {
        int aux;
        aux=v[i];
        v[i]=v[f];
        v[f]=aux;
                
        
        
        
    }

    private static void mostar(int[] vetor) {
       for(int i=0; i< vetor.length;i++){
           System.out.print(vetor[i]+" ");
       }
    }

    
}
