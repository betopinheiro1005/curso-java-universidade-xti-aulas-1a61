package br.com.xti.exemplos;

/**
 * Testar operadores matemáticos.
 *
 * @author Roberto Pinheiro
 */
public class OpMat {

    public static void main(String[] args) {

        int x1 = 7 + 3;
        int x2 = 7 % 2;
        String y = "Oi " + "Programador Java";

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(y);

        int a = 6; // a = 6
        int b = 4; // b = 4
        int c = ++a; // pre-incremento: a = a + 1 e b = a
        // (primeiro incrementa "a" e depois atribui o resultado a "c")
        int d = b++; // pos-incremento: d = b e b = b + 1
        // (atribui a "d" o valor de "b" e depois incrementa "b")

        System.out.println("\na = " + a); // a = 7
        System.out.println("c = " + c); // c = 7
        System.out.println("b = " + b); // b = 5
        System.out.println("d = " + d); // d = 4

        int e = --a; // pre-decremento: a = 6 ; e = 6 
        int f = b--; // pos-decremento: f = 5 ; b = 4

        System.out.println("\na = " + a); // a = 6
        System.out.println("e = " + e); // e = 6
        System.out.println("b = " + b); // b = 4
        System.out.println("f = " + f); // d = 5

    }
}
