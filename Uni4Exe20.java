package Unidade4;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota prova 1: ");
        double notaProva1 = teclado.nextDouble();
        System.out.print("Nota prova 2: ");
        double notaProva2 = teclado.nextDouble();
        System.out.print("Nota prova 3: ");
        double notaProva3 = teclado.nextDouble();
        System.out.print("Media exercicios: ");
        double mediaExercicio = teclado.nextDouble();
        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + mediaExercicio)/7;
        if (media >= 9.0) {
            System.out.println("aprovado");
        } else {
            if (media >= 7.5 && media < 9.0) {
                System.out.println("aprovado");
            } else {
                if (media >= 6.0 && media < 7.5) {
                    System.out.println("aprovado");
                } else {
                    if (media >= 4.0 && media < 6.0) {
                        System.out.println("reprovado");
                    } else {
                        if (media < 4.0) {
                            System.out.println("reprovado");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
