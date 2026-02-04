package Commands;

import Player.*;
import World.RoomManager;

public class StatsCommand implements Command {

    private Inventory inventory;
    private Player player;
    private RoomManager roomManager;

    public StatsCommand(Player player, Inventory inventory, RoomManager roomManager) {
        this.inventory = inventory;
        this.player = player;
        this.roomManager = roomManager;
    }

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
