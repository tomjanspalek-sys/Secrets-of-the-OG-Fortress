package Commands;

import Player.*;
import World.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;


class DropCommandTest {

    DropCommand command;
    String[] args;

    Room room1;
    Room room2;
    Player player;
    Exit exit;
    RoomManager roomManager;
    GameMapLoader GML;
    Inventory inventory;

    private static class FakeWorld extends GameMapLoader {
        private HashMap<Integer, Room> rooms = new HashMap<>();

        void add(Room room) {
            rooms.put(room.getId(), room);
        }

    }



    @BeforeEach
    void setUp() {
        inventory = new Inventory();
        GML = new GameMapLoader();
        GML.Load("resources/gamedata.json");
        player = new Player(2, GML.getRoomManager(), inventory);
        exit = new Exit(player);
        roomManager = null;
        room1 = new Room();
        room2 = new Room();

        inventory.addItem(GML.getRoomManager().getItems().get(0));

        command = new DropCommand(inventory,GML.getRoomManager(),player);
        args = new String[]{null, "key"};
    }



    @Test
    void execute() {
        command.execute(args);
    }
}