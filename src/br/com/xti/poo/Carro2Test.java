package br.com.xti.poo;

public class Carro2Test {

    public static void main(String[] args) {

        Carro2 ferrari = new Carro2(); // Carro() --> construtor
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velMax = 349;
        ferrari.seg0A100 = 3.2;

        Motor v12 = new Motor();
        v12.tipo = "V12";
        v12.potencia = 660;
        ferrari.motor = v12; // adiciona o motor ao carro

        Carro2 k = new Carro2("Koenigsegg CCXR", 430, 3.1);
        Motor v8 = new Motor("V8", 1018);
        k.motor = v8;

        Motor w16 = new Motor();
        w16.tipo = "W16";
        w16.potencia = 1200;

        Carro2 bugatti = new Carro2("Bugatti Veyron", 430, 2.2, w16);

        System.out.println(k.modelo);
        System.out.println(k.motor.potencia);
        System.out.println(bugatti.modelo);
        System.out.println(bugatti.motor.potencia);

    }

}
