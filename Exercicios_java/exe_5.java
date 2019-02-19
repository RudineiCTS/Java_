package exercicios_java;

import java.util.Scanner;

public class exe_5 { 
  
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
    System.out.println("digite um numero: ");
    int num = sc.nextInt();
    int divisores=0;
    for (int i=2; i <= num; i ++)
    {
      if(num % i== 0)
         divisores++;
    }
    if(divisores <= 2)
    System.out.println("o numero " + num+ " é primo");
    else
       System.out.println("o numero "+num + " não é primo");
  }
}
