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
public class Exe_08 {
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("digite o tamanho do vetor:");
        int num=sc.nextInt();
        int []array= new int[num];
        int i=0;
     //variaveis
        int maior= array[1];
        int menor=array[1];
        
     //FORs
        for (i=0;i<num;i++){
             array[i]=(int)(Math.random() * 10);

            System.out.println(array[i]);
        }
         for (i=0;i<num;i++){
          
        if(maior < array[i]){
            maior=array[i];
        }
        if(menor > array[i]){
            menor=array[i];
        }
        }
       
        System.out.println("maior numero: "+maior+ ", menor numero : "+menor);
    }
    
}
