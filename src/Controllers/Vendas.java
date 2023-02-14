package Controllers;

import Model.JogadorAbstract;
import Model.Mercado;
import Model.UsuarioGame;

public class Vendas {
     Mercado mercado;
     UsuarioGame usuarioGame;


    public Vendas(Mercado mercado, UsuarioGame usuarioGame) {
        this.mercado = mercado;
        this.usuarioGame = usuarioGame;
    }

    private void venderJogador(JogadorAbstract jogador) {

        if (jogador != null && usuarioGame.getCashCaixa() > jogador.getValor()) {
            usuarioGame.getPlantel().addJogadores(jogador);
            mercado.removerJogadores(jogador);
            usuarioGame.setCashCaixa(usuarioGame.getCashCaixa() - jogador.getValor());
        }
        if ( jogador!=null && usuarioGame.getPlantel().getPlantelJogadores().size() < 11 && usuarioGame.getCashCaixa() < jogador.getValor()) {
            for (JogadorAbstract jogadorAbstract : usuarioGame.getPlantel().getPlantelJogadores()) {
                if (jogadorAbstract != null)
                    mercado.addJogadores(jogadorAbstract);
            }
            usuarioGame.getPlantel().getPlantelJogadores().clear();
            System.out.println("Usuario não possui dinheiro suficiente pra fechar o time, Logo o plantel esta sendo zerado," +
                    "refaça o time de forma que consiga os 11 jogadores em suas respectivas posições sem zerar o cash. ");
        }
        if (jogador!= null &&usuarioGame.getCashCaixa() < jogador.getValor() && usuarioGame.getPlantel().getPlantelJogadores().size() > 11) {
            System.out.println("Não tem mais dinheiro em cash");
            System.out.println("Monte o seu time com os Jogadores ja presentes em seu plantel");
        }


    }

    public void venderJogadorNome(String nome) {
        JogadorAbstract jogador = mercado.buscarJogadorNome(nome);
        if (jogador == null) {
            System.out.println("Não existe jogador com este nome!");
        }else {
            venderJogador(jogador);}
    }

    public void venderJogadorPreco(float preco) {
        JogadorAbstract jogador = mercado.buscarJogadorValor(preco);
        if(jogador==null){
            System.out.println("Não existe jogador com este preço!");
        }else {
        venderJogador(jogador);}
    }

    public void venderJogadorposicao(String posicao) {
        JogadorAbstract jogador = mercado.buscarJogadorMenorPrecoPosicao(posicao);
        venderJogador(jogador);

    }

    public void venderJogadorTipoCarta(String tipoCarta) {
        JogadorAbstract jogador = mercado.buscarJogadorMenorPrecoTipo(tipoCarta);
        venderJogador(jogador);
    }
}

