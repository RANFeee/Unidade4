package Unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe sua renda anual:");
        float rendaAnual = teclado.nextFloat();
        float rendaLiquida = rendaAnual / 13;
        System.out.println("informe o numero de dependentes: ");
        int dependentes = teclado.nextInt();
        float descontoDependentes = rendaLiquida - (0.02f * dependentes);
        rendaLiquida = descontoDependentes;
        double imposto = 0.0;
        if (rendaLiquida <= 2000.00) {
            System.out.println("nao paga imposto");
        } else {
            if (rendaLiquida >= 2000.00 && rendaLiquida <= 5000.00) {
                imposto = 0.05 * rendaLiquida;
                System.out.println("valor do imposto: " + df.format(imposto));
            } else {
                if (rendaLiquida >= 5000.00 && rendaLiquida <= 10000.00) {
                    imposto = 0.10 * rendaLiquida;
                    System.out.println("valor do imposto: " + df.format(imposto));
                } else {
                    if (rendaLiquida > 10000.00) {
                        imposto = 0.15 / rendaLiquida;
                        System.out.println("valor do imposto: " + df.format(imposto));
                    }
                }
            }
        }
        teclado.close();
    }
}
