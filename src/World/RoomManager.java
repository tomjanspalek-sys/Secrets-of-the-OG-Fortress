package World;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor

/**
 * Class that divides data that are loaded from GML class
 */
public class RoomManager {
    private List<Room> rooms;
    private List<Item> items;
    private List<Character> characters;

}
