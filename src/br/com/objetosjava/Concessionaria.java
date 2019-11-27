package br.com.objetosjava;

import java.util.ArrayList;

public class Concessionaria {

    private ArrayList<Vendas> registro = new ArrayList<>();

    public Concessionaria() {
    }

    public ArrayList<Vendas> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Vendas> registro) {
        this.registro = registro;
    }

    public ArrayList<Vendas> registrarVendas (Cliente cliente, Veiculo veiculo, double valorDaVenda){

        Vendas venda = new Vendas(cliente, veiculo, valorDaVenda);
        registro.add(venda);

        return registro;
    }
}
