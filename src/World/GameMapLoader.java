package World;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * The most Important class, load whole game then
 * devides data in ->
 * @Class RoomManager
 */
public class GameMapLoader {

    private RoomManager roomManager;

    public RoomManager getRoomManager() {
        return roomManager;
    }



    /**
     * loads json from selected path
     * @param resourcePath -> String of file path
     */
    public void Load(String resourcePath){
        ObjectMapper parser = new ObjectMapper();
        InputStream input = GameMapLoader.class.getResourceAsStream(resourcePath);
        if(input == null) {
            throw new RuntimeException("Unable to load the game");
        }

        try(input){
            roomManager = parser.readValue(input, RoomManager.class);
            /*System.out.println(roomManager.toString());*/

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
