package br.com.objetosjava;

import java.util.ArrayList;

public class E05 {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo("Kia", "Sorento", 2016, "preto", 14000);
        Cliente cliente = new Cliente("Anderson", "Bittencourt", "+55 11 999 594 909");
        Vendas venda = new Vendas(cliente, carro, 107000);
        Concessionaria teste = new Concessionaria();

        ArrayList<Vendas> azul = teste.registrarVendas(venda.getCliente(), venda.getVeiculo(), venda.getValorDaVenda());

        //registro.registrarVendas(cliente, carro, venda.getValorDaVenda());
        //teste.setRegistro(teste.registrarVendas(venda.getCliente(), venda.getVeiculo(), venda.getValorDaVenda()));

        //teste.registrarVendas(venda.getCliente(), venda.getVeiculo(), venda.getValorDaVenda());

        System.out.println("Imprimindo registro de Concessionaria");
        System.out.println(azul);

        for (int i = 0;  i < azul.size(); i++){
            System.out.println(azul.get(i));
        }

    }
}
