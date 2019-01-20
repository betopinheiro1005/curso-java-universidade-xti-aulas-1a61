package br.com.xti.poo;

public class Matematica4 {

    double soma(double... numeros) {
        // System.out.println(titulo);
        double total = 0;
        for (double n : numeros) {
            total += n;
        }
        return total;
    }

    double media(double x, double y) {
        System.out.print("\nmedia(int x, int y): ");
        return (x + y) / 2;
    }

    double media(String x, String y) {
        System.out.print("media(String x, String y): ");
        int ix = Integer.parseInt(x);
        int iy = Integer.parseInt(y);
        return (ix + iy) / 2;
    }

    double media(double x, double y, double z) {
        System.out.print("media(int x, int y, int z): ");
        return (x + y + z) / 3;
    }

    double media(double... numeros) {
        System.out.print("media(double ... numeros): ");
        return this.soma(numeros) / numeros.length;
    }

}
