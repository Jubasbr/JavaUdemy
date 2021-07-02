package ex03;

import java.util.Scanner;

public class Exercicio03_LeituraSequencial {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quatro numeros em sequencia");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		System.out.println(
				"A diferencia do primeiro numero somado a diferença do produto de A e B pelo produto de C e D: "
						+ (a * b - c * d));

	}

}
