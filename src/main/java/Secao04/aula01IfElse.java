package Secao04;

import java.util.Scanner;

public class aula01IfElse {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 10");
        int i = read.nextInt();

        if (i == 3){
            System.out.println("O número informado é igual a: 3");
        }else if (i > 3){
            System.out.println("O número informado é maior que: 3");
        }else {
            System.out.println("O número informado é menor que: 3");
        }

        read.close();
    }
}
