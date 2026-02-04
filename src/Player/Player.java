package Player;
import World.Room;
import World.RoomManager;

public class Player {

    private int roomID;
    private String currentRoomName;
    private Inventory inventory;

    public Player(int startRoom, RoomManager roomManager, Inventory inventory) {
        currentRoomName = roomManager.getRooms().get(roomID).getName();
        this.inventory = inventory;

    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getCurrentRoomName() {
        return currentRoomName;
    }

    public void setCurrentRoomName(String currentRoomName) {
        this.currentRoomName = currentRoomName;
    }

    public Inventory inventory() {
        return inventory;
    }
}
