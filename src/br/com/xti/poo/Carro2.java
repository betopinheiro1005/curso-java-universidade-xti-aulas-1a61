package br.com.xti.poo;

public class Carro2 {

    String modelo;
    int velMax;
    double seg0A100;
    Motor motor;

    // construtor vazio
    public Carro2() {

    }

    public Carro2(String modelo, int velMax, double seg0A100) {
        this(modelo, velMax, seg0A100, null);
    }

    public Carro2(String modelo, int velMax, double seg0A100, Motor motor) {
        this.modelo = modelo;
        this.velMax = velMax;
        this.seg0A100 = seg0A100;
        this.motor = motor;
    }

}
