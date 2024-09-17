package unidade_4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular a area de um triangulo de base b e altura h.");
        System.out.println("Q: calcular a area de um quadrado de lado I");
        System.out.println("R: calcular a area de um retangulo de base b e altura");
        System.out.println("C: calcular a area de um circulo de raio r");
        char opcao = Character.toUpperCase(teclado.next().charAt(0));
        double area = 0;
        boolean temArea = true;
        switch (opcao) {
            case 'C':
                System.out.println("area do circulo");
                System.out.println("informe o raio:");
                double raio = teclado.nextDouble();
                area = Math.PI * Math.pow(raio,2);
                break;
            case 'Q':
                System.out.println("area do quadrado");
                System.out.println("informe o lado:");
                double lado = teclado.nextDouble();
                area = Math.pow(lado,2);
                break;
            case 'R':
                System.out.println("area do retangulo");
                System.out.println("informe o base:");
                double base = teclado.nextDouble();
                System.out.println("informe a altura:");
                double altura = teclado.nextDouble();
                area = base * altura;
                break;
            case 'T':
                System.out.println("area do triangulo");
                System.out.println("informe o base:");
                base = teclado.nextDouble();
                System.out.println("informe a altura:");
                altura = teclado.nextDouble();
                area = (base * altura) / 2;
                break;
            default:
                System.out.println("opçao invalida");
                temArea = false;
                break;
        }
        System.out.println(temArea ?
                        String.format("area calculada: %.2f%n", area):"sem area pra calcular.");

        //if (temArea) 
          //  System.out.printf("area calculada: %.2f%n" , area);
        //} else {
           // System.out.println("sem area pra calcular.");
        //}
        teclado.close();
    }
}
