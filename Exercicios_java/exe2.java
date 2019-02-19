package Exercicios_java;

import java.io.PrintStream;

public class exe2 { public exe2() {}
  
  public static void main(String[] args) { java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("digite a quantidade de opreção:");
    int quantidade = sc.nextInt();
    

    for (int i = 0; i < quantidade; i++) {
      System.out.println("digite um numero:");
      int num1 = sc.nextInt();
      
      System.out.println("digite outro numerro:");
      int num2 = sc.nextInt();
      
      if (num1 > num2) {
        System.out.println(">");
      }
      else if (num1 < num2) {
        System.out.println("<");
      } else {
        System.out.println("=");
      }
    }
  }
}
