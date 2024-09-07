package Unidade4;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o seu peso em quilograma:");
        double massa = teclado.nextDouble();
        System.out.println("infomre a sua altura em metros:");
        double alturaM = teclado.nextDouble();
        double imc = massa / Math.pow(alturaM,2);
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Saudável");
            } else {
                if (imc >= 25.0 && imc <= 29.9) {
                    System.out.println("Sobrepeso");
                } else {
                    if (imc >= 30.0 && imc <= 34.9) {
                        System.out.println("Obesidade Grau 1");
                    } else {
                        if (imc >= 35.0 && imc <= 39.9) {
                            System.out.println("Obesidade Grau 2 (Severa)");
                        } else {
                            if (imc >= 40.0) {
                                System.out.println("Obesidade Grau 3 (mórbida)");
                            }
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
