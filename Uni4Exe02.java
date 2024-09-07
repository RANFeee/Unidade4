package Unidade4;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro maior do que 0: ");
        int valor = teclado.nextInt();
        if (valor < 0) {
            System.out.println("Números negativos não podem ser definidos como pares ou ímpares");  
        }else{
            if (valor % 2 == 0) {
                System.out.println("Numero é par!");
            }else{
                System.out.println("Numero é impar!");
            }
        }
        teclado.close();
    }
}
