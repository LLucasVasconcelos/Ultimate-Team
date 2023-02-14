package Model;

import java.util.ArrayList;

public class UsuarioGame {
    protected String nome;
    protected int idade;
    protected int partidasJogadas;
    protected float cashCaixa = 214000000;
    Plantel plantel;
    TimeTitular timeTitular;
    private float valorTotal;
    private int overallTime;
    private int overallTimeQuimica;
    int contDefesa = 0;
    int contAtaque = 0;
    int contMeio = 0;
    int contGoleiro = 0;

    public UsuarioGame(String nome, int idade, TimeTitular timeTitular) {
        this.nome = nome;
        this.idade = idade;
        this.plantel = new Plantel();
        this.timeTitular = timeTitular;
    }


    public void trocarEsquemaTatico(int defesa, int meio, int ataque) {

        for (JogadorAbstract jogadorAbstract : getTimeTitular().getJogadoresTitulares()) {
            if (jogadorAbstract != null) {
                getPlantel().getPlantelJogadores().add(jogadorAbstract);
            }
        }
    getTimeTitular().getJogadoresTitulares().clear();
    setTimeTitular(new TimeTitular(defesa,meio,ataque));
    contGoleiro=0;
    contDefesa=0;
    contMeio=0;
    contAtaque=0;

    }

    public void addJogadoresTimeTitular(String nome) {
        JogadorAbstract jogador = plantel.buscarJogadorNome(nome);

        if (jogador != null && jogador.getPosicao().equalsIgnoreCase("Goleiro") && contGoleiro < 1) {
            getTimeTitular().addJogadoresTimetitular(jogador);
            getPlantel().removerJogadores(jogador);
            contGoleiro++;
        } else if (jogador != null && jogador.getPosicao().equalsIgnoreCase("Defesa") && contDefesa < timeTitular.getDefesa()) {
            getTimeTitular().addJogadoresTimetitular(jogador);
            getPlantel().removerJogadores(jogador);
            contDefesa++;
        } else if (jogador != null && jogador.getPosicao().equalsIgnoreCase("Ataque") && contAtaque < timeTitular.getAtaque()) {
            getTimeTitular().addJogadoresTimetitular(jogador);
            getPlantel().removerJogadores(jogador);
            contAtaque++;
        } else if (jogador != null && jogador.getPosicao().equalsIgnoreCase("Meio") && contMeio <= timeTitular.getMeio()) {
            getTimeTitular().addJogadoresTimetitular(jogador);
            getPlantel().removerJogadores(jogador);
            contMeio++;
        } else if (jogador != null) {
            System.out.println("Numero maximo de jogadores na Posição " + jogador.getPosicao() + " Atingido");
        }
    }

    public void ImprimeTudo() {
        calcularQuimicaNacionalidade();
        System.out.println();
        System.out.println("Nome Usuario: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Esquema Tatico: " + timeTitular.getDefesa() + "-" + timeTitular.getMeio() + "-" + timeTitular.getAtaque());
        System.out.println("Dinheiro no caixa: " + getCashCaixa());

        System.out.println("______________________________");
        System.out.println("Jogadores no Plantel: ");
        for (JogadorAbstract jogador : getPlantel().getPlantelJogadores()) {
            if (jogador != null) {
                System.out.println();
                System.out.println(jogador);
            }
        }
        System.out.println();
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("Jogadores no TimeTitular: ");
        for (JogadorAbstract jogador1 : getTimeTitular().getJogadoresTitulares()) {
            if (jogador1 != null) {
                System.out.println();
                System.out.println(jogador1);
            }
        }
        System.out.println();
        System.out.println("______________________________");
        System.out.println();
        System.out.println("Overall do time: " + getOverralTime());
        System.out.println();
        System.out.println("Overall do time com Quimica: " + getOverallTimeQuimica());
        System.out.println();
        System.out.println("Valor do time: " + getValorTotal());
    }

    public void calculaOverallValor() {
        int overallTotal = 0;
        int valortime = 0;


        for (JogadorAbstract jogador : getTimeTitular().getJogadoresTitulares()) {
            overallTotal += jogador.getOverall();
            valortime += jogador.getValor();
        }
        setValorTotal(valortime);
        setOverralTime(overallTotal / getTimeTitular().getJogadoresTitulares().size());
    }

    public void calcularQuimicaNacionalidade() {
        ArrayList<JogadorAbstract> jogadoresnacionais = getTimeTitular().getJogadoresTitulares();
        ArrayList<String> nacionalidades = new ArrayList<>();
        int cont;
        for (JogadorAbstract jogadornacional : jogadoresnacionais) {
            for (JogadorAbstract jogador : getTimeTitular().getJogadoresTitulares()) {
                cont = 0;

                    if (jogadornacional.getNacionalidade().equalsIgnoreCase(jogador.getNacionalidade())) {
                        if (!nacionalidades.contains(jogador.getNacionalidade())) {
                            for (JogadorAbstract jogadorAbstract : getTimeTitular().getJogadoresTitulares()) {
                                if (jogadorAbstract.getNacionalidade().equalsIgnoreCase(jogador.getNacionalidade())) {
                                    cont++;
                                }
                            }

                            if (cont >= 2 && cont<5) {
                                setOverallTimeQuimica(getOverralTime()+1);
                            } else if (cont >= 5 && cont<8) {
                                setOverallTimeQuimica(getOverralTime()+2);
                            } else if (cont>=8) {
                                setOverallTimeQuimica(getOverralTime()+3);
                            }
                            nacionalidades.add(jogador.getNacionalidade());
                        }
                    }
            }
        }
    }

    public void substituirJogador(String jogadorSaindo, String jogadorEntrando) {
        JogadorAbstract jogadorSai = getTimeTitular().buscarJogadorTimetitular(jogadorSaindo);
        JogadorAbstract jogadorEntra = getPlantel().buscarJogadorNome(jogadorEntrando);
        if (jogadorSai != null && jogadorEntra != null) {
            getPlantel().addJogadores(jogadorSai);
            getTimeTitular().addJogadoresTimetitular(jogadorEntra);
            getPlantel().removerJogadores(jogadorEntra);
            getTimeTitular().removerJogadores(jogadorSai);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public float getCashCaixa() {
        return cashCaixa;
    }

    public int getOverallTimeQuimica() {
        return overallTimeQuimica;
    }

    public void setOverallTimeQuimica(int overallTimeQuimica) {
        this.overallTimeQuimica = overallTimeQuimica;
    }

    public void setCashCaixa(float cashCaixa) {
        this.cashCaixa = cashCaixa;
    }

    public Plantel getPlantel() {
        return plantel;
    }

    public TimeTitular getTimeTitular() {
        return timeTitular;
    }

    public void setTimeTitular(TimeTitular timeTitular) {
        this.timeTitular = timeTitular;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getOverralTime() {
        return overallTime;
    }

    public void setOverralTime(int overralTime) {
        this.overallTime = overralTime;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }
}
