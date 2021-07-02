package ex06;

import java.util.Scanner;

public class Exercicio06_SaidaFloat {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		System.out.printf("Triangulo: %.3f",(a*c)/2);
		System.out.printf("\nCirculo: %.3f", Math.pow(c, 2)*3.14159);
		System.out.printf("\nTrapezio: %.3f", ((a+b)*c)/2);
		System.out.printf("\nQuadrado: %.3f", Math.pow(b, 2));
		System.out.printf("\nRetangulo: %.3f", a*b);
		
		sc.close();

	}

}
