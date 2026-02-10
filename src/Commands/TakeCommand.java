package Commands;

import Player.Inventory;
import Player.Player;
import Util.CompFunc;
import World.*;

public class TakeCommand implements Command{

    private RoomManager roomManager;
    private Inventory inventory;
    private Player player;
    private CompFunc compFunc = new CompFunc();

    public TakeCommand(RoomManager roomManager, Inventory inventory, Player player) {
        this.roomManager = roomManager;
        this.inventory = inventory;
        this.player = player;
    }


    /**
     * picks up item, that is selected by player
     * @param args -> checks the player selected item if it's located in the room, then checks the name
     *             by word and if it's possible, then it adds to player inventory
     * @return finalMessage -> (typo) returns appropriate message, which is decided by conditions
     */
    @Override
    public String execute(String[] args) {
        boolean secretPicked = false;
        int currID = player.getRoomID();

        Item item1 = null;
            String[] itemName1;
        Item item2 = null;
            String[] itemName2;


        if (roomManager.getRooms().get(currID).getItems().get(0)!=null) {
            item1 = roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(0));
            itemName1 = item1.getName().split(" ");
        }else {itemName1 = null;
        }

        if (roomManager.getRooms().get(currID).getItems().get(1)!=null) {
            item2 = roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(1));
            itemName2 = item2.getName().split(" ");
        }else {
            itemName2 = null;
        }


        boolean isMatch[] = new boolean[2];


            for (int i = 1; i < args.length; i++) {
                    if(item1!=null){
                        for (int j = 0; j < itemName1.length; j++) {
                        if (args[i].equalsIgnoreCase(itemName1[j])) {
                            isMatch[0] = true;
                        }
                    }
                }
                    if(item2!=null){
                        for (int l = 0; l < itemName2.length; l++) {
                        if (args[i].equalsIgnoreCase(itemName2[l])) {
                            isMatch[1] = true;
                        }
                    }
                }
            }


            String FinalMessage = "";

        if(isMatch[0]) {
            if (item1.isPickupable()){
                if (!inventory.isFull()) {
                    inventory.addItem(item1);
                    roomManager.getRooms().get(currID).getItems().set(0, null);
                    System.out.println(item1.getDescription());
                    compFunc.Sleep(500);
                    FinalMessage = "You picked up: " + item1.getName();
                }else {
                    FinalMessage = "Can't pickup another item, inventory is full";
                }
            }else
                FinalMessage = "You can't pick up this";
        }
        if(isMatch[1]) {
            if (item2.isPickupable()){
                if (!inventory.isFull()) {
                    inventory.addItem(item2);
                    roomManager.getRooms().get(currID).getItems().set(1, null);
                    System.out.println(item2.getDescription());
                    compFunc.Sleep(800);
                    FinalMessage = "You picked up: " + item2.getName();
                }else {
                    FinalMessage = "Can't pickup another item, inventory is full";
                }
            }else
                FinalMessage = "You can't pick up this";
        }
        if (!isMatch[0] && !isMatch[1]) {
            FinalMessage = "There's no such item";
        }



        return FinalMessage;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
