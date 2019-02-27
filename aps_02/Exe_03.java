/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_02;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author costa
 */
public class Exe_03 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("digite a raio do circulo:");
        float raio= sc.nextInt();
       float result = 0;
        result =(float) Math.pow(raio,2);
        result= (float) (Math.PI* result);
        System.out.println ("area do circulo resulta em :"+result);
        //%2.f
    }
    
}
