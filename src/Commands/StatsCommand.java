package Commands;

import Player.*;
import World.RoomManager;

/**
 * One of Command classes, this one takes care of
 * action Stats -> prints all info about player (inventory, location and location desc.)
 */
public class StatsCommand implements Command {

    private Inventory inventory;
    private Player player;
    private RoomManager roomManager;

    public StatsCommand(Player player, Inventory inventory, RoomManager roomManager) {
        this.inventory = inventory;
        this.player = player;
        this.roomManager = roomManager;
    }

    /**
     * prints quick info about player(currLocation+desc. + inventory)
     * @param args - unused
     * @return string that is modified with information that are needed
     */
    @Override
    public String execute(String[] args) {
        return  "-------------------------------------------------------------"+
                "\nCurrently located at: " + player.getCurrentRoomName() + "\n         Description: " + roomManager.getRooms().get(player.getRoomID()).getDescription() + "\n" +
                "\nInventory: " + inventory.toString() + "\n" +
                "-------------------------------------------------------------";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
