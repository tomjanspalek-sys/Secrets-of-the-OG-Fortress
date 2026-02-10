package Commands;

import Audio.AudioPlayer;
import Player.*;
import World.RoomManager;

public class UseCommand implements Command{

    private RoomManager roomManager;
    private Player player;
    private Inventory inventory;

    public UseCommand(RoomManager roomManager, Player player, Inventory inventory){
        this.roomManager = roomManager;
        this.player = player;
        this.inventory = inventory;
    }

    /**
     * Method that uses player selected item
     * @param args -> item that is then used, compareb by word
     * @return finalMesg -> returns appropriate message that is chosen by conditions
     */
    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        String finalMesg = "";

        String use = "";

        for (int i = 0; i < inventory.getInventory().size(); i++) {
            if (inventory.getInventory().get(i).getId() == 0) {
                use = "key1";
            }
            if (inventory.getInventory().get(i).getId() == 5) {
                use = "key2";
            }
        }

            switch (use) {
                case "key1" -> {
                    if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getSouthID()).isLocked()) {
                        finalMesg = "You've unlocked the room by key, but the key broke..";

                        AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                        roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getSouthID()).setLocked(false);
                        for (int i = 0; i < inventory.getInventory().size(); i++) {
                            if (inventory.getInventory().get(i).getId() == 0) {
                                inventory.getInventory().remove(i);
                            }
                        }
                    }
                    if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getNorthID()).isLocked()) {
                        finalMesg = "You've unlocked the room by key, but the key broke..";

                        AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                        roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getNorthID()).setLocked(false);
                        for (int i = 0; i < inventory.getInventory().size(); i++) {
                            if (inventory.getInventory().get(i).getId() == 0) {
                                inventory.getInventory().remove(i);
                            }
                        }
                    }
                    if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getEastID()).isLocked()) {
                        finalMesg = "You've unlocked the room by key, but the key broke..";

                        AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                        roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getEastID()).setLocked(false);
                        for (int i = 0; i < inventory.getInventory().size(); i++) {
                            if (inventory.getInventory().get(i).getId() == 0) {
                                inventory.getInventory().remove(i);
                            }
                        }
                    }
                    if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getWestID()).isLocked()) {
                        finalMesg = "You've unlocked the room by key, but the key broke..";

                        AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                        roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getWestID()).setLocked(false);
                        for (int i = 0; i < inventory.getInventory().size(); i++) {
                            if (inventory.getInventory().get(i).getId() == 0) {
                                inventory.getInventory().remove(i);
                            }
                        }
                    }
                }
                    case "key2" -> {
                        if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getSouthID()).isLocked()
                                &&roomManager.getRooms().get(currID).getConnections().getSouthID() == 7&&roomManager.getRooms().get(currID).getConnections().getSouth() != null) {
                            finalMesg = "You've unlocked the room by key, but the key broke..";

                            AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                            roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getSouthID()).setLocked(false);
                            for (int i = 0; i < inventory.getInventory().size(); i++) {
                                if (inventory.getInventory().get(i).getId()==5) {
                                    inventory.getInventory().remove(i);
                                }
                            }
                        }else if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getNorthID()).isLocked()
                                &&roomManager.getRooms().get(currID).getConnections().getNorthID() == 7&&roomManager.getRooms().get(currID).getConnections().getNorth() != null) {
                            finalMesg = "You've unlocked the room by key, but the key broke..";

                            AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                            roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getNorthID()).setLocked(false);
                            for (int i = 0; i < inventory.getInventory().size(); i++) {
                                if (inventory.getInventory().get(i).getId()==5) {
                                    inventory.getInventory().remove(i);
                                }
                            }
                        }else if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getEastID()).isLocked()
                                &&roomManager.getRooms().get(currID).getConnections().getEastID() == 7&&roomManager.getRooms().get(currID).getConnections().getEast() != null) {
                            finalMesg = "You've unlocked the room by key, but the key broke..";

                            AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                            roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getEastID()).setLocked(false);
                            for (int i = 0; i < inventory.getInventory().size(); i++) {
                                if (inventory.getInventory().get(i).getId()==5) {
                                    inventory.getInventory().remove(i);
                                }
                            }
                        }else if (roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getWestID()).isLocked()
                                &&roomManager.getRooms().get(currID).getConnections().getWestID() == 7&&roomManager.getRooms().get(currID).getConnections().getWest() != null) {
                            finalMesg = "You've unlocked the room by key, but the key broke..";

                            AudioPlayer.playSound("resources//sounds//doorUnlock.wav");

                            roomManager.getRooms().get(roomManager.getRooms().get(currID).getConnections().getWestID()).setLocked(false);
                            for (int i = 0; i < inventory.getInventory().size(); i++) {
                                if (inventory.getInventory().get(i).getId()==5) {
                                    inventory.getInventory().remove(i);
                                }
                            }
                        }else {
                            finalMesg = "it looks like this key doesn't fit";
                        }

                }
                default -> {
                    finalMesg = "It looks like you cant use this item";
                }
            }


        return finalMesg;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
