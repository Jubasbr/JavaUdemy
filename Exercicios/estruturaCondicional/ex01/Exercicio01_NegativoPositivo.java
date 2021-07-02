package ex01;

import java.util.Scanner;

public class Exercicio01_NegativoPositivo {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		if (n>-1) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		sc.close();

	}

}
