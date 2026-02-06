import Commands.GameConsole;
import Player.*;
import Util.CompFunc;
import World.GameMapLoader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Game {

    CompFunc cf = new CompFunc();


    public void startGame() {
        GameMapLoader GML = new GameMapLoader();
        GML.Load("resources/gamedata.json");


        try(BufferedReader br = new BufferedReader(new FileReader("resources//introText.txt"))) {
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
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        //System.out.println("Game loaded..");
            cf.Sleep(500);




        GameConsole gc = new GameConsole();
        Inventory inv = new Inventory();
        Player p = new Player(1,GML.getRoomManager(),inv);

        /*System.out.println(p.getCurrentRoomName());*/
        gc.start(p,GML.getRoomManager(), inv);


    }
    public void endGame() {
    }

    public boolean isGameRunning() {
        return false;
    }

    public boolean checkWinCondition() {
        return false;
    }
}
