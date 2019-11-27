package br.com.objetosjava;

public class SessaoDeTreinamento {

    private int experiencia = 0;
    private JogadorDeFutebol jogador;

    public SessaoDeTreinamento() {
    }



    public void treinarA (JogadorDeFutebol jogador){

        if(null==this.jogador||this.jogador!=jogador){
            this.jogador = jogador;
            this.experiencia = 0;
        }

        System.out.println("---------------------------- Inicio de Treinamento ----------------------------");

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        System.out.println("---------------------------- Fim de Treinamento ----------------------------");

        System.out.println("A experiencia anterior do jogador " + jogador.getNome() + " é equivalente a "
                + jogador.getExperiencia() + " pontos.");

        experiencia++;
        jogador.setExperiencia(jogador.getExperiencia()+experiencia);

        System.out.println("A experiência do jogador " + jogador.getNome() + ", conquistada no treinamento é equivalente a:"
                + jogador.getExperiencia() + " pontos.");
    }
}
