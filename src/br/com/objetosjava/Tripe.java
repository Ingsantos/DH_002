package br.com.objetosjava;

public class Tripe {

    private boolean dobrado;
    private Integer alturaMinima;
    private Integer alturaMaxima;
    private Integer alturaAtual;

    public Tripe(boolean dobrado, Integer alturaMinima, Integer alturaMaxima, Integer alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }


    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public Integer getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(Integer alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public Integer getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Integer alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public Integer getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(Integer alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void dobrar(boolean posicaoDobrada) {
        if (posicaoDobrada) {
            System.out.println("O tripé está na posição dobrada.");
        } else {
            System.out.println("Para dobrar o tripé, é necessário setar o valor para true.");
        }
        dobrado = posicaoDobrada;
    }

    public void desdobrar(boolean posicaoDesdobrada) {
        if (posicaoDesdobrada) {
            System.out.println("O tripé está na posição desdobrada.");
        } else {
            System.out.println("Para desdobrar o tripé, é necessário setar o valor para false.");
        }
        dobrado = !posicaoDesdobrada;
    }

    public void guardar(int alturaMinimaParaGuardar){
        dobrar(true);
        alturaAtual = alturaMinimaParaGuardar;
        System.out.println("O tamanho que se deseja guardar é: " + alturaAtual);
    }

    public boolean prontoParaGuardar(){
        return dobrado && alturaAtual <= alturaMinima;
    }

    public void usar(int alturaDeUso){
        desdobrar(true);
        alturaAtual = alturaDeUso;
        System.out.println("O tamanho que se deseja utilizar é: " + alturaAtual);
    }

    public boolean prontoParaUsar (){
        return !dobrado && alturaAtual >= alturaMaxima/2;
    }

}
