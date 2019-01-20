package br.com.xti.exemplos;

public class FluxoRepet {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        String texto = "";
        for (int i = 0; i < 3; i++) {
            texto += i + ",";
        }
        System.out.println("\n" + texto);

        String texto2 = "";
        for (int i = 10; i > 0; i--) {
            texto2 += i + ",";
        }
        System.out.println("\n" + texto2);

        String texto3 = "";
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                texto3 += i + ",";
            }
        }
        System.out.println("\n" + texto3);

        System.out.println();
        int tamanho = 10;
        for (int x = 0; x < tamanho; x++) {
            for (int i = 0; i < tamanho; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
