/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2;

import java.util.Scanner;

/**
 *
 * @author Unifafibe
 */
public class Aula_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[3];//definição de um array 
        arr[1]= 75;
        printa(arr);
    }
    public static void printa(int[] num){
         int i=0;
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}