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
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("digite o texto :");
        String texto=sc.nextLine();
        System.out.println("texto digitado : "+ texto);
        System.out.println("quantidade de caracteres é :"+ texto.length());
        
    }
    
}
