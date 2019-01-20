package br.com.xti.exemplos;

/**
 * Testar operadores de atribuição.
 *
 * @author Roberto Pinheiro
 */
public class OpAtrib {

    public static void main(String[] args) {
        int x = 6;
        x += 3; // equivale a x = x + 3

        int y = 6;
        y -= 3; // equivale a y = y - 3

        int z = 6;
        z *= 3; // equivale a z = z * 3

        int w = 6;
        w /= 3; // equivale a w = w / 3

        int a = 6;
        a %= 3; // equivale a a = a % 3

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(a);
    }
}
