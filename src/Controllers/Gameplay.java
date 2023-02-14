package Controllers;

import Model.UsuarioGame;

public class Gameplay {
    public void confronto (UsuarioGame usuarioGame,UsuarioGame usuarioGame2){
        usuarioGame2.setPartidasJogadas(usuarioGame2.getPartidasJogadas()+1);
        usuarioGame.setPartidasJogadas(usuarioGame.getPartidasJogadas()+1);
        if (usuarioGame.getOverallTimeQuimica()>usuarioGame2.getOverallTimeQuimica()){
            System.out.println("O vencedor foi: "+usuarioGame.getNome());
        } else if (usuarioGame.getOverallTimeQuimica()<usuarioGame2.getOverallTimeQuimica()){
            System.out.println("O vencedor foi: "+usuarioGame2.getNome());
        }
    }

    public void campeonato(UsuarioGame usuarioGame1,UsuarioGame usuarioGame2,UsuarioGame usuarioGame3,UsuarioGame usuarioGame4){
        usuarioGame1.setPartidasJogadas(usuarioGame1.getPartidasJogadas()+3);
        usuarioGame2.setPartidasJogadas(usuarioGame2.getPartidasJogadas()+3);
        usuarioGame3.setPartidasJogadas(usuarioGame3.getPartidasJogadas()+3);
        usuarioGame4.setPartidasJogadas(usuarioGame4.getPartidasJogadas()+3);

        if (usuarioGame1.getOverallTimeQuimica()>usuarioGame2.getOverallTimeQuimica() && usuarioGame1.getOverallTimeQuimica()>usuarioGame3.getOverallTimeQuimica() && usuarioGame1.getOverallTimeQuimica()>usuarioGame4.getOverallTimeQuimica()){
            System.out.println("Vencedor do Campeonato: "+ usuarioGame1.getNome());
        } else if (usuarioGame2.getOverallTimeQuimica()>usuarioGame1.getOverallTimeQuimica() && usuarioGame2.getOverallTimeQuimica()>usuarioGame3.getOverallTimeQuimica() && usuarioGame2.getOverallTimeQuimica()>usuarioGame4.getOverallTimeQuimica()){
            System.out.println("Vencedor do Campeonato: "+ usuarioGame2.getNome());
        }else if (usuarioGame3.getOverallTimeQuimica()>usuarioGame2.getOverallTimeQuimica() && usuarioGame3.getOverallTimeQuimica()>usuarioGame1.getOverallTimeQuimica() && usuarioGame3.getOverallTimeQuimica()>usuarioGame4.getOverallTimeQuimica()){
            System.out.println("Vencedor do Campeonato: "+ usuarioGame3.getNome());
        }else if (usuarioGame4.getOverallTimeQuimica()>usuarioGame2.getOverallTimeQuimica() && usuarioGame4.getOverallTimeQuimica()>usuarioGame3.getOverallTimeQuimica() && usuarioGame4.getOverallTimeQuimica()>usuarioGame1.getOverallTimeQuimica()){
            System.out.println("Vencedor do Campeonato: "+ usuarioGame4.getNome());
        }
    }
}
