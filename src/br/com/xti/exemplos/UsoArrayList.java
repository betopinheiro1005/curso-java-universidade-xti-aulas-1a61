package br.com.xti.exemplos;

/**
 * Usar a classe ArrayList para criacao de listas.
 *
 * @author Roberto Pinheiro
 */
import java.util.ArrayList;

public class UsoArrayList {

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Branco");
        // cores.add("Vermelho");
        cores.add(0, "Vermelho");
        cores.add("Amarelo");
        cores.add("Azul");
        System.out.println("\n" + cores.toString());
        System.out.println("Tamanho = " + cores.size());
        System.out.println("\nElemento 2 = " + cores.get(2));
        System.out.println("\nIndice Branco = " + cores.indexOf("Branco"));

        cores.remove("Branco");

        System.out.println("\n" + cores.toString());
        System.out.println("Tem Amarelo?: " + cores.contains("Amarelo"));
        System.out.println("Tem Cinza?: " + cores.contains("Cinza"));
    }

}
