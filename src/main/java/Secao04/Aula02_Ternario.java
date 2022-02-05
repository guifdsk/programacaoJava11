package Secao04;

import java.util.Scanner;

public class Aula02_Ternario {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número:");
        int i = read.nextInt();

        /*
            if(valor >0){
                numero = valor;
            }else{
                numero = 7;
            }
        */

        //Operador Ternário
       int numero = (i == 0) ? i : 7;

       int numeroComMetodo = (i == 0) ? getValorIgualAZero(i) : getValorDiferenteDeZero(i);

        System.out.println(numero);

        System.out.println(numeroComMetodo);

        read.close();
    }

    private static int getValorDiferenteDeZero(int i) {
        return 7;
    }

    private static int getValorIgualAZero(int i) {
        return i;
    }
}
