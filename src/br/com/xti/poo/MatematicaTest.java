package br.com.xti.poo;

public class MatematicaTest {

    public static void main(String[] args) {

        Matematica m = new Matematica();

        // double so = m.soma(m.maior(2, 4), m.maior(3, 5));
        
        double so = m.soma(2, 4);
        
        System.out.println("\nSoma = " + so);
    }

}
