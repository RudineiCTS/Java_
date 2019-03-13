/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.pkg3;

import java.util.Scanner;

/**
 *
 * @author rudinei
 */
public class Exercicio_02 {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("digite o texto :");
        String texto= sc.nextLine();
        System.out.println("texto digitado  :"+ texto);
        
            int fim= texto.length();
            int fim2= (texto.length()-2);
             String palavra1= texto.substring(0,2);
             String  palavra2 = texto.substring(fim2,fim);
        System.out.println("palavra gerada :"+ palavra1 + palavra2);
        
    }
    
}
