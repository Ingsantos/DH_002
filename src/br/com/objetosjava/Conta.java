package br.com.objetosjava;

public class Conta {

    private int numeroDaConta;
    private double saldo;
    private Cliente titular;

    public Conta(int numeroDaConta, double saldo, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //metodos

    public void deposito(double dinheiro) {
        saldo += dinheiro;
        System.out.println("O valor depositado é: R$" + dinheiro + ". E o saldo atual é: R$" + saldo);
    }

    public void saque (double dinheiro){
        if(dinheiro <= saldo){
            saldo-=dinheiro;
            System.out.println("A quantia retirado foi: R$ " + dinheiro + ". E o saldo atual é: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
