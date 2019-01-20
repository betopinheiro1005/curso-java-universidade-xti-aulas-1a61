package br.com.xti.exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class FluxoRepet2 {

    public static void main(String[] args) {

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        };

        System.out.println();

        i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println();

        ArrayList<String> produtos = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Liste seus produtos - Para sair digite FIM");

        String produto;

        while (!"FIM".equals(produto = s.nextLine())) {
            produtos.add(produto);
        }

        System.out.println(produtos.toString());

    }

}
