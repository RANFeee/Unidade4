package unidade_4;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char sexo = Character.toUpperCase(teclado.next().charAt(0)); 
        String resultado = "";
        switch (sexo) {
            case 'F':
                resultado = "Feminino";
                break;
            case 'I':
                resultado = "Nao Informado";
                break;       
            case 'M':
                resultado = "Masculino";
                break;
            default:
                resultado = "Entrada errada";
                break;
        }
        System.out.println(resultado);
        teclado.close();
    }
} 
