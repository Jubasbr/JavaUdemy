/**
 * 
 */
package ex04;

import java.util.Scanner;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por hora e calcula o salário desse
 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
 * casas decimais.
 */
public class Exercicio04_Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero do funcionario: ");
		int n = sc.nextInt();
		System.out.print("Digite o numero de horas trabalhadas: ");
		float h = sc.nextFloat();
		System.out.print("Digite o valor das horas: ");
		float d = sc.nextFloat();
		System.out.printf("Valor a ser recebido pelo funcionario "+n+" é de: %.2f",h*d);
		sc.close();
		//teste

	}

}
