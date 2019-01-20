package br.com.xti.exemplos;

public class Fluxo2 {

    public static void main(String[] args) {

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("\nMasculino");
                break;
            case 'F':
                System.out.println("\nFeminino");
                break;
            default:
                System.out.println("\nOutro");
        }

        String tecnologia = "sqlserver";
        switch (tecnologia) {
            case "java":
            case "c++":
            case "cobol":
                System.out.println("\nLinguagem de Programacao");
                break;
            case "oracle":
            case "sqlserver":
            case "postgresql":
                System.out.println("\nBanco de dados");
                break;
            default:
                System.out.println("\nTecnologia desconhecida");
        }
    }
}
