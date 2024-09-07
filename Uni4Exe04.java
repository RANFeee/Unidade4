package Unidade4;

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("entre com um numero de ponto flutuante maior que 0.");
        float numero = teclado.nextFloat();
        if (numero <= 0) {
            System.out.println("O numero tem que ser maior que 0.");
        }else{
            if (numero % 1 != 0) {
                System.out.println("O numero tem casas decimais.");
            }else{
                System.out.println("0 numero nao tem casas decimais.");
            }
        }
        teclado.close();
    }
}
