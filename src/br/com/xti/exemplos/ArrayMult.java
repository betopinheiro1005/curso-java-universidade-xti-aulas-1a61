package br.com.xti.exemplos;

/**
 * Apresentar conceitos de Array Multidimensional.
 *
 * @author Roberto Pinheiro
 */
import java.util.Random;

public class ArrayMult {

    public static void main(String[] args) {

        String[][] duas = {{"Ricardo", "M", "DF"}, {"Sandra", "F", "MG"}};

        System.out.println("\n" + duas[1][0]);
        System.out.println(duas.length);
        System.out.println(duas[0].length);

        duas[1][0] = "Denise";
        System.out.println("\n" + duas[1][0]);

        String[] faces
                = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};

        Random r = new Random();

        int indiceFace = r.nextInt(faces.length);
        String face = faces[indiceFace];

        int indiceNipe = r.nextInt(nipes.length);
        String nipe = nipes[indiceNipe];

        String carta = face + " de " + nipe;
        System.out.println("\n" + carta);

    }

}
