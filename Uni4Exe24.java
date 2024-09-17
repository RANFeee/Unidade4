package unidade_4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe");
        System.out.printf("\tvalor1:");
        int valor1 = teclado.nextInt();
        System.out.printf("\tvalor2:");
        int valor2 = teclado.nextInt();
        System.out.printf("\tvalor3:");
        int valor3 = teclado.nextInt();
        int valorMenor, valorMeio, valorMaior;

        if (valor1 <= valor2 && valor1 <= valor3) {
            valorMenor = valor1;
            if (valor2 <= valor3) {
                valorMeio = valor2;
                valorMaior = valor3;
            } else {
                valorMeio = valor3;
                valorMaior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            valorMenor = valor2;
            if (valor1 < valor3) {
                valorMeio = valor1;
                valorMaior = valor3;
            } else {
                valorMeio = valor3;
                valorMaior = valor1;
            }
        } else {
            valorMenor = valor3;
            if (valor1 < valor2) {
                valorMeio = valor1;
                valorMaior = valor2;
            } else {
                valorMeio = valor2;
                valorMaior = valor1;
            }
        }
        System.out.println("menu principal");
        System.out.println("\t1 - em ordem crescente");
        System.out.println("\t2 - em ordem decrescente");
        System.out.println("\t3 - o maior valor fique no meio");
        System.out.println("Escolha a opçao:");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                System.out.printf("%d, %d, %d" , valorMenor , valorMeio , valorMaior);
                break;
            case 2:
                System.out.printf("%d, %d, %d" , valorMaior , valorMeio , valorMenor);
                break;
            case 3:
                System.out.printf("%d, %d, %d" , valorMenor , valorMaior  , valorMeio);                break;
            default:
                System.out.println("opçao invalida");
                break;
        }
        teclado.close();
    }
}
