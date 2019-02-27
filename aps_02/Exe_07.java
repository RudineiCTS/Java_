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
public class Exe_07 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("digite a quantidade do seu vetor : ");
        int quantidade= sc.nextInt();
        int [] array= new int [quantidade];
        int i =0;
        for( i =0; i < quantidade; i++){
            System.out.println("digite os numeros do vetor :");
            array[i]=sc.nextInt();
        }
        int pares=0;
        for(i=0;i < quantidade;i++){
            if(array[i]%2==0){
                pares=array[i]+ pares;
            }
        }
        System.out.println("resulta em :"+pares);
        
    }
}
