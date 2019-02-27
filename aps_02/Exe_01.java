package aps_02;

import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("digite um numeto para a fatora��o");
		int num= sc.nextInt();
		int fatorial=1;
		for(int i=num; i > 0;i--) {
			fatorial*=i;
			System.out.println("Calculando fatoração " + fatorial+ "...");
			Thread.sleep(1000);
		}
		System.out.println("Fatoria de "+ num +"  resulta em :" +fatorial);
	}

}
