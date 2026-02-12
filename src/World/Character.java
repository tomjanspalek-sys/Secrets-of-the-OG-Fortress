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
 * Character class that is loaded from
 * @Class GameMapLoader
 */
public class Character {

    private int id;
    private String name;
    private String description;
    private List<String> dialogues;
    private int currentRoom;
    private String dialogueFile;
    private boolean spoken;


}
