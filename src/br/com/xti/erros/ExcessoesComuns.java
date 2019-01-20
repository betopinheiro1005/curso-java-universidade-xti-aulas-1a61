package br.com.xti.erros;

import br.com.xti.heranca.Animal;
import br.com.xti.heranca.Cachorro;
import br.com.xti.heranca.Galinha;

public class ExcessoesComuns {
    // static int[] arrayNull; // objeto nulo --> nao existe

    static int[] arrayNull = new int[0];

    public static void main(String[] args) {

        // NullPointerException
        // System.out.println(arrayNull.length);
        // ArithmeticException
        // int x = 5 / 0;
        // ArrayIndexOutOfBoundsException
        // System.out.println(arrayNull[1]);
        // ClassCastException
        // Animal a = new Galinha();
        // Cachorro c = (Cachorro) a;
        // NumberFormatException
        // double d = Double.parseDouble("XTI");
    }
}
