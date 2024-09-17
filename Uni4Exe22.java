package Unidade4;

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Ciência da Computação, 2 - Licenciatura da Computação e 3 - Sistemas de Informação");
        int curso = teclado.nextInt();
        String resultado = "";
        switch (curso) {
            case 1:
                resultado = "Bacharel em Ciência da Computação";
                break;
            case 2:
                resultado = "Licenciado em Computação";
                break;
            case 3:
                resultado = "Bacharel em Sistemas de Informação";
                break;
            default:
                break;
        }
        System.out.println(resultado);
        teclado.close();
    }
}
