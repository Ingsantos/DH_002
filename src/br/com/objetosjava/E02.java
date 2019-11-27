package br.com.objetosjava;

public class E02 {
    public static void main (String [] args){

        JogadorDeFutebol jogador01 = new JogadorDeFutebol("João", 0, 0, 0, 0);
        JogadorDeFutebol jogador02 = new JogadorDeFutebol("Kleber",10, 20, 0, 0);

        SessaoDeTreinamento sessao01 = new SessaoDeTreinamento();
        SessaoDeTreinamento sessao02 = new SessaoDeTreinamento();

        sessao01.treinarA(jogador01);
        sessao02.treinarA(jogador02);
        sessao01.treinarA(jogador01);
        sessao02.treinarA(jogador02);
        sessao02.treinarA(jogador02);

    }

}
