package br.com.objetosjava;

public class E04 {
    public static void main(String[] args) {
        Tripe novoTripe = new Tripe(true, 60, 120, 70);

        System.out.println("--------------------------------");
        novoTripe.guardar(80);
        System.out.println( "O tripe está pronto para guardar? " + novoTripe.prontoParaGuardar());
        System.out.println("--------------------------------");
        novoTripe.usar(100);
        System.out.println("O tripe está pronto para usar? " + novoTripe.prontoParaUsar());
        System.out.println("--------------------------------");
        novoTripe.dobrar(true);
        System.out.println("--------------------------------");
        novoTripe.desdobrar(false);
    }
}
