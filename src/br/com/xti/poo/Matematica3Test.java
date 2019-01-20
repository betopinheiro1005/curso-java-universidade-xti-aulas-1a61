package br.com.xti.poo;

public class Matematica3Test {

    public static void main(String[] args) {

        Matematica3 m = new Matematica3();

        double total = m.soma("\nNumeros", 2, 3, 5, 6, 7, 123, 345, 69);
        System.out.println("Total = " + total);
    }

}
