package Commands;

import Player.Player;
import Util.CompFunc;
import World.RoomManager;
import World.Character;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TalkCommand implements Command{

    private RoomManager roomManager;
    private Player player;
    private CompFunc cf = new CompFunc();

    public TalkCommand(RoomManager roomManager, Player player) {
        this.roomManager = roomManager;
        this.player = player;
    }

//TODO dodelat dialogy postav
    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        Character character = null;
        boolean isMatch = false;
        String finalMesg = null;

        try {
            for (int i = 0; i < roomManager.getCharacters().size(); i++) {
                if (currID==roomManager.getCharacters().get(i).getCurrentRoom()){
                    isMatch = true;
                    character = roomManager.getCharacters().get(i);
                }
            }

            try(BufferedReader br = new BufferedReader(new FileReader(character.getDialogueFile()))) {
                String text = null;

                    while ((text = br.readLine()) != null) {
                        if (text.equalsIgnoreCase("...")){
                            cf.Sleep(500);
                        }else
                            System.out.println(text);
                    }
            }catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            catch (IOException e){
                e.printStackTrace();
            }

            System.out.println();
            finalMesg = character.getName()+": ,,"+character.getDialogues().get(1)+"'' ";
        } catch (NullPointerException e) {
            return "your mind: ,,it looks like there's nobody i can talk to''";
        }

        return finalMesg;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
