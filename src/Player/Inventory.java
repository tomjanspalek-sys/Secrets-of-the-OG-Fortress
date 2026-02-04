package Player;
import World.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Inventory {


    private ArrayList<Item> inventory = new ArrayList<>();
    private int capacity = 2;
    private boolean secretItem = false;



    public boolean addItem(Item item) {
        if (!isFull()){
            if (item.getId()==4){
                secretItem = true;
            }

            return inventory.add(item);

        }else {
            return false;
        }
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public boolean isFull() {
        return inventory.size() == capacity;
    }

    @Override
    public String toString() {
        String finalMesg = "";
        for (int i = 0; i < inventory.size(); i++) {
            finalMesg = finalMesg + inventory.get(i).getName()+", ";
        }
        return finalMesg;
    }
}
