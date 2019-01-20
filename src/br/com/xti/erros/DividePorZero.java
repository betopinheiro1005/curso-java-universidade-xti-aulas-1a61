package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean continua = true;

        do {

            try {
                System.out.print("\nNumero: ");
                int a = s.nextInt();
                System.out.print("Divisor: ");
                int b = s.nextInt();

                System.out.println(a / b);
                continua = false;
            } catch (InputMismatchException e1) {
                System.out.println("Numeros devem ser inteiros");
                s.nextLine();
                // descarta a entrada errada e libera novamente para o usuario
            } catch (ArithmeticException e2) {
                System.err.println("Divisor deve ser diferente de Zero");
            } finally {
                System.out.println("Finally executado...");
            }

        } while (continua);

    }
}
