package br.com.xti.poo;

public class Galinha {

    public static int ovosDaGranja; // variavel global
    public int ovos; // total de ovos do objeto galinha

    public Galinha botar() {
        this.ovos++;
        Galinha.ovosDaGranja++;
        return this;
    }

    public static double mediaDeOvos(int galinhas) {
        return (double) Galinha.ovosDaGranja / galinhas;
    }

}
