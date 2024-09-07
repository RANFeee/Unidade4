package Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade1 = teclado.nextInt();
        int idade2 = teclado.nextInt();
        int idade3 = teclado.nextInt();
        if (idade1 == idade2 && idade1 == idade3 && idade2 == idade3) {
            System.out.println("TRIGÊMEOS");
        } else {
            if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3 ) {
                System.out.println("GÊMEOS");
            }else{
                if (idade1 != idade2 || idade1 != idade3 || idade2 != idade3) {
                    System.out.println("APENAS IRMÃOS");
                } 
            }
        }
        teclado.close();
    }
}
