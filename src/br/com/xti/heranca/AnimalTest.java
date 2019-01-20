package br.com.xti.heranca;

public class AnimalTest {

//    public static void main(String[] args) {
//        Cachorro toto = new Cachorro();
//        toto.comida = "Carne";
//        toto.dormir();
//
//        Galinha carijo = new Galinha();
//        carijo.dormir();
// --------------------------------------------------------------------------
//        Cachorro toto = new Cachorro();
//        toto.comida = "Carne";
//        toto.dormir();
//
//        Galinha carijo = new Galinha();
//        carijo.dormir();
//
//        System.out.println(toto instanceof Cachorro);
//        System.out.println(toto instanceof Animal);
//    }
// ---------------------------------------------------------------------------    

    // uso de polimorfismo
    public static void barulho(Animal animal) {
        animal.fazerBarulho();
    }

    public static void barulhoSemPolimorfismo(String animal) {
        if (animal.equals("Cachorro")) {
            System.out.println("Au Au !");
        } else if (animal.equals("Galinha")) {
            System.out.println("Có, Có !");
        }
    }

    public static void main(String[] args) {

        Cachorro toto = new Cachorro();
        toto.comida = "Carne";
        toto.dormir();

        Galinha carijo = new Galinha();
        carijo.dormir();

//        Animal generico = new Animal(0, null);

        System.out.println(toto instanceof Cachorro);
        System.out.println(toto instanceof Animal);

        toto.fazerBarulho();
        carijo.fazerBarulho();
//        generico.fazerBarulho();

        System.out.println();

        barulho(toto);
        barulho(carijo);

        System.out.println();

        barulhoSemPolimorfismo("Cachorro");
        barulhoSemPolimorfismo("Galinha");

    }

}
