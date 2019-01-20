package br.com.xti.exemplos;

/**
 * Testar alguns tipos de operadores.
 *
 * @author Roberto Pinheiro
 */
public class Operador {

    public static void main(String[] args) {

        // 2 + 3 --> operador binario
        // -2 --> operador unario
        // true ? "sim" : "não" --> operador ternario
        int x = 9 + 4;
        String y = "9" + "4";
        double z = 7 - 4 + 3 * 2;
        double w = (7 - 4 + 3) * 2;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);

    }
}
