package br.com.xti.java;

public class StringOperacoes {

    public static void main(String[] args) {

        String s1 = "Write Once";
        String s2 = s1 + " Run Anywhere";
        String s3 = new String("Java Virtual Machine");
        char[] array = {'J', 'a', 'v', 'a'};
        String s4 = new String(array);

        // OPERACOES
        int tamanho = s1.length();
        // retorna o numero de caracteres dentro da string
        System.out.println(tamanho);

        char letra = s1.charAt(0); // de 0 a length() - 1
        System.out.println(letra);

        String texto = s1.toString(); // retorna a propria string
        System.out.println(texto);

        // LOCALIZACAO
        int posicao = s3.indexOf('J');
        System.out.println(posicao);

        int firstpos = s3.indexOf("Virtual");
        System.out.println(firstpos);

        int lastpos = s3.lastIndexOf('a');
        System.out.println(lastpos);

        boolean vazia = s3.isEmpty();
        System.out.println(vazia);

        // COMPARACAO		
        String xti = "XTI";
        boolean x = xti.equals("xti");
        System.out.println(x);

        boolean x2 = xti.equalsIgnoreCase("xti");
        System.out.println(x2);

        boolean x3 = xti.startsWith("XT");
        System.out.println(x3);

        boolean x4 = xti.startsWith("TI");
        System.out.println(x4);

        boolean x5 = xti.endsWith("TI");
        System.out.println(x5);

        int c = "amor".compareTo("bola"); // -1
        System.out.println(c);

        int c1 = "bola".compareTo("amor"); // 1
        System.out.println(c1);

        int c2 = "amor".compareTo("amor"); // 0
        System.out.println(c2);

        int c3 = "123".compareTo("234"); // -1
        System.out.println(c3);

        String so = "Olhe, olhe!";
        // boolean o = so.regionMatches(6, "Olhe", 0, 4);
        boolean o = so.regionMatches(true, 6, "Olhe", 0, 4);
        System.out.println(o);

        // EXTRACAO
        String l = "O Brasil é Lindo";
        String sl = l.substring(11);
        System.out.println(sl);

        String sl2 = l.substring(2, 8);
        System.out.println(sl2);

        sl = l.concat(" que Maravilha!");
        System.out.println(sl);

        // TROCA
        sl = l.replace('s', 'z');
        System.out.println(sl);

        sl = l.replaceFirst(" ", "X");
        System.out.println(sl);

        sl = l.replaceAll(" ", "X");
        System.out.println(sl);

        // MODIFICACAO
        sl = l.toUpperCase();
        System.out.println(sl);

        sl = l.toLowerCase();
        System.out.println(sl);

        System.out.println("   espaços   ".trim());
        // remove espacos em branco antes e depois da string

    }

}
