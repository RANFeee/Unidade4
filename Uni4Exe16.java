package Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a idade de 2 homens");
        int idadeH1 = teclado.nextInt();
        int idadeH2 = teclado.nextInt();
        System.out.println("informe a idade de 2 mulheres");
        int idadeM1 = teclado.nextInt();
        int idadeM2 = teclado.nextInt();
        if (idadeH1 != idadeH2 && idadeM1 != idadeM2 && idadeH1 != idadeM1 && idadeH2 != idadeM2 && idadeH1 != idadeM2 && idadeH2 != idadeM1) {
            if (idadeH1 > idadeH2 && idadeM1 < idadeM2){
                int soma = idadeH1 + idadeM1;
                int produto = idadeH2 * idadeM2;
                System.out.println("soma da idade do homem mais velho com a idade da mulher mais nova: " + soma);
                System.out.println("produto da idade do homem mais novo com a idade da mulher mais velha: " + produto);
            } else {
                int soma = idadeH2 + idadeM2;
                int produto = idadeH1 * idadeM1;
                System.out.println("soma da idade do homem mais velho com a idade da mulher mais nova: " + soma);
                System.out.println("produto da idade do homem mais novo com a idade da mulher mais velha: " + produto);
            }
        }else{
            System.out.println("todas as idades devem ser diferentes");
        }
        teclado.close();
    }
}
