package br.com.xti.exemplos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        int idade = 51;
        double preco = 12.45;
        char sexo = 'M'; // padrao Unicode
        boolean casado = true;

        byte b = 127; // ate aproximadamente 100
        short s = 32767; // ate aproximadamente 32 mil
        int i = 2147483647; // ate aproximadamente 2 bilhões

        long l = 9000000000000000000L; // até 9 quintilhões

        double d = 1.7976931348623157E+308D; // padrão IEEE 754
        float f = 123F;
        long l2 = 8534;

        i = s;
        i = (int) l2;

        System.out.println(i);

        // números na forma binária
        // preceder o número com 0b.
        byte bb = 0b01010101; // 8 bits - 1 byte
        short ss = 0b0101010101010101; // 16 bits - 2 bytes
        int ii = 0b01010101010101010101010101010101; // 32 bits 

        System.out.println(ii);
    }
}
