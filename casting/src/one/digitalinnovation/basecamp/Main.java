package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 4 de Variáveis, Tipos de Dados e Operadores aritméticos.
 */
public class Main {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;  //Reduzindo a capacidade de representação - Downcast

        long l1;
        int i1 = 10;
        l1 = i1; // Não houve perda de informação - Upcast

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // Houve perda de informação - Downcast

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;   // Mas, nem sempre Downcast se resume a perda de informação - Downcast

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d; //Neste caso, cabe dentro do float
        f2 = (float) d2;
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; //Já aqui haverá perda de informação

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // Perda da parte fracionada, somente o valor 11 foi armazenado, utilizado

        System.out.println("b1 = " + b1 );
        System.out.println("l1 = " + l1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("d1 = " + d1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("i4 = " + i4);

        b1 = (byte) d3; // A maior representação para o menor dado possivel,
        // isso prova que a conversão pode ser feita entre qualquer tipo de dado; lembrando que Downcaste pode causar perda de dados;

        System.out.println("b1 = " + b1);



    }

}
