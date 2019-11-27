package br.com.objetosjava;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String contato;

    //Construtores
    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Cliente(String nome, String sobrenome, String contato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
    }

    public Cliente(){

    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
