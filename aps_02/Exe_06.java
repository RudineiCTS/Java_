package aps_02;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author costa
 */
public class Exe_06 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("digite o tamanho do vetor :");
        int num = sc.nextInt();
         int []array= new int[num];
        for(int i=0;i < num;i++){
          array[i] = (int) (Math.random() * 101);
        }
                
        for(int i=0;i < num;i++){
            System.out.println(array[i]);
            
        }
        System.out.println("digite uma posição para ser encontrada em seu vetor 0 até "+ (num-1));
        int select= sc.nextInt();
        System.out.println("numero na posição selecionada é :"+ array[select]);
    }
}
       
        
       

  

