package br.com.xti.exemplos;

import java.util.ArrayList;

public class VarrerArray {

    public static void main(String[] args) {

        /* foreach */
        int[] pares = {2, 4, 6, 8};
        for (int i = 0; i < pares.length; i++) {
            int par = pares[i];
            System.out.println(par);
        }

        System.out.println();

        // for aprimorado
        /* so percorre os elementos para a frente. */
        for (int par : pares) {
            System.out.println(par);
        }

        System.out.println();

        /* foreach */
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Integer numero : list) {
            System.out.println(numero);
        }

    }

}
