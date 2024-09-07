package Unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o dia do vencimento: ");
        int diaVencimento = teclado.nextInt();
        System.out.println("informe o dia do pagamento: ");
        int diaPagamento = teclado.nextInt();
        System.out.println("informe o valor da prestaçao ");
        double valorPrestacao = teclado.nextDouble();
        int diaAtraso = diaPagamento - diaVencimento;
        double valorPagar;
        if (diaAtraso <= 0) {
            valorPagar = valorPrestacao * 0.10;
            double valorDesconto = valorPrestacao - valorPagar;
            System.out.println("O pagamento esta em dia e voce ganhou um desconto de: " + df.format(valorPagar));
            System.out.println("Valor a pagar: " + df.format(valorDesconto));
        } else {
            if (diaAtraso <= 5) {
                System.out.println("voce perdeu o desconto.");
                System.out.println("valor a pagar: " + df.format(valorPrestacao));
            } else {
                if (diaAtraso > 5) {
                    double multa = 0.02 * (diaAtraso - 5);
                    valorPagar = valorPrestacao * (1 + multa);
                    System.out.println("o pagamento esta atrasado e foi aplicaado uma multa: ");
                    System.out.println("valor a pagar: "+ df.format(valorPagar));
                }
            }
        }
        teclado.close();
    }
}
