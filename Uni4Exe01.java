package unidade_4;

import java.util.Scanner;



public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("entre com o valor de horas trabalhadas");
        int horasPorMes = teclado.nextInt();
        System.out.println("entre com valor pago por hora");
        double valorPorHora = teclado.nextDouble();
        double salarioTotal = horasPorMes * valorPorHora; 
        if (horasPorMes > 160) {
            double salarioExtra = (horasPorMes - 160) * (valorPorHora / 2);
            salarioTotal = salarioTotal + salarioExtra;
        } else {
            
        }
        System.out.println("O salario total é: " + salarioTotal);
    }
    
    
}
