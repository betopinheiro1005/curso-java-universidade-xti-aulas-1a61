package br.com.xti.exemplos;

/**
 * Apresentar conceitos de Array.
 *
 * @author Roberto Pinheiro
 */
import java.util.Arrays;

public class ArraySimples {

    public static void main(String[] args) {

        int[] impares = new int[5];
        impares[0] = 1;
        impares[1] = 3;
        impares[2] = 5;
        impares[3] = 7;
        impares[4] = 9;

        String[] paises = {"Brasil", "Russia", "India", "China"};
        paises[0] = "Argentina";

        System.out.println("\n" + paises[0]);
        System.out.println("\n" + paises.length);
        System.out.println("\n" + Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "Russia");
        System.out.println("\n" + posicao);
        Arrays.sort(paises, 0, paises.length);
        System.out.println("\n" + Arrays.toString(paises));

        Double[] valores = {12.35, 3456.3456};
        System.out.println("\n" + valores[0].doubleValue());
    }
}
