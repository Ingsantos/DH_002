package br.com.objetosjava;

public class E01 {
    public static void main (String [] args){

        Cliente cliente01 = new Cliente("Inghridy", "Santos");
        Cliente cliente02 = new Cliente("Anderson", "Bittencourt");

        Conta conta01 = new Conta(123456,200.0, cliente01);
        Conta conta02 = new Conta(543210, 200.0, cliente02);


        System.out.println("----------------------- Informações conta 01 -----------------------");
        System.out.println("Numero da Conta: " + conta01.getNumeroDaConta() + "\n" + "Titular: "
                + cliente01.getNome() + " " + cliente01.getSobrenome() + "\n" + "Saldo: R$ "
                + conta01.getSaldo());

        System.out.println("----------------------- Informações conta 02 -----------------------");
        System.out.println("Numero da Conta: " + conta02.getNumeroDaConta() + "\n" + "Titular: "
                + cliente02.getNome() + " " + cliente02.getSobrenome() + "\n" + "Saldo: R$ "
                + conta02.getSaldo());

        System.out.println("----------------------- Transações conta 01 -----------------------");
        conta01.deposito(40.0);
        conta01.saque(20.0);

        System.out.println("----------------------- Transações conta 02 -----------------------");

        conta02.deposito(1.0);
        conta02.saque(2000.0);

    }
}
