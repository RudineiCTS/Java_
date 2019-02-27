package aps_02;


import java.util.Scanner;

public class Exe_02 {
	public static void main(String[]args) throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		System.out.println("digite uma posição para ser encontrada no Fibonacci:");
		int posicao= sc.nextInt();
		
		
		int num1=1;
		int num2=0;
		int result=0;
		
		
		 if(posicao==1) {
		 System.out.println("1");
		 }
		 
		 else {
			 System.out.println("1");
		for(int i=0; i< posicao;i++) {
			result= num2 - num1;
			num2= num1;
			num1= result;
			Thread.sleep(500);
			System.out.println(Math.abs(num1));
		}
		
	 }
		 
}
}
