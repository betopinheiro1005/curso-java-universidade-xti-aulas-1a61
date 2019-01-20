package br.com.xti.poo;

/* Teste dentro do mesmo pacote da classe Funcionario */
public class FuncionarioPacote {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Wellington");
        System.out.println(f.getNome());

    }

}
