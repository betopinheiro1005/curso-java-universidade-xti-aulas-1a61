package br.com.xti.heranca;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calculaVolume() {
        return lado * lado * lado;
    }
}
