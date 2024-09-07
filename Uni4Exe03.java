package Unidade4;

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("entre com dois valores inteiros");
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        if (valor1 > valor2) {
            System.out.println("o maior valor é: " + valor1);
        } else {
            System.out.println("o maior valor é: " + valor2);
        }
        teclado.close();
    }
}
