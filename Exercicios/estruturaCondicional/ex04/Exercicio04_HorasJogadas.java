package ex04;

import java.util.Scanner;

public class Exercicio04_HorasJogadas {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int hinicial, hfinal, htotal;
		
		hinicial = sc.nextInt();
		hfinal = sc.nextInt();
		
		if (hinicial<hfinal) {
			htotal = hfinal - hinicial;
			
		}
		else if (hinicial>hfinal) {
			htotal = 24-hinicial+hfinal;
		}
		else {
			htotal = 24;
		}
		
		System.out.println("Horas totais: "+htotal);
		
		sc.close();

	}

}
