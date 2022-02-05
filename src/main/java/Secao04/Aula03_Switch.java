package Secao04;

import java.util.Scanner;

public class Aula03_Switch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número:");
        int i = read.nextInt();

        switch (i){
            case 1:
                System.out.println("O número é: 1");
                break;
            case 3:
                System.out.println("O número é: 3");
                break;
            case 5:
                System.out.println("O número é: 5");
                break;
            default:
                System.out.println("Número é " + i);
                break;
        }

        read.close();


    }
}
