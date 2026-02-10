package Commands;

import Player.Player;
import Util.CompFunc;
import World.RoomManager;

public class SearchCommand implements Command{

    private RoomManager roomManager;
    private CompFunc cf = new CompFunc();
    private Player player;

    public SearchCommand(RoomManager roomManager, Player player){
        this.roomManager = roomManager;
        this.player = player;
    }

    /**
     * Method that gets player's id of current room
     * then starts to animated print
     * @param args - unused
     * @return - returns message if there's anyone/anything
     * that player can pick up or can talk to
     */
    @Override
    public String execute(String[] args) {
            int repeat = 0;
            int currID = player.getRoomID();

        do {

            System.out.print("\rSearching.");

            cf.Sleep(200);

            System.out.print("\rSearching..");

            cf.Sleep(200);

            System.out.print("\rSearching...");

            cf.Sleep(200);

            repeat++;
        }while(repeat!=3);

        System.out.println();

            for (int i = 0; i < roomManager.getCharacters().size(); i++) {
                if (roomManager.getCharacters().get(i).getCurrentRoom()==currID){
                    System.out.println("There's someone you can talk to..");
                }

            }


            if (roomManager.getRooms().get(currID).getItems().get(0)!=null&&roomManager.getRooms().get(currID).getItems().get(1)!=null){
                return "You have found:" + " ( " + roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(0)).getName() + " | " + roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(1)).getName() + " )" ;
            }
            if (roomManager.getRooms().get(currID).getItems().get(0)!=null&&roomManager.getRooms().get(currID).getItems().get(1)==null){
                return "You have found:" + " ( " + roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(0)).getName() + " |       )" ;
            }
            if (roomManager.getRooms().get(currID).getItems().get(0)==null&&roomManager.getRooms().get(currID).getItems().get(1)!=null){
                return "You have found:" + " (       | " + roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(1)).getName() + " )" ;
            }

        return "You have found: Nothing";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
