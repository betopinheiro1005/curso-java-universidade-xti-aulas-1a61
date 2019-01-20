package br.com.xti.poo;

public class Matematica2 {

    /**
     * retorna a raiz quadrada do numero segundo a equacao de Pell
     */
    int raiz(int numero) {

        int raiz = 0, impar = 1;
        while (numero >= impar) {
            numero -= impar;
            impar += 2; // proximo numero impar
            ++raiz;
        }
        return raiz;
    }

}
