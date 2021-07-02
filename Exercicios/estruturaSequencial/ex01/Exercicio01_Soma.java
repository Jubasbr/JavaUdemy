package ex01;

import java.util.Scanner;

public class Exercicio01_Soma {

	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
	 * soma desses números com uma mensagem explicativa
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = sc.nextInt();
		System.out.println("O valor da soma é: " + (a + b));
		sc.close();
	}

}
