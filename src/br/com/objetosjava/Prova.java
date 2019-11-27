package br.com.objetosjava;

public class Prova {

    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar (Atleta atleta){

        return atleta.getNivel() >= dificuldade && atleta.getEnergia() >= energiaNecessaria;
    }
}
