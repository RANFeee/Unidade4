package Unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Entre com o peso da carta: ");
        int peso = teclado.nextInt();
        double valorPagar;
        if (peso <= 50) {
            valorPagar = 0.45;
        }else{
            int pesoExcedido = peso - 50;
            int qtdAdicional = (int) Math.ceil(pesoExcedido / 20);
            valorPagar =(0.45 * qtdAdicional) + 0.45 ;
        }
        System.out.println("Custo do selo: " + df.format(valorPagar));
        teclado.close();
    }
}
