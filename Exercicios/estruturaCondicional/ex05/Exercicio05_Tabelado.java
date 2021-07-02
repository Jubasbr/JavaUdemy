package ex05;

import java.util.Scanner;

public class Exercicio05_Tabelado {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double grana; 
		
		if (cod==1) grana = qtd*4;
		else if (cod==2) grana = qtd*4.5;
		else if (cod==3) grana = qtd*5;
		else if (cod==4) grana = qtd*2;
		else grana = qtd*1.5;

		System.out.printf("Total: R$ %.2f%n", grana);
		
  		
		
		sc.close();

	}

}
