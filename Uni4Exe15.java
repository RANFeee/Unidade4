package Unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.println("iforme a quantidade de mes que o funcionario foi admitido:");
        int meses = teclado.nextInt();
        System.out.println("iforme o salario atual do funcionario:");
        double salarioAtual = teclado.nextDouble();
        double reajuste = 0.0;
        if (meses <= 12) {
            reajuste = salarioAtual * 0.05;
            System.out.println("Valor de reajuste: " + df.format(reajuste));
        } else {
            if (meses > 12 && meses < 49) {
                reajuste = salarioAtual * 0.07;
                System.out.println("Valor de reajuste: " + df.format(reajuste));
            }else{
                System.out.println("O funcionário não se enquadra nas regras de reajuste.");
            }
            
        }
        teclado.close();
    }
}
