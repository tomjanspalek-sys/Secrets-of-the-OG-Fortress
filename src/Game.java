import Commands.GameConsole;
import Player.*;
import Util.CompFunc;
import World.GameMapLoader;

import java.io.*;

/**
 * Whole brain of the game, creating classes
 * and prints intro text of the game
 */
public class Game {

    CompFunc cf = new CompFunc();


    public void startGame() {
        GameMapLoader GML = new GameMapLoader();
        GML.Load("/gamedata.json");
        System.out.println();

            InputStream input = Game.class.getResourceAsStream("/introText.txt");
            if(input == null) {
                throw new RuntimeException("Unable to load file");
            }

            try(BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
                String text = null;

                while ((text = br.readLine()) != null) {
                    if (text.equalsIgnoreCase("...")){
                        cf.Sleep(2500);
                        text = "";
                    }if (text.equalsIgnoreCase("!!!")){
                        cf.Line(5);
                        text = "";
                    }
                    else
                        System.out.println(text);
                }
            }catch(Exception e){
                throw new RuntimeException(e);
            }


        //System.out.println("Game loaded..");
            cf.Sleep(500);

        GameConsole gc = new GameConsole();
        Inventory inv = new Inventory();
        Player p = new Player(0,GML.getRoomManager(),inv);

        /*System.out.println(p.getCurrentRoomName());*/
        gc.start(p,GML.getRoomManager(), inv);


    }
}
