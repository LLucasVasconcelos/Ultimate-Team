package Model;

import java.util.ArrayList;

public class Plantel {
    protected ArrayList<JogadorAbstract> plantelJogadores = new ArrayList<>();

    public void addJogadores(JogadorAbstract jogadorAbstract) {
        plantelJogadores.add(jogadorAbstract);
    }

    public void removerJogadores(JogadorAbstract jogadorAbstract) {
        plantelJogadores.remove(jogadorAbstract);
    }

    JogadorAbstract buscarJogadorNome(String nome) {
        for (JogadorAbstract jogador : plantelJogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome))
                return jogador;
        }
        return null;
    }
    public ArrayList<JogadorAbstract> getPlantelJogadores() {
        return plantelJogadores;
    }

}
