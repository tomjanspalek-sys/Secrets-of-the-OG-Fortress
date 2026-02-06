package Commands;

import Player.*;
import World.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;


class GoCommandTest {

    Room room1;
    Room room2;
    GoCommand goCommand;
    Player player;
    Exit exit;
    RoomManager roomManager;
    String[] south;
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
        player = new Player(0, GML.getRoomManager(), inventory);
        exit = new Exit(player);
        roomManager = null;
        room1 = new Room();
        room2 = new Room();
        goCommand = new GoCommand(player, GML.getRoomManager(), exit);
        south = new String[]{null, "south"};
    }



    @Test
    void execute() {
        goCommand.execute(south);
    }
}