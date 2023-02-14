package Model;

import java.util.Collections;

public class JogadorGoleiro extends JogadorAbstract{

   protected int elasticidade;
   protected int manejo;
   protected int chute;
   protected int reflexo;
   protected int velocidade;
   protected int posicionamento;


    public JogadorGoleiro(String nome, String nacionalidade, String timeAtual, int elasticidade, int manejo, int chute, int reflexo, int velocidade, int posicionamento) {
        super(nome, nacionalidade, timeAtual, "Goleiro");
        this.elasticidade = elasticidade;
        this.manejo = manejo;
        this.chute = chute;
        this.reflexo = reflexo;
        this.velocidade = velocidade;
        this.posicionamento = posicionamento;
        this.overall=calculaOverall();
        this.tipoCarta=tipoCarta();
        this.valor=calculaValor();
    }

    @Override
    public int calculaOverall() {
        overallCalculler.add(posicionamento);
        overallCalculler.add(chute);
        overallCalculler.add(reflexo);
        overallCalculler.add(velocidade);
        overallCalculler.add(manejo);
        overallCalculler.add(elasticidade);
        overallCalculler.remove(Collections.min(overallCalculler));
        Collections.sort(overallCalculler);
        return overallCalculler.get(2);
    }

    public int getOverall() {
        return overall;
    }


}
