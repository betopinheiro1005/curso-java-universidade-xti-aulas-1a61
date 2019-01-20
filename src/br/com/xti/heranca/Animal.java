package br.com.xti.heranca;

// public class Animal {

//    double peso;
//    String comida;
//
//    void dormir() {
//        System.out.println("Dormiu");
//    }
//
//    void fazerBarulho() {
//        System.out.println("Fazer Barulho");
//    }

public abstract class Animal {
    private int serial;
    double peso;
    String comida;

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    void dormir() {
        System.out.println("Dormiu");
    }
    //	void fazerBarulho(){System.out.println("Fazer Barulho");}

    abstract void fazerBarulho();

}
