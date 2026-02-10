package Player;

import Audio.AudioPlayer;
import Audio.MusicPlayer;
import Util.CompFunc;

import java.util.Scanner;

public class SecretItem {

        private CompFunc cs = new CompFunc();
        private Scanner sc = new Scanner(System.in);

        /**
         *lyrics timed for songs that is supposed to be form of secret ending
         *  value that is needed to access this secret ending
         *  with little bit of player's interaction
         */

        public void sikritEnding(){


                cs.Sleep(1500);
                cs.Line(15);
                System.out.println("oh... what's that?");
                cs.Sleep(1000);
                System.out.println("hold on");
                cs.Sleep(2000);
                System.out.println("ITS TLUSTEJ KARL SONG");
                System.out.println("Achievement unlocked: sikrit ending - vypecky");
                cs.Sleep(2000);
                cs.Line(5);

                MusicPlayer.play(AudioPlayer.loadSound("resources//sounds/sikrit2.wav"));


                System.out.println("*---------------Tlustej kárl - Vypadám jak vypadám ---------------*");

                cs.Sleep(21000);

                System.out.println();
                System.out.println("Hej hou, hej hou,");
                cs.Sleep(1200);
                System.out.println("mám pupek jako santa Claus");
                cs.Sleep(2050);
                System.out.println("když zakopnu, tak se vznáším jako kosmonaut");
                cs.Sleep(2400);
                System.out.println("hellou... je tady obsluha?");
                cs.Sleep(1600);
                System.out.println("to není dietní dort, kurva to je kedlubna");
                cs.Sleep(2800);
                System.out.println("no tak abych začal od znova");
                cs.Sleep(1800);
                System.out.println("někteří už ani neví k čemu by mě vlastně měli přirovnat");
                cs.Sleep(3600);
                System.out.println("když bežím vypadám jak lavina, lavina, povidla, poplivat");
                cs.Sleep(4500);
                System.out.println("kurva ");
                cs.Sleep(300);
                System.out.println("to");
                cs.Sleep(200);
                System.out.println("je");
                cs.Sleep(200);
                System.out.println("kravina");
                cs.Sleep(1250);
                System.out.println("ou nou nemám káru jako batman");
                cs.Sleep(2100);
                System.out.println("jsem fatman");
                cs.Sleep(1400);
                System.out.println("a nerad jezdim busem..");
                cs.Sleep(1750);
                System.out.println("za pipkama běhám");
                cs.Sleep(1100);
                System.out.println("jak slepice za flusem");
                cs.Sleep(1300);
                System.out.println("přinášim tlustej rap na zlatym podnose..");
                cs.Sleep(2300);
                System.out.println("monstrum že?");
                cs.Sleep(900);
                System.out.println("Vypadám jak těhotnej,");
                cs.Sleep(1800);
                System.out.println("nejsem těhotnej,");
                cs.Sleep(1300);
                System.out.println("jsem jenom dobře nažranej..");
                cs.Sleep(2000);
                System.out.println("Však to znáte, ne?");
                cs.Sleep(1300);
                System.out.println("Když tlusťoch zakopne,");
                cs.Sleep(1100);
                System.out.println("celej svět se hned směje");
                cs.Sleep(1500);
                System.out.println("jak zblázněnej..");
                cs.Sleep(600);
                System.out.println("ou");
                cs.Sleep(100);
                System.out.println("Říkaj mi");
                cs.Sleep(600);
                System.out.println(",že jsem řízek poctivej");
                cs.Sleep(1700);
                System.out.println("rozteklej jak oliheň");
                cs.Sleep(1800);
                System.out.println("většihou pod vlivem");
                cs.Sleep(1050);
                System.out.println("sedim doma 30 hodin denně");
                cs.Sleep(2100);
                System.out.println("a mam to v pici ne?");
                cs.Sleep(1300);
                System.out.println("Kurva kárle, hejbni s tou prdelí a vyjeb se ven");
                cs.Sleep(2400);
                System.out.println("chápeš?");
                cs.Sleep(500);
                System.out.println("musím se aklimatizovat");
                cs.Sleep(1600);
                System.out.println("schovat se anebo z toho ");
                cs.Sleep(2000);
                System.out.println("brzo bude provar...");
                cs.Sleep(1200);
                System.out.println("Tak odval se");
                cs.Sleep(1000);
                System.out.println("nebo tu cestu poběžíš znova..");
                cs.Sleep(1600);
                System.out.println("wodap?");
                cs.Sleep(500);
                System.out.println("NE");
                cs.Sleep(200);
                System.out.println("bracho, fakt nejedu stanovat..");
                cs.Sleep(1800);
                System.out.println("Nemám čas,");
                cs.Sleep(800);
                System.out.println("ležim jak meloun na gauči");
                cs.Sleep(1800);
                System.out.println("lenošim,");
                cs.Sleep(600);
                System.out.println("spocenej jsem jak kurva po noční");
                cs.Sleep(2000);
                System.out.println("a když mě lidi na bazénu uvidí");
                cs.Sleep(2000);
                System.out.println("tak křičí:");
                cs.Sleep(600);
                System.out.println("Zachraňte Wiliho než se utopí!");
                cs.Sleep(2300);
                System.out.println("když řeknu výpečky,");
                cs.Sleep(1500);
                System.out.println("vy na to se zelim");
                cs.Sleep(1800);
                System.out.println("výpečky");
                cs.Sleep(1300);

                MusicPlayer.pause();

                System.out.print(">> ");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("se zelim")||input.equalsIgnoreCase("se zelím")) {

                        MusicPlayer.resume();

                        cs.Sleep(700);
                        System.out.println("Vypadám jak vypadám");
                        cs.Sleep(1200);
                        System.out.println("a už se asi nezměnim");
                        cs.Sleep(1800);
                        System.out.println("Výpečky");
                        cs.Sleep(1300);

                        MusicPlayer.pause();

                        System.out.print(">> ");
                        String input2 = sc.nextLine();
                        if (input2.equalsIgnoreCase("se zelim")||input2.equalsIgnoreCase("se zelím")) {

                                MusicPlayer.resume();

                                cs.Sleep(700);
                                System.out.println("když řeknu výpečky,");
                                cs.Sleep(1500);
                                System.out.println("vy na to se zelim");
                                cs.Sleep(1800);
                                System.out.println("všichni výpečky");
                                cs.Sleep(1800);
                                System.out.println("se zelim");
                                cs.Sleep(700);
                                System.out.println("Vypadám jak vypadám");
                                cs.Sleep(1200);
                                System.out.println("a už se asi nezměnim");
                                cs.Sleep(1800);
                                System.out.println("Výpečky");
                                cs.Sleep(1300);
                                System.out.println("se zelim");
                                cs.Sleep(700);
                                System.out.println("*intensive sound of exploding keyboard*");
                                AudioPlayer.playSound("resources//sounds//explosion.wav");
                                cs.Sleep(78000);
                                cs.Line(15);
                        } else {
                                System.out.println("achjo, ty si ale trouba... takhle to pokazit");
                                cs.Sleep(1000);
                                cs.Line(30);
                        }
                } else {
                        System.out.println("achjo, ty si ale trouba... takhle to pokazit");
                        cs.Sleep(1000);
                        cs.Line(30);
                }







        }

    }


