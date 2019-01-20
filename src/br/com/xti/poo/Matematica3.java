package br.com.xti.poo;

public class Matematica3 {

    double soma(String titulo, double... numeros) {
        System.out.println(titulo);
        double total = 0;
        for (double n : numeros) {
            total += n;
        }
        return total;
    }

}
