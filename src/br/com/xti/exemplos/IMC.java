package br.com.xti.exemplos;

/**
 * Cacular o IMC (indice de massa corporal) IMC = pesoEmQuilogramas /
 * (alturaEmMetros * alturaEmMetros)
 *
 * @author Roberto Pinheiro
 */
import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {

        String peso = JOptionPane.showInputDialog("Informe seu peso (em kg):");
        String altura = JOptionPane.showInputDialog("Informe sua altura (em m):");
        double pesoEmQuilogramas = Double.parseDouble(peso);
        double alturaEmMetros = Double.parseDouble(altura);
        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
        String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso ideal";
        msg = "IMC = " + imc + "\n" + msg;
        JOptionPane.showMessageDialog(null, msg);

    }
}
