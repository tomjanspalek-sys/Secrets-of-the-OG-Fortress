package Commands;

import Player.Inventory;
import Player.Player;
import World.Room;
import World.RoomManager;

public class HintCommand implements Command{

    //TODO dodelat napovedy (ceka se dodelani mistnosti)
    private Player player;
    private RoomManager roomManager;


    public HintCommand() {

    }




    @Override
    public String execute(String[] args) {
        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
