package World;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor

/**
 * Class for having easy access to connected rooms
 * when moving from another room
 */
public class Connections {

        private String north;
        private int northID;
        private String south;
        private int southID;
        private String east;
        private int eastID;
        private String west;
        private int westID;


}

