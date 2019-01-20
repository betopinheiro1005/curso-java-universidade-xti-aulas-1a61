package br.com.xti.heranca;

public class InterfaceTest {

    public static void area(AreaCalculavel o) {
        System.out.println(o.calculaArea());
    }

    public static void volume(VolumeCalculavel o) {
        System.out.println(o.calculaVolume());
    }

    public static void main(String[] args) {

        // Quadrado q = new Quadrado(2);
        // AreaCalculavel a = q;
        area(new Quadrado(2));
        volume(new Cubo(2));

    }
}
