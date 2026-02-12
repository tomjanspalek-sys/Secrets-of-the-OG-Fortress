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
 * Class for items with their properities
 */
public class Item {

    private int id;
    private String name;
    private String description;
    private boolean pickupable;





}