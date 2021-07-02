package ex08;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio08_TxImposto {
	/*
	 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
	 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
	 * Imposto de Renda, segundo a tabela abaixo. Lembre que, se o salário for R$
	 * 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
	 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No
	 * exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$
	 * 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas
	 * casas decimais.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double taxa;
		Locale.setDefault(Locale.US);

		if (salario <= 2000.00)
			taxa = 0;
		else if (salario > 2000.00 && salario <= 3000.00)
			taxa = (salario - 2000) * 0.08;
		else if (salario > 3000.00 && salario <= 4500.00)
			taxa = (salario - 3000) * 0.18 + 1000 * 0.08;
		else {
			taxa = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}

		if (taxa == 0.0) {
			System.out.print("Insento");
		} else
			System.out.printf("R$ %.2f%n", taxa);

		sc.close();
		//fim

	}

}
