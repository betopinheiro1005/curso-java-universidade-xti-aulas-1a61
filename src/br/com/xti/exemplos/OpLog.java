package br.com.xti.exemplos;

/**
 * Testar operadores lógicos.
 *
 * @author Roberto Pinheiro
 */
public class OpLog {

    public static void main(String[] args) {

        int x = 6;

        System.out.println("\nx esta entre 1 e 10?");
        System.out.println((x >= 1) && (x <= 10));

        System.out.println("\nx maior que 1 ou x menor que 5?");
        System.out.println((x >= 1) || (x <= 5));

        System.out.println("\nx menor ou igual a 1?");
        System.out.println(!(x >= 1));
    }
}
