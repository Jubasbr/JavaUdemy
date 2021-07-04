package ex05;

import java.util.Scanner;

public class Exercicio05_InOut {
    /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int dentro = 0, fora = 0;
        for (int i = 1; i <= total; i++) {
            int a = sc.nextInt();
            if (a >= 10 && a <= 20) dentro++;
            else fora++;
        }
        System.out.println("Dentro " + dentro);
        System.out.println("Fora " + fora);

    }
}
