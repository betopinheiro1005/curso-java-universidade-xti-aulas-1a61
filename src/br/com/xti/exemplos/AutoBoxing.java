package br.com.xti.exemplos;

public class AutoBoxing {

    public static void main(String[] args) {

        Integer x = new Integer(555); // empacotado
        int a = x.intValue(); // desempacotar
        a++; // incrementa
        x = new Integer(a); // re-empacotar
        System.out.println(x.intValue());

        System.out.println();

        // recursos inseridos a partir da versao 5 do Java SE
        Integer y = 555;
        y++; // desempacota, incrementa e reempacota
        System.out.println(y);

        System.out.println();

        Boolean v = new Boolean("true");
        if (v) {
            System.out.println(v);
        }
    }

}
