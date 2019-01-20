package br.com.xti.exemplos;

/**
 * Testar entrada gráfica de dados com JOptionPane.
 *
 * @author Roberto Pinheiro
 */
import javax.swing.JOptionPane;

public class Entrada2 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu Nome?");
        // System.out.println(nome);
        JOptionPane.showMessageDialog(null, "Bem vindo " + nome + "!");
    }

}
