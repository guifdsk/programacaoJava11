package aula01;

public class TiposDeDados {
    public static void main(String[] args){
        /*
        TIPOS DE VARIÁVEIS
        O Java possui dois tipos de dados que são divididos em por valor (tipos primitivos) e por referência
        (tipos por referência).

        PRIMITIVOS:
        Temos 8 tipos primitivos:
            São 4 tipos de inteiros:
                int - representando números de -2,147,483,648 a 2,147,483,647, ocupa espaço de 4 bytes.
                short - com espaço de 2 bytes.
                long - que ocupa espaço de 8 bytes.
                byte - que ocupa espaço de 1 byte.
            São 2 tipos com pontos flutuantes (representações de números reais):
                double - tem precisão de 15 casas decimais significantes, e ocupa 8 bytes.
                float - precisão de 6 casas decimais significativas, ocupando 4 bytes.
            Temos 1 tipo de character:
                char - representando um símbolo/letra.
            E um tipo booleano:
                boolean - pode somente ter os valores true (verdadeiro) ou false (falso).
        */

        //Exemplo
        System.out.println("Tipos de dados em Java: " +
                "\nMenor Byte: " + Byte.MIN_VALUE +
                "\nMaior Byte: " + Byte.MAX_VALUE +
                "\nMenor Short Int: " + Short.MIN_VALUE +
                "\nMaior Short Int: " + Short.MAX_VALUE +
                "\nMenor Int: " + Integer.MIN_VALUE +
                "\nMaior Int: " + Integer.MAX_VALUE +
                "\nMenor Long: " + Long.MIN_VALUE +
                "\nMaior Long:" + Long.MAX_VALUE +
                "\nMenor Float: " + Float.MIN_VALUE +
                "\nMaior Float: " + Float.MAX_VALUE +
                "\nMenor Double: " + Double.MIN_VALUE +
                "\nMaior Double: " + Double.MAX_VALUE);

        //Declaração de variáveis
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println(
                "\nValor do tipoByte = " + tipoByte +
                        "\nValor do tipoShort = " + tipoShort +
                        "\nValor do tipoChar = " + tipoChar +
                        "\nValor do tipoFloat = " + tipoFloat +
                        "\nValor do tipoDouble = " + tipoDouble +
                        "\nValor do tipoInt = " + tipoInt +
                        "\nValor do tipoLong = " + tipoLong +
                        "\nValor do tipoBooleano = " + tipoBooleano
        );

        /*
        REFERÊNCIA:
        Os programas utilizam as variáveis de tipos por referência para armazenar as localizações de objetos na memória
        do computador. Esses objetos que são referenciados podem conter várias variáveis de instância e métodos dentro
        do objeto apontado. Para trazer em um objeto os seus métodos de instância, é preciso ter referência a algum
        objeto. As variáveis de referência são inicializadas com o valor “null” (nulo).
        */

        //Exemplo
        TiposDeDados acessa = new TiposDeDados();
        acessa.imprime();
    }

    public void imprime(){
        System.out.println("\nBem Vindo ao Java!");

        Integer valor = null;
        //int valor2 = null; esse caso não é aceito o valor null para um tipo primitivo

        System.out.println("\nVariavel referência pode ser inicializada como null" + valor);
    }
}
