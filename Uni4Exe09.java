package Unidade4;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int valor1 = teclado.nextInt();
       int valor2 = teclado.nextInt();
       if (valor1 % valor2 == 0) {
            System.out.println("sao multiplos");
       }else{
            System.out.println("nao sao multiplo");
       }
       teclado.close();
    }
    
}
