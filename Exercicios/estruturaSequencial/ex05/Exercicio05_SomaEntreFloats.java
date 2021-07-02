package ex05;

import java.util.Scanner;

public class Exercicio05_SomaEntreFloats {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Código peça 1: ");
		@SuppressWarnings("unused")
		int codp1 = sc.nextInt();
		System.out.print("Quantidade de peças: ");
		int qtdp1 = sc.nextInt();
		System.out.print("Valor unitario da peça 1: ");
		float valorp1 = sc.nextFloat();
		System.out.print("Código peça 2: ");
		@SuppressWarnings("unused")
		int codp2 = sc.nextInt();
		System.out.print("Quantidade de peças: ");
		int qtdp2 = sc.nextInt();
		System.out.print("Valor unitario da peça 1: ");
		float valorp2 = sc.nextFloat();
		
		float total = qtdp1*valorp1+qtdp2*valorp2;
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		
		
		sc.close();
	}

}
