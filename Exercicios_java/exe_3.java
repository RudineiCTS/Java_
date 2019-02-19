package Exercicios_java;

import java.util.Scanner;

public class exe_3 { public exe_3() {}
  
  public static void main(String[] args) { Scanner sc = new Scanner(System.in);
    
    System.out.println("digite um numero:");
    int num = sc.nextInt();
  
    
    if (num % 2==0) {
      System.out.println("o numero " + num +" é par" );
    } else {
      System.out.println("o numero " + num+ " é impar" );
    }
  }
}
