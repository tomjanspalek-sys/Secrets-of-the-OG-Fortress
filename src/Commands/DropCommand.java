package Commands;

import Player.Inventory;
import Player.Player;
import World.Item;
import World.RoomManager;
import java.util.List;

/**
 * One of Command classes, this one takes care of
 * action drop -> drops player chosen item in current room
 */
public class DropCommand implements Command {

    private Inventory inventory;
    private RoomManager roomManager;
    private Player player;

    public DropCommand(Inventory inventory, RoomManager roomManager, Player player) {
        this.inventory = inventory;
        this.roomManager = roomManager;
        this.player = player;
    }


    /**
     * Method that drops player's selected item in current room
     * @param args -> it compares by word name of player's selected item with items in current inventory
     * @return finalMesg -> returns appropriate text, which is selected if player has the item or not
     * , or if the room has full item slots, it fails and tells to go somewhere else to drop it
     */
    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        List<Item> playerInv = inventory.getInventory();
            Item[] items = new Item[2];
        for (int i = 0; i < inventory.getInventory().size(); i++) {
            items[i] = inventory.getInventory().get(i);
        }

        String[] item1;
        String[] item2;
        if (items[0]!=null) {
            item1 = items[0].getName().split(" ");
        }else{ item1 = null;}
        if (items[1]!=null) {
            item2 = items[1].getName().split(" ");
        }else{ item2 = null;}


        boolean isMatch[] = new boolean[2];

        for (int i = 1; i < args.length; i++) {
            if(item1!=null){
                for (int j = 0; j < item1.length; j++) {
                    if (args[i].equalsIgnoreCase(item1[j])) {
                        isMatch[0] = true;
                    }
                }
            }
            if(item2!=null){
                for (int j = 0; j < item2.length; j++) {
                    if (args[i].equalsIgnoreCase(item2[j])) {
                        isMatch[1] = true;
                    }
                }
            }
        }

        String finalMesg = null;
        boolean changed = false;

        if (isMatch[0]) {
            if (roomManager.getRooms().get(currID).getItems().get(0)==null) {
                roomManager.getRooms().get(currID).getItems().set(0, items[0].getId());
                    finalMesg = "You dropped " + items[0].getName() + " from your inventory";
                    inventory.removeItem(items[0]);
                    changed = true;
            }else if (roomManager.getRooms().get(currID).getItems().get(1)==null) {
                roomManager.getRooms().get(currID).getItems().set(1, items[0].getId());
                    finalMesg = "You dropped " + items[0].getName() + " from your inventory";
                    inventory.removeItem(items[0]);
                    changed = true;
            }
        }else if(!changed){
            finalMesg = "Looks like it`s already too messy in this room, try to drop it somewhere else";
        }
        if (isMatch[1]) {
            if (roomManager.getRooms().get(currID).getItems().get(0)==null) {
                roomManager.getRooms().get(currID).getItems().set(1, items[1].getId());
                    finalMesg = "You dropped " + items[1].getName() + " from your inventory";
                    inventory.removeItem(items[1]);
                    changed = true;
            }else if (roomManager.getRooms().get(currID).getItems().get(1)==null) {
                roomManager.getRooms().get(currID).getItems().set(1, items[1].getId());
                    finalMesg = "You dropped " + items[1].getName() + " from your inventory";
                    inventory.removeItem(items[1]);
                    changed = true;
            }
        }else if(!changed){
            finalMesg = "Looks like it`s already too messy in this room, try to drop it somewhere else";
        }




        return finalMesg;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
