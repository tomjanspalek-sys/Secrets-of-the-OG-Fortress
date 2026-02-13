package Player;
import World.RoomManager;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

/**
 * Player's Class
 */
public class Player {

    private int roomID;
    private String currentRoomName;
    private Inventory inventory;

    public Player(int startRoom, RoomManager roomManager, Inventory inventory) {
        this.roomID = startRoom;
        this.currentRoomName = roomManager.getRooms().get(roomID).getName();
        this.inventory = inventory;

    }

    public Inventory inventory() {
        return inventory;
    }
}
