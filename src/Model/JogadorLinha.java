package Model;


import java.util.Collections;

public class JogadorLinha extends JogadorAbstract{

   protected int ritmo;
   protected int finalizacao;
   protected int passe;
   protected int conducao;
   protected int defesa;
   protected int fisico;



   public JogadorLinha(String nome, String nacionalidade, String timeAtual, String posicao, int ritmo, int finalizacao, int passe, int conducao, int defesa, int fisico) {
      super(nome, nacionalidade, timeAtual, posicao);
      this.ritmo = ritmo;
      this.finalizacao = finalizacao;
      this.passe = passe;
      this.conducao = conducao;
      this.defesa = defesa;
      this.fisico = fisico;
      this.overall=calculaOverall();
      this.tipoCarta= tipoCarta();
      this.valor=calculaValor();
   }


   @Override
   public int calculaOverall() {

      overallCalculler.add(passe);
      overallCalculler.add(conducao);
      overallCalculler.add(defesa);
      overallCalculler.add(fisico);
      overallCalculler.add(ritmo);
      overallCalculler.add(finalizacao);
      overallCalculler.remove(Collections.min(overallCalculler));
      Collections.sort(overallCalculler);
      return overallCalculler.get(2);
   }

   @Override
   public String toString() {
      return super.toString();
   }
   public int getOverall() {
      return overall;
   }

}
