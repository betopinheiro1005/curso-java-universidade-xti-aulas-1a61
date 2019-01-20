package br.com.xti.poo;

public class Matematica2Test {

    public static void main(String[] args) {

        Matematica2 m = new Matematica2();

        int raiz = m.raiz(27);
        System.out.println("\n" + raiz);

        raiz = m.raiz(276);
        System.out.println("\n" + raiz);

        System.out.println(Math.sqrt(27));
        System.out.println(Math.sqrt(276));

    }

}
