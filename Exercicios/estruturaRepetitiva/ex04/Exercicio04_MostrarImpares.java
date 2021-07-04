package ex04;

import java.util.Scanner;

public class Exercicio04_MostrarImpares {
    /*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for (int i = 0; i <= a; i++) {
            if ((i % 2) != 0) System.out.println(i);
        }
    }
}
