package br.com.objetosjava;

public class Vendas {
    private Cliente cliente;
    private Veiculo veiculo;
    private double valorDaVenda;

    public Vendas(Cliente cliente, Veiculo veiculo, double valorDaVenda) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorDaVenda = valorDaVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }
}

