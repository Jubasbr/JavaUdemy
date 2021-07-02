package ex02;

import java.util.Scanner;

public class Exercicio02_AreaCirculo {

	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio do circulo a ser calculada a area: ");
		double raio = sc.nextDouble();
		sc.close();
		System.out.println("A area do circulo é:" + ( Math.pow(raio, 2)*3.14159));
	}

}
