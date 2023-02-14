package View;

import Controllers.Gameplay;
import Controllers.Vendas;
import Model.*;
public class Main {

        public static void main(String[] args) {
            JogadorAbstract jogadorLinha1 = new JogadorLinha("Messi", "Argentino", "PSG", "Ataque", 85, 92, 91, 95, 34, 65);
            JogadorAbstract jogadorLinha2 = new JogadorLinha("Ronaldo", "Português", "Vasco", "Ataque", 83, 95, 75, 85, 40, 80);
            JogadorAbstract jogadorLinha3 = new JogadorLinha("Gabriel", "Brasileiro", "Flamengo", "Ataque", 79, 83, 71, 82, 45, 75);
            JogadorAbstract jogadorLinha4 = new JogadorLinha("Reinaldo", "Brasileiro", "São Paulo", "meio", 73, 76, 85, 88, 72, 66);
            JogadorAbstract jogadorLinha5 = new JogadorLinha("Bruno", "Brasileiro", "Flamengo", "meio", 71, 80, 89, 85, 70, 85);
            JogadorAbstract jogadorLinha6 = new JogadorLinha("Everton", "Brasileiro", "Flamengo", "meio", 75, 75, 87, 83, 74, 81);
            JogadorAbstract jogadorLinha7 = new JogadorLinha("Rodilindo", "Brasileiro", "Botafogo", "defesa", 81, 53, 75, 74, 89, 81);
            JogadorAbstract jogadorLinha8 = new JogadorLinha("Ronaldinho", "Brasileiro", "All Hillal", "defesa", 82, 55, 73, 76, 88, 85);
            JogadorAbstract jogadorLinha9 = new JogadorLinha("Cristiano", "Português", "Vasco", "defesa", 80, 52, 75, 72, 85, 83);
            JogadorAbstract jogadorLinha10 = new JogadorLinha("Isla", "Chileno", "Fluminense", "defesa", 83, 54, 73, 73, 92, 82);
            JogadorAbstract jogadorLinha11 = new JogadorLinha("Casemiro", "Brasileiro", "Manchester United", "meio", 65, 75, 76, 73, 88, 91);
            JogadorAbstract jogadorLinha12 = new JogadorLinha("Maguire", "Inglês", "Manchester United", "defesa", 48, 50, 65, 68, 82, 85);
            JogadorAbstract jogadorLinha13 = new JogadorLinha("Fred", "Brasileiro", "Manchester United", "meio", 73, 81, 77, 81, 79, 84);
            JogadorAbstract jogadorLinha14 = new JogadorLinha("Malcom", "Brasileiro", "Santos", "meio", 76, 67, 77, 82, 83, 81);
            JogadorAbstract jogadorLinha15 = new JogadorLinha("Wendel", "Brasileiro", "Vasco", "defesa", 77, 51, 65, 61, 83, 83);
            JogadorAbstract jogadorLinha30 = new JogadorLinha("Neymar", "Brasileiro", "PSG", "Ataque", 87, 83, 85, 93, 37, 61);
            JogadorAbstract jogadorLinha16 = new JogadorLinha("Hazard", "Belga", "Real Madrid", "Ataque", 83, 80, 82, 87, 35, 63);
            JogadorAbstract jogadorLinha17 = new JogadorLinha("Kevin De Bruyne", "Belga", "Manchester City", "meio", 74, 88, 93, 87, 64, 77);
            JogadorAbstract jogadorLinha18 = new JogadorLinha("Messut Özil", "Alemão", "İstanbul", "meio", 62, 68, 85, 82, 24, 48);
            JogadorAbstract jogadorLinha19 = new JogadorLinha("Edu Expósito", "Espanhol", "Espanyol", "meio", 71, 69, 72, 79, 56, 59);
            JogadorAbstract jogadorLinha20 = new JogadorLinha("João", "Brasileiro", "São Paulo", "meio", 72, 70, 75, 77, 60, 70);
            JogadorAbstract jogadorLinha21 = new JogadorLinha("Pierre", "Francês", "PSG", "defesa", 48, 50, 65, 68, 82, 85);
            JogadorAbstract jogadorLinha22 = new JogadorLinha("Ronald", "Brasileiro", "Atletico Mineiro", "defesa", 82, 55, 73, 76, 82, 87);
            JogadorAbstract jogadorLinha23 = new JogadorLinha("Giniceu", "Português", "Flamengo", "defesa", 53, 49, 67, 73, 85, 83);
            JogadorAbstract jogadorLinha24 = new JogadorLinha("Nunez", "Uruguaio", "Liverpool", "ataque", 87, 82, 70, 84, 40, 85);
            JogadorAbstract jogadorLinha25 = new JogadorLinha("Matheus", "Holandes", "New Castle", "defesa", 55, 47, 68, 73, 86, 78);
            JogadorAbstract jogadorLinha26 = new JogadorLinha("Stone", "Inglês", "Manchester City", "defesa", 53, 45, 75, 71, 87, 73);
            JogadorAbstract jogadorLinha27 = new JogadorLinha("Almir", "Brasileiro", "Coritiba", "meio", 73, 77, 75, 78, 55, 85);
            JogadorAbstract jogadorLinha28 = new JogadorLinha("Joaquim", "Brasileiro", "Ponte Preta", "meio", 74, 68, 79, 85, 49, 81);
            JogadorAbstract jogadorLinha29 = new JogadorLinha("Mario", "Brasileiro", "PSG", "defesa", 77, 51, 70, 65, 83, 83);
            JogadorAbstract jogadorLinha31 = new JogadorLinha("Jose", "Brasileiro", "Corinthias", "Ataque", 83, 85, 79, 86, 35, 65);
            JogadorAbstract jogadorLinha32 = new JogadorLinha("Emerson", "Honduras", "Sport", "Ataque", 81, 80, 85, 85, 39, 63);
            JogadorAbstract jogadorLinha33 = new JogadorLinha("Amersom", "Brasileiro", "Juventude", "meio", 78, 70, 83, 84, 35, 65);
            JogadorAbstract jogadorLinha45 = new JogadorLinha("Menphis", "Holandes", "All Nassr", "meio", 68, 70, 86, 81, 30, 52);
            JogadorAbstract jogadorLinha34 = new JogadorLinha("Bruce", "Inglês", "Atletc Bilbao", "meio", 71, 75, 80, 85, 56, 75);
            JogadorAbstract jogadorLinha35 = new JogadorLinha("Jorge", "Brasileiro", "Santos", "meio", 72, 73, 78, 83, 60, 80);
            JogadorAbstract jogadorLinha36 = new JogadorLinha("Fernando", "Brasileiro", "PSG", "meio", 48, 52, 70, 72, 65, 79);
            JogadorAbstract jogadorLinha37 = new JogadorLinha("Fernandinho", "Brasileiro", "Atletico Paranaense", "defesa", 85, 55, 70, 74, 85, 83);
            JogadorAbstract jogadorLinha38 = new JogadorLinha("Felipe", "Português", "Botafogo", "defesa", 53, 49, 67, 73, 85, 83);
            JogadorAbstract jogadorLinha39 = new JogadorLinha("Philipe", "Inglês", "Crystal Palace", "ataque", 80, 85, 70, 82, 40, 75);
            JogadorAbstract jogadorLinha40 = new JogadorLinha("Phill", "Inglês", "Leeds United", "defesa", 55, 47, 68, 73, 86, 78);
            JogadorAbstract jogadorLinha41 = new JogadorLinha("Alba", "Espanhol", "Barcelona", "defesa", 75, 45, 73, 79, 83, 77);
            JogadorAbstract jogadorLinha42 = new JogadorLinha("Peter", "Estadunidense", "Orlando City", "ataque", 79, 77, 75, 85, 45, 85);
            JogadorAbstract jogadorLinha43 = new JogadorLinha("Mark", "Estadunse", "LA Galaxy", "meio", 74, 68, 79, 85, 49, 81);
            JogadorAbstract jogadorLinha44 = new JogadorLinha("Alexandre", "Argentino", "Boca Junior", "defesa", 77, 51, 70, 65, 83, 83);
            JogadorAbstract jogadorLinha46 = new JogadorLinha("Neiltom", "Brasileiro", "Botafogo SP", "Ataque", 79, 75, 71, 80, 30, 70);
            JogadorAbstract jogadorLinha47 = new JogadorLinha("Arnaldo", "Brasileiro", "Palmeiras", "Ataque", 83, 80, 82, 84, 35, 63);
            JogadorAbstract jogadorLinha48 = new JogadorLinha("Dembele", "Francês", "Barcelona", "ataque", 84, 85, 79, 84, 64, 85);
            JogadorAbstract jogadorLinha49 = new JogadorLinha("Torres", "Espanhol", "Moskou", "ataque", 62, 68, 85, 82, 30, 48);
            JogadorAbstract jogadorLinha50 = new JogadorLinha("Manuel", "Alemão", "Valencia", "meio", 71, 69, 72, 79, 56, 59);
            JogadorAbstract jogadorLinha51 = new JogadorLinha("Fernandez", "Português", "São Paulo", "meio", 72, 70, 75, 77, 60, 70);
            JogadorAbstract jogadorLinha52 = new JogadorLinha("Pavard", "Francês", "Bayern Munchen", "defesa", 48, 50, 65, 68, 82, 85);
            JogadorAbstract jogadorLinha53 = new JogadorLinha("Kauã", "Brasileiro", "Cuiaba", "defesa", 76, 50, 73, 73, 85, 78);
            JogadorAbstract jogadorLinha54 = new JogadorLinha("Lucas", "Português", "Porto", "defesa", 53, 49, 67, 73, 85, 83);
            JogadorAbstract jogadorLinha55 = new JogadorLinha("Baloteli", "Italiano", "Internazionale", "ataque", 59, 78, 68, 78, 40, 68);
            JogadorAbstract jogadorLinha56 = new JogadorLinha("Blind", "Holandes", "Ajax", "defesa", 58, 47, 75, 73, 84, 64);
            JogadorAbstract jogadorLinha57 = new JogadorLinha("Walker", "Inglês", "Manchester City", "defesa", 85, 45, 80, 78, 83, 80);
            JogadorAbstract jogadorLinha58 = new JogadorLinha("Djalmir", "Brasileiro", "Monaco", "meio", 78, 73, 80, 82, 55, 85);
            JogadorAbstract jogadorLinha59 = new JogadorLinha("Julio", "Brasileiro", "PSG", "meio", 76, 73, 84, 85, 49, 78);
            JogadorAbstract jogadorLinha60 = new JogadorLinha("Mauro", "Brasileiro", "PSG", "defesa", 75, 45, 75, 78, 85, 82);
            JogadorAbstract jogadorLinha61 = new JogadorLinha("Jonata", "Brasileiro", "PSG", "Ataque", 87, 83, 85, 93, 37, 61);
            JogadorAbstract jogadorLinha62 = new JogadorLinha("Paulo", "Brasileiro", "Real Madrid", "Ataque", 83, 80, 82, 85, 35, 63);
            JogadorAbstract jogadorLinha63 = new JogadorLinha("Paul", "Canadense", "Arsenal", "meio", 74, 88, 93, 87, 64, 77);
            JogadorAbstract jogadorLinha64 = new JogadorLinha("Chris", "Estadunidense", "Toronto FC", "meio", 62, 68, 85, 82, 24, 48);
            JogadorAbstract jogadorLinha65 = new JogadorLinha("Hamilton", "Inglês", "Watford", "meio", 71, 69, 72, 79, 56, 59);
            JogadorAbstract jogadorLinha66 = new JogadorLinha("Chicão", "Brasileiro", "Palmeiras", "meio", 72, 70, 75, 77, 60, 70);
            JogadorAbstract jogadorLinha67 = new JogadorLinha("kimpembe", "Francês", "PSG", "defesa", 78, 50, 65, 75, 85, 85);
            JogadorAbstract jogadorLinha68 = new JogadorLinha("Marquinhos", "Brasileiro", "PSG", "defesa", 82, 55, 73, 80, 89, 87);
            JogadorAbstract jogadorLinha69 = new JogadorLinha("Boateng", "Alemão", "Olympique Lyonnais", "defesa", 53, 49, 67, 73, 85, 83);
            JogadorAbstract jogadorLinha70 = new JogadorLinha("Ribery", "Francês", "Bayern Munchen", "ataque", 87, 82, 70, 84, 40, 85);
            JogadorAbstract jogadorLinha71 = new JogadorLinha("Rafinha", "Brasileiro", "Ajax", "defesa", 55, 47, 68, 73, 86, 78);
            JogadorAbstract jogadorLinha72 = new JogadorLinha("Paulista", "Inglês", "Manchester City", "defesa", 53, 45, 75, 71, 87, 73);
            JogadorAbstract jogadorLinha73 = new JogadorLinha("Juninho", "Brasileiro", "Cruzeiro", "meio", 73, 77, 75, 78, 55, 85);
            JogadorAbstract jogadorLinha74 = new JogadorLinha("Davy", "Brasileiro", "Botafogo", "meio", 74, 68, 79, 85, 49, 81);
            JogadorAbstract jogadorLinha75 = new JogadorLinha("Rafael", "Brasileiro", "PSV", "defesa", 77, 51, 70, 65, 83, 83);
            JogadorAbstract jogadorLinha76 = new JogadorLinha("Josue", "Brasileiro", "Corinthias", "Ataque", 83, 85, 79, 86, 35, 65);
            JogadorAbstract jogadorLinha77 = new JogadorLinha("Josias", "Honduras", "Sport", "Ataque", 81, 80, 85, 85, 39, 63);
            JogadorAbstract jogadorLinha78 = new JogadorLinha("Juanfran", "Brasileiro", "Juventude", "ataque", 78, 81, 78, 84, 35, 70);
            JogadorAbstract jogadorLinha79 = new JogadorLinha("Savic", "Holandes", "All Nassr", "meio", 68, 70, 86, 81, 30, 52);
            JogadorAbstract jogadorLinha80 = new JogadorLinha("Vidal", "Inglês", "Atletc Bilbao", "meio", 71, 75, 80, 85, 56, 75);
            JogadorAbstract jogadorLinha81 = new JogadorLinha("Gerson", "Brasileiro", "Santos", "meio", 72, 73, 78, 83, 60, 80);
            JogadorAbstract jogadorLinha82 = new JogadorLinha("Hamisei", "Galês", "PSG", "meio", 48, 52, 70, 72, 65, 79);
            JogadorAbstract jogadorLinha83 = new JogadorLinha("Ramos", "Brasileiro", "Atletico Paranaense", "defesa", 85, 55, 70, 74, 85, 83);
            JogadorAbstract jogadorLinha84 = new JogadorLinha("christensen", "Dinamarquês", "Barcelona", "defesa", 53, 49, 67, 73, 85, 83);
            JogadorAbstract jogadorLinha85 = new JogadorLinha("Coutinho", "Brasileiro", "Crystal Palace", "ataque", 80, 85, 70, 82, 40, 75);
            JogadorAbstract jogadorLinha86 = new JogadorLinha("Leo Pereira", "Brasileiro", "Flamengo", "defesa", 55, 47, 68, 73, 86, 78);
            JogadorAbstract jogadorLinha87 = new JogadorLinha("Humells", "Alemão", "Barcelona", "defesa", 75, 45, 73, 79, 83, 77);
            JogadorAbstract jogadorLinha88 = new JogadorLinha("pulisic", "Estadunidense", "Chelsea", "ataque", 85, 84, 75, 85, 45, 85);
            JogadorAbstract jogadorLinha89 = new JogadorLinha("Jack", "Estadunse", "LA Galaxy", "meio", 74, 68, 79, 85, 49, 81);
            JogadorAbstract jogadorLinha90 = new JogadorLinha("Nicolás", "Argentino", "Estudiantes", "defesa", 77, 51, 70, 65, 83, 83);


            Mercado mercado = new Mercado();
            mercado.addJogadores(jogadorLinha1);
            mercado.addJogadores(jogadorLinha2);
            mercado.addJogadores(jogadorLinha3);
            mercado.addJogadores(jogadorLinha4);
            mercado.addJogadores(jogadorLinha5);
            mercado.addJogadores(jogadorLinha6);
            mercado.addJogadores(jogadorLinha7);
            mercado.addJogadores(jogadorLinha8);
            mercado.addJogadores(jogadorLinha9);
            mercado.addJogadores(jogadorLinha10);
            mercado.addJogadores(jogadorLinha11);
            mercado.addJogadores(jogadorLinha12);
            mercado.addJogadores(jogadorLinha13);
            mercado.addJogadores(jogadorLinha14);
            mercado.addJogadores(jogadorLinha15);
            mercado.addJogadores(jogadorLinha16);
            mercado.addJogadores(jogadorLinha17);
            mercado.addJogadores(jogadorLinha18);
            mercado.addJogadores(jogadorLinha19);
            mercado.addJogadores(jogadorLinha20);
            mercado.addJogadores(jogadorLinha21);
            mercado.addJogadores(jogadorLinha22);
            mercado.addJogadores(jogadorLinha23);
            mercado.addJogadores(jogadorLinha24);
            mercado.addJogadores(jogadorLinha25);
            mercado.addJogadores(jogadorLinha26);
            mercado.addJogadores(jogadorLinha27);
            mercado.addJogadores(jogadorLinha28);
            mercado.addJogadores(jogadorLinha29);
            mercado.addJogadores(jogadorLinha30);
            mercado.addJogadores(jogadorLinha31);
            mercado.addJogadores(jogadorLinha32);
            mercado.addJogadores(jogadorLinha33);
            mercado.addJogadores(jogadorLinha34);
            mercado.addJogadores(jogadorLinha35);
            mercado.addJogadores(jogadorLinha36);
            mercado.addJogadores(jogadorLinha37);
            mercado.addJogadores(jogadorLinha38);
            mercado.addJogadores(jogadorLinha39);
            mercado.addJogadores(jogadorLinha40);
            mercado.addJogadores(jogadorLinha41);
            mercado.addJogadores(jogadorLinha42);
            mercado.addJogadores(jogadorLinha43);
            mercado.addJogadores(jogadorLinha44);
            mercado.addJogadores(jogadorLinha45);
            mercado.addJogadores(jogadorLinha46);
            mercado.addJogadores(jogadorLinha47);
            mercado.addJogadores(jogadorLinha48);
            mercado.addJogadores(jogadorLinha49);
            mercado.addJogadores(jogadorLinha50);
            mercado.addJogadores(jogadorLinha51);
            mercado.addJogadores(jogadorLinha52);
            mercado.addJogadores(jogadorLinha53);
            mercado.addJogadores(jogadorLinha54);
            mercado.addJogadores(jogadorLinha55);
            mercado.addJogadores(jogadorLinha56);
            mercado.addJogadores(jogadorLinha57);
            mercado.addJogadores(jogadorLinha58);
            mercado.addJogadores(jogadorLinha59);
            mercado.addJogadores(jogadorLinha60);
            mercado.addJogadores(jogadorLinha61);
            mercado.addJogadores(jogadorLinha62);
            mercado.addJogadores(jogadorLinha63);
            mercado.addJogadores(jogadorLinha64);
            mercado.addJogadores(jogadorLinha65);
            mercado.addJogadores(jogadorLinha66);
            mercado.addJogadores(jogadorLinha67);
            mercado.addJogadores(jogadorLinha68);
            mercado.addJogadores(jogadorLinha69);
            mercado.addJogadores(jogadorLinha70);
            mercado.addJogadores(jogadorLinha71);
            mercado.addJogadores(jogadorLinha72);
            mercado.addJogadores(jogadorLinha73);
            mercado.addJogadores(jogadorLinha74);
            mercado.addJogadores(jogadorLinha75);
            mercado.addJogadores(jogadorLinha76);
            mercado.addJogadores(jogadorLinha77);
            mercado.addJogadores(jogadorLinha78);
            mercado.addJogadores(jogadorLinha79);
            mercado.addJogadores(jogadorLinha80);
            mercado.addJogadores(jogadorLinha81);
            mercado.addJogadores(jogadorLinha82);
            mercado.addJogadores(jogadorLinha83);
            mercado.addJogadores(jogadorLinha84);
            mercado.addJogadores(jogadorLinha85);
            mercado.addJogadores(jogadorLinha86);
            mercado.addJogadores(jogadorLinha87);
            mercado.addJogadores(jogadorLinha88);
            mercado.addJogadores(jogadorLinha89);
            mercado.addJogadores(jogadorLinha90);


            mercado.addJogadores(new JogadorGoleiro("Pepe Reina", "Espanhol", "Villarreal CF", 82, 83, 85, 83, 52, 86));
            mercado.addJogadores(new JogadorGoleiro("De Gea", "Espanhol", "Manchester United", 88, 81, 78, 89, 57, 82));
            mercado.addJogadores(new JogadorGoleiro("Claudio Bravo", "Chileno", "Villareal", 79, 79, 85, 79, 58, 75));
            mercado.addJogadores(new JogadorGoleiro("Armani", "Argentino", "River Plate", 77, 81, 83, 79, 60, 82));
            mercado.addJogadores(new JogadorGoleiro("Ospina", "Colombiano", "All Nassr", 83, 70, 78, 84, 34, 75));
            mercado.addJogadores(new JogadorGoleiro("Martínez", "Argentino", "Aston Villa", 85, 86, 84, 86, 65, 85));


            UsuarioGame lucas = new UsuarioGame("Lucas", 19,new TimeTitular(4,3,3));
            Vendas vendas = new Vendas(mercado, lucas);
            vendas.venderJogadorNome("Claudio Bravo");
            vendas.venderJogadorNome("Marquinhos");
            vendas.venderJogadorNome("Rafael");
            vendas.venderJogadorNome("Fernandinho");
            vendas.venderJogadorNome("Pierre");
            vendas.venderJogadorNome("Chicão");
            vendas.venderJogadorNome("Juninho");
            vendas.venderJogadorNome("Josias");
            vendas.venderJogadorNome("Mark");
            vendas.venderJogadorNome("Nunez");
            vendas.venderJogadorNome("Baloteli");
            vendas.venderJogadorNome("pulisic");
            vendas.venderJogadorposicao("Defesa");
            vendas.venderJogadorTipoCarta("ouro");
            vendas.venderJogadorPreco(4150000);


            lucas.addJogadoresTimeTitular("Claudio Bravo");
            lucas.addJogadoresTimeTitular("Marquinhos");
            lucas.addJogadoresTimeTitular("Rafael");
            lucas.addJogadoresTimeTitular("Fernandinho");
            lucas.addJogadoresTimeTitular("Pierre");
            lucas.addJogadoresTimeTitular("Chicão");
            lucas.addJogadoresTimeTitular("Juninho");
            lucas.addJogadoresTimeTitular("Mark");
            lucas.addJogadoresTimeTitular("Nunez");
            lucas.addJogadoresTimeTitular("Baloteli");
            lucas.addJogadoresTimeTitular("pulisic");



            lucas.trocarEsquemaTatico(4,4,2);
            
            lucas.addJogadoresTimeTitular("Claudio Bravo");
            lucas.addJogadoresTimeTitular("Marquinhos");
            lucas.addJogadoresTimeTitular("Rafael");
            lucas.addJogadoresTimeTitular("Fernandinho");
            lucas.addJogadoresTimeTitular("Pierre");
            lucas.addJogadoresTimeTitular("Chicão");
            lucas.addJogadoresTimeTitular("Juninho");
            lucas.addJogadoresTimeTitular("Mark");
            lucas.addJogadoresTimeTitular("Hamilton");
            lucas.addJogadoresTimeTitular("Baloteli");
            lucas.addJogadoresTimeTitular("pulisic");

            lucas.calculaOverallValor();
            lucas.ImprimeTudo();

            UsuarioGame arnaldo = new UsuarioGame("Arnaldo", 21,new TimeTitular(3,5,2));
            Vendas vendas1 = new Vendas(mercado, arnaldo);
            vendas1.venderJogadorNome("Ospina");
            vendas1.venderJogadorNome("Paulista");
            vendas1.venderJogadorNome("Blind");
            vendas1.venderJogadorNome("Leo Pereira");
            vendas1.venderJogadorNome("Kevin De Bruyne");
            vendas1.venderJogadorNome("Menphis");
            vendas1.venderJogadorNome("Bruce");
            vendas1.venderJogadorNome("Julio");
            vendas1.venderJogadorNome("Everton");
            vendas1.venderJogadorNome("Coutinho");
            vendas1.venderJogadorNome("Torres");
            vendas1.venderJogadorposicao("Defesa");
            vendas1.venderJogadorTipoCarta("Lendario");


            arnaldo.addJogadoresTimeTitular("Ospina");
            arnaldo.addJogadoresTimeTitular("Paulista");
            arnaldo.addJogadoresTimeTitular("Blind");
            arnaldo.addJogadoresTimeTitular("christensen");
            arnaldo.addJogadoresTimeTitular("Leo Pereira");
            arnaldo.addJogadoresTimeTitular("Kevin De Bruyne");
            arnaldo.addJogadoresTimeTitular("Menphis");
            arnaldo.addJogadoresTimeTitular("Bruce");
            arnaldo.addJogadoresTimeTitular("Julio");
            arnaldo.addJogadoresTimeTitular("Everton");
            arnaldo.addJogadoresTimeTitular("Coutinho");
            arnaldo.addJogadoresTimeTitular("Torres");

            arnaldo.calculaOverallValor();
            arnaldo.ImprimeTudo();
            arnaldo.substituirJogador("Blind","christensen");


            UsuarioGame giniceu = new UsuarioGame("Giniceu", 20,new TimeTitular(4,4,2));
            Vendas vendas2 = new Vendas(mercado, giniceu);
            vendas2.venderJogadorNome("Martínez");
            vendas2.venderJogadorNome("kimpembe");
            vendas2.venderJogadorNome("Felipe");
            vendas2.venderJogadorNome("Boateng");
            vendas2.venderJogadorNome("Wendel");
            vendas2.venderJogadorNome("Fernandez");
            vendas2.venderJogadorNome("Manuel");
            vendas2.venderJogadorNome("Fred");
            vendas2.venderJogadorNome("João");
            vendas2.venderJogadorNome("Messi");
            vendas2.venderJogadorNome("Jose");
            vendas2.venderJogadorposicao("Ataque");
            vendas2.venderJogadorTipoCarta("Prata");


            giniceu.addJogadoresTimeTitular("Martínez");
            giniceu.addJogadoresTimeTitular("kimpembe");
            giniceu.addJogadoresTimeTitular("Felipe");
            giniceu.addJogadoresTimeTitular("Boateng");
            giniceu.addJogadoresTimeTitular("Wendel");
            giniceu.addJogadoresTimeTitular("Fernandez");
            giniceu.addJogadoresTimeTitular("Manuel");
            giniceu.addJogadoresTimeTitular("Jack");
            giniceu.addJogadoresTimeTitular("Fred");
            giniceu.addJogadoresTimeTitular("João");
            giniceu.addJogadoresTimeTitular("Messi");
            giniceu.addJogadoresTimeTitular("Jose");


            giniceu.substituirJogador("Manuel","Jack");


            UsuarioGame jonas = new UsuarioGame("Jonas", 24,new TimeTitular(3,4,3));
            Vendas vendas3 = new Vendas(mercado, jonas);
            vendas3.venderJogadorNome("De Gea");
            vendas3.venderJogadorNome("Isla");
            vendas3.venderJogadorNome("Ronaldinho");
            vendas3.venderJogadorNome("Giniceu");
            vendas3.venderJogadorNome("Messut Özil");
            vendas3.venderJogadorNome("Edu Expósito");
            vendas3.venderJogadorNome("Davy");
            vendas3.venderJogadorNome("Reinaldo");
            vendas3.venderJogadorNome("Dembele");
            vendas3.venderJogadorNome("Gabriel");
            vendas3.venderJogadorNome("Philipe");
            vendas3.venderJogadorposicao("Meio");
            vendas3.venderJogadorTipoCarta("Prata");


            jonas.addJogadoresTimeTitular("De Gea");
            jonas.addJogadoresTimeTitular("Isla");
            jonas.addJogadoresTimeTitular("Ronaldinho");
            jonas.addJogadoresTimeTitular("Giniceu");
            jonas.addJogadoresTimeTitular("Messut Özil");
            jonas.addJogadoresTimeTitular("Edu Expósito");
            jonas.addJogadoresTimeTitular("Davy");
            jonas.addJogadoresTimeTitular("Reinaldo");
            jonas.addJogadoresTimeTitular("Dembele");
            jonas.addJogadoresTimeTitular("Gabriel");
            jonas.addJogadoresTimeTitular("Neiltom");
            jonas.addJogadoresTimeTitular("Philipe");


            jonas.calculaOverallValor();
            jonas.ImprimeTudo();
            jonas.substituirJogador("Gabriel","Neiltom");


            Gameplay gameplay= new Gameplay();
            gameplay.confronto(lucas,giniceu);
            System.out.println();
            System.out.println(lucas.getPartidasJogadas());

            System.out.println();
            gameplay.campeonato(lucas,giniceu,arnaldo,jonas);
            System.out.println(lucas.getPartidasJogadas());



        }
    }


