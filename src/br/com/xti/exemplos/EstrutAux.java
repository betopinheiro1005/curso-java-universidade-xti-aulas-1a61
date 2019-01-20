package br.com.xti.exemplos;

public class EstrutAux {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Entrou");
            break;
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        boolean[][] matrix
                = {
                    {false, true, false, false, false},
                    {false, false, false, false, false}
                };

        busca:
        for (int a = 0; a < matrix.length; a++) {
            System.out.print("A ");
            for (int b = 0; b < matrix[a].length; b++) {
                if (matrix[a][b]) {
                    System.out.print("TRUE ");
                    break busca;
                }
                System.out.print("B ");
            }
        }

    }

}
