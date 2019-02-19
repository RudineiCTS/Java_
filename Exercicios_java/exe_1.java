package Exercicios_java;

import java.io.PrintStream;
import java.util.Scanner;









public class exe_1
{
  public exe_1() {}
  
  public static void main(String[] args)
  {
    int resposta = 0;
    Scanner sc = new Scanner(System.in);
    for (;;) {
      System.out.println("digite o primeiro numero");
      int num1 = sc.nextInt();
      System.out.println("digite o segundo numero");
      int num2 = sc.nextInt();
      resposta = num1 * num2;
      resposta *= 2;
      System.out.println("resposta:" + resposta);
    }
  }
}
