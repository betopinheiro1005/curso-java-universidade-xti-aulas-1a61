package br.com.xti.poo;

public class ContaTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = "Ricardo";
        conta.saldo = 10000.00;
        conta.exibeSaldo();

        Conta destino = new Conta();
        destino.cliente = "Lawrence";
        destino.saldo = 80000.00;
        destino.exibeSaldo();

        conta.saca(1000);
        conta.exibeSaldo();
        conta.deposita(6000);
        conta.exibeSaldo();

        conta.transferePara(destino, 1550.00);
        conta.exibeSaldo();
        destino.exibeSaldo();

    }

}
