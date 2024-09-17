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
        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + mediaExercicio) / 7;
        char resultado = ' ';
        if (media >= 9.0) {
            resultado = 'A';
        } else if (media >= 7.5 && media < 9.0) {
            resultado = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            resultado = 'C';
        } else if (media >= 4.0 && media < 6.0) {
            resultado = 'D';
        } else if (media < 4.0) {
            resultado = 'E';
        }
        if (resultado == 'A') {
            System.out.println("aprovado");
        } else if (resultado == 'B') {
            System.out.println("aprovado");
        } else if (resultado == 'C') {
            System.out.println("aprovado");
        } else if (resultado == 'D'){
            System.out.println("reprovado");
        } else if (resultado == 'E') {
            System.out.println("reprovado");
        }
        teclado.close();
    }
}
