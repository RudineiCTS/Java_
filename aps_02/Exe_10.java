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
public class Exe_10 {
    public static void main (String[] args){
        int[][]matriz = {
        {1,2,3},
        {4,5,6},
        {6,7,8}
    };
        for(int l=0; l < 3 ;l++) {
			for(int c=0; c < 3; c++) {
                            System.out.print(matriz[l][c]+" ");
        }
                        System.out.println(" ");
    
}
}
}
