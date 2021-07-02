package ex02;

import java.util.Scanner;

public class Exercicio02_ParImpar {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int n = sc.nextInt();
		if ((n%2)==0) {
			System.out.println("Numero é par");
		}
		else {
			System.out.println("Numero é impar");
		}
		
		
		sc.close();

	}

}
