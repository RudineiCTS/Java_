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
public class Exe_05 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite um tamanho para seu Array");
        int num= sc.nextInt();
        int resultado=0;
        int []array= new int[num];
        System.out.println("digite os numeros de seu vetor");
        for(int i=0; i< num; i++){
        
        array[i]=sc.nextInt();
        
    }
        for(int i=0; i< num; i++){
            resultado=resultado + array[i];
        }
        System.out.println("Soma dos numeros do array resulta em :"+resultado);
    }

    
    }
    

