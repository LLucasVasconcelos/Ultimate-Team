package Model;

import java.util.ArrayList;

public class Mercado {

    public ArrayList<JogadorAbstract> jogadoresMercado = new ArrayList<>();

    public void addJogadores(JogadorAbstract jogador) {
        jogadoresMercado.add(jogador);
    }

    public void removerJogadores(JogadorAbstract jogadorAbstract) {
        jogadoresMercado.remove(jogadorAbstract);
    }


    public JogadorAbstract buscarJogadorMenorPrecoPosicao(String posicao) {
        float menorpreco = 0;
        for (JogadorAbstract jogadorAbstract : getJogadoresMercado()) {
            if (jogadorAbstract.getValor() < menorpreco && jogadorAbstract.getPosicao().equalsIgnoreCase(posicao)) {
                menorpreco = jogadorAbstract.getValor();
            }
        }
        for (JogadorAbstract jogadorAbstract : getJogadoresMercado()) {
            if (jogadorAbstract.getValor() == menorpreco && jogadorAbstract.getPosicao().equalsIgnoreCase(posicao)) {
                return jogadorAbstract;
            }
        }
        return null;
    }

    public JogadorAbstract buscarJogadorMenorPrecoTipo(String tipoCarta) {
        float menorpreco = 0;
        for (JogadorAbstract jogadorAbstract : getJogadoresMercado()) {
            if (jogadorAbstract.getValor() < menorpreco && jogadorAbstract.tipoCarta().equalsIgnoreCase(tipoCarta)) {
                menorpreco = jogadorAbstract.getValor();
            }
        }
        for (JogadorAbstract jogadorAbstract : getJogadoresMercado()) {
            if (jogadorAbstract.getValor() == menorpreco && jogadorAbstract.tipoCarta.equalsIgnoreCase(tipoCarta)) {
                return jogadorAbstract;
            }
        }
        return null;
    }


    public ArrayList<JogadorAbstract> getJogadoresMercado() {
        return jogadoresMercado;
    }
    public JogadorAbstract buscarJogadorNome(String nome) {
        for (JogadorAbstract jogador : getJogadoresMercado()) {
            if (jogador.getNome().equalsIgnoreCase(nome))
                return jogador;
        }
        return null;
    }

    public JogadorAbstract buscarJogadorValor(double valor) {
        for (JogadorAbstract jogador : getJogadoresMercado()) {
            if (jogador.getValor() == valor)
                return jogador;
        }
        return null;
    }

}
