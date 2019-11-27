package br.com.objetosjava;

public class E03 {
    public static void main(String[] args) {

        Atleta jogador01 = new Atleta("Pedro", 50, 10);
        Atleta jogador02 = new Atleta("Mario", 5, 7);

        Prova prova01 = new Prova(1, 5);
        Prova prova02 = new Prova(2, 10);
        Prova prova03 = new Prova(3, 15);


        System.out.println("-----------------------------------------------------");
        System.out.println(" O jogador " + jogador01.getNome() + " pode realizar a prova 01? "+ prova01.podeRealizar(jogador01));
        System.out.println(" O jogador " + jogador01.getNome() + " pode realizar a prova 02? "+ prova02.podeRealizar(jogador01));
        System.out.println(" O jogador " + jogador01.getNome() + " pode realizar a prova 03? "+ prova03.podeRealizar(jogador01));
        System.out.println("-----------------------------------------------------");
        System.out.println(" O jogador " + jogador02.getNome() + " pode realizar a prova 01? "+ prova01.podeRealizar(jogador02));
        System.out.println(" O jogador " + jogador02.getNome() + " pode realizar a prova 02? "+ prova02.podeRealizar(jogador02));
        System.out.println(" O jogador " + jogador02.getNome() + " pode realizar a prova 03? "+ prova03.podeRealizar(jogador02));


            }
}
