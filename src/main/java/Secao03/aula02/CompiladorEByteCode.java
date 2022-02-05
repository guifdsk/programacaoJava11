package Secao03.aula02;

public class CompiladorEByteCode {
    public static void main (String[] args){
        //Declarando e inicializando variável
        int idade = 28;

        System.out.println("Eu tenho " + idade + " anos." );

        /*
        NO TERMINAL:
            Comando: javac compiladorEByteCode.java
            -> Cria o arquivo compiladorEByteCode.class
            Comando: java compiladorEByteCode
            -> Executa a classe e roda as instruções que criamos no nosso código
        */
    }
}
