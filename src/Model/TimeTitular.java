package Model;

import java.util.ArrayList;

public class TimeTitular {
    protected ArrayList<JogadorAbstract> jogadoresTitulares = new ArrayList<>();
    protected int defesa;

    protected int meio;
    protected int ataque;
    public void addJogadoresTimetitular(JogadorAbstract jogador) {

        getJogadoresTitulares().add(jogador);
    }
    public void removerJogadores(JogadorAbstract jogadorAbstract){
        getJogadoresTitulares().remove(jogadorAbstract);
    }


    public TimeTitular(int defesa, int meio, int ataque) {
        if (defesa >= 2) {
            this.defesa = defesa;
        } else System.out.println("A Defesa tem que ser um valor maior que 2");
        if (ataque <= 4) {
            this.ataque = ataque;
        } else System.out.println("O Ataque tem que ser um valor maior que 2");
        if (meio <= 6) {
            this.meio = meio;
        } else System.out.println("O Meio tem que ser um valor maior que 2");

        if (meio + ataque + defesa > 10) {
            System.out.println("Time com mais de 11 jogadores");
        }
    }

    public JogadorAbstract buscarJogadorTimetitular(String nome){
        for(JogadorAbstract jogador: getJogadoresTitulares()){
            if (jogador.getNome().equalsIgnoreCase(nome)){
                return jogador;
            }
        }return null;
    }


    public ArrayList<JogadorAbstract> getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public int getDefesa() {
        return defesa;
    }


    public int getMeio() {
        return meio;
    }

    public void setMeio(int meio) {
        this.meio = meio;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
