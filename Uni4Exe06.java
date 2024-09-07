package Unidade4;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char sexo = teclado.next().toUpperCase().charAt(0); // toUpperCase pra caso se o usuario digitar letra minuscula
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Nao Informado");
                break;       
            default:
                System.out.println("Entrada errada");
                break;
        }
        teclado.close();
    }
}
