package br.com.xti.heranca;

//public class Galinha extends Animal {
//
//    public Galinha() {
//        super(2, "Milho");
//    }
//
//    @Override
//    void fazerBarulho() {
//        System.out.println("Có, Có !");
//    }
//
//    public double calculaArea() {
//        return 0;
//    }
//
//}
public class Galinha extends Animal implements AreaCalculavel {

    public Galinha() {
        super(2, "Milho");
    }

    void fazerBarulho() {
        System.out.println("Có, Có !");
    }

    @Override
    public double calculaArea() {
        return 0;
    }
}
