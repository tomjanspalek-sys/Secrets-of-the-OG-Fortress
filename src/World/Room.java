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
 * Class that holds all information of each room
 */
public class Room {

    private int id;
    private String name;
    private String description;
    private Connections connections;
    private List<Integer> items;
    private boolean locked;
    private boolean dark;

}
