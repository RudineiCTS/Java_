package Exercicios_java;

import java.io.PrintStream;

public class exe_4 {
  public exe_4() {}
  
  public static void main(String[] args) { java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("digite um numero:");
    int num = sc.nextInt();
    System.out.println("digite outro numero:");
    int num2 = sc.nextInt();
    System.out.println("digite o ultimo numero:");
    int num3 = sc.nextInt();
    
    if ((num > num2) && (num > num3)) {
      System.out.println("o numero maior é :" + num);
    } else if ((num2 > num) && (num2 > num3)) {
      System.out.println("o numero maior é :" + num2);
    } else if ((num3 > num) && (num3 > num2)) {
      System.out.println("o numeros maior é :" + num3);
    } else {
      System.out.println("os numeros apresentam o mesmo valor :" + num + "; " + num2 + ";" + num3);
    }
  }
}
