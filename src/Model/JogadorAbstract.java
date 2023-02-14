package Model;

import java.util.ArrayList;

public abstract class JogadorAbstract {

    protected String nome;
    protected String nacionalidade;
    protected String timeAtual;
    protected String posicao;
    protected int overall;
    protected float valor;
    protected String tipoCarta;


    protected ArrayList<Integer> overallCalculler = new ArrayList<>();

    public JogadorAbstract(String nome, String nacionalidade, String timeAtual, String posicao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.timeAtual = timeAtual;
        this.posicao = posicao;
    }

    public float calculaValor() {
        if (tipoCarta().equalsIgnoreCase("BRONZE"))
            return getOverall() * 1000;
        else if (tipoCarta().equalsIgnoreCase("PRATA"))
            return getOverall() * 10000;
        else if (tipoCarta().equalsIgnoreCase("OURO"))
            return getOverall() * 50000;
        else if (tipoCarta().equalsIgnoreCase("LENDARIA"))
            return getOverall() * 100000;
        else return 0;

    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + "Posição: " + getPosicao() + "\n" + "Nacionalidade: " + getNacionalidade() + "\n" + "Time Atual: " + getTimeAtual() + "\n" + "Valor: " + getValor();
    }

    public String tipoCarta() {

        if (getOverall() < 64)
            return "BRONZE";
        if (getOverall() > 64 && getOverall() < 75)
            return "PRATA";
        if (getOverall() > 75 && getOverall() < 96)
            return "OURO";
        else
            return "LENDARIA";
    }

    public abstract int calculaOverall();

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTimeAtual() {
        return timeAtual;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getOverall() {
        return overall;
    }

    public float getValor() {
        return valor;
    }
}
