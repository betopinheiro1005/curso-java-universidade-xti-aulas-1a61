package br.com.xti.poo;

public class CarroTest {

    public static void main(String[] args) {

        Carro ferrari = new Carro(); // Carro() --> construtor
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velMax = 349;
        ferrari.seg0A100 = 3.2;

        Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
        System.out.println(koenigsegg.modelo);
    }

}
