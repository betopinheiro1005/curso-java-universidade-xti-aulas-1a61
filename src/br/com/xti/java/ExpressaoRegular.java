package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

    public static void main(String[] args) {

        // String padrao = "Java";
        // String texto = "Java";
        // boolean b = texto.matches(padrao);
        boolean b = "Java".matches("Java");
        System.out.println(b);

        boolean b1 = "Java".matches("java");
        System.out.println(b1);

        /* MODIFICADORES
			(?I), Ignora maiuscula e minuscula
			(?x), Comentarios
			(?m), Multilinhas
			(?s), Dottal */
        boolean b2 = "Java".matches("(?i)java");
        System.out.println(b2);

        /* METACARACTERES
			.    qualquer caracter
			\d   digitos            [0-9]
			\D   não é digito       [^0-9]
			\s   espaços            [ \t\n\x0B\f\r]
			\S   não é espaço       [^\s]
			\w   letra              [a-zA-Z_0-9]
			\W   não é letra */
        b = "@".matches(".");
        b = "2".matches("\\d");
        b = "a".matches("\\d");
        b = "a".matches("\\w");
        b = "#".matches("\\d");
        b = " ".matches("\\s");
        b = "R".matches("\\s");
        b = "Pi".matches(".");
        b = "Pi".matches("..");
        b = "Pie".matches("...");
        b = "21".matches("\\d\\d");

        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        b = "70294-070".matches(cep);
        System.out.println(b);

        /* QUANTIFICADORES
			X{n}    X, exatamente n vezes
			X{n,}   X, pelo menos n vezes
			X{n,m}  X, pelo menos n mas não mais do que m vezes
			X?      X, 0 ou 1 vez
			X*      X, 0 ou + vezes
			X+      X, 1 ou + vezes */
        b = "21".matches("\\d{2}");
        b = "123".matches("\\d{2,}");
        b = "12345".matches("\\d{2,5}");
        b = "123456".matches("\\d{2,5}");
        b = "".matches(".?"); // 0 ou 1 vez
        b = "ab".matches(".*"); // 0 ou + vezes
        b = "".matches(".+"); // 1 ou + vezes
        b = "123".matches(".+");

        b = "70294-070".matches("\\d{5}-\\d{3}");
        b = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}");
        System.out.println(b);

        /* METACARACTER DE FRONTEIRA
			^ inicia
			$ finaliza
			| ou */
        b = "Pier21".matches("^Pier.*");
        b = "Pier21".matches(".*21$");
        b = "tem java aqui".matches(".*java.*");
        b = "tem java aqui".matches("^tem.*aqui$");
        b = "sim".matches("sim|nao");
        System.out.println(b);

        /* AGRUPADORES
			[...]              Agrupamento
			[a-z]              Alcance
			[a-e]{i-u]         União
			[a-z&&[aeiou]]     Intersecção
			[abc]              Exceção
			[a-z&&[^m-p]]      Subtração
			\x                 Fuga literal */
        b = "x".matches("[a-z]");
        b = "2".matches("[a-z]");
        b = "A".matches("[a-z]");
        b = "3".matches("[0-9]");

        b = "True".matches("[tT]rue"); // true True
        b = "yes".matches("[tT]rue|[yY]es"); // true True yes Yes
        b = "Beatriz".matches("[A-Z][a-zA-Z]*"); // Primeiro nome
        b = "Beatriz".matches("[A-Z][a-z]*");
        b = "olho".matches("[^abc]lho");
        b = "alho".matches("[^abc]lho");
        b = "crau".matches("cr[ae]u"); // crau creu

        b = "rh@xtiuniversity.com".matches("\\w+@\\w+\\.\\w{2,3}");
        System.out.println(b);

        String doce = "Qual é o Doce mais doCe que o doce?";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // SUBSTITUICOES
        String r = doce.replaceAll("(?i)doce", "DOCINHO");

        String rato = "O rato roeu a roupa do rei de roma";
        r = rato.replaceAll("r[aeiou]", "XX");
        r = "Tabular este texto".replaceAll("\\s", "\t");
        System.out.println(r);

        String url = "www.xti.com.br/clientes-2011.html";
        // http://www.xti.com.br/2011/clientes.jsp --> Objetivo
        String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
        b = url.matches(re);
        System.out.println(b);

        re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
        r = url.replaceAll(re, "http://$1/$3/$2.jsp");
        System.out.println(r);

    }

}
