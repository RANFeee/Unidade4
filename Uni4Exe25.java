package Unidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero:");
        double numero1 = teclado.nextInt();
        System.out.println("Entre com o segundo numero:");
        double numero2 = teclado.nextInt();
        System.out.println("Escolha uma opçao:");
        System.out.println("\t1 - Soma de dois números.");
        System.out.println("\t2 - Diferença entre dois números.");
        System.out.println("\t3 - Produto entre dois números.");
        System.out.println("\t4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = teclado.nextInt();
        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("A soma desses dois numeros é: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Diferença entre esses dois numeros é: " + resultado);
                break;
            case 3: 
                resultado = numero1 * numero2;
                System.out.println("O produto entre esses dois numeros é: " + resultado);
                break;
            case 4:
                if (numero1 == 0) {
                    System.out.println("o denominador não pode ser zero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("A divisão entre esses dois numeros é: " + resultado);
                }
                break;
                default:
                    System.out.println("opçao invalida!!!");
                break;
        }
        teclado.close();
    }
}
