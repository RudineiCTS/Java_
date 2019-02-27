/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_02;

import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author costa
 */
public class Exe_04 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int i=0;
        float result=0;
        System.out.println("digite um valor:");
        int valor=sc.nextInt();
        for(i = valor;i>=1;i--){
            result= (float) (result + 1.0 /i);
                  System.out.println(" numero harmonico é:"+i);
        }
        
    }
    
}
