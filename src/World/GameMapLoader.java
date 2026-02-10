package World;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class GameMapLoader {

    public RoomManager getRoomManager() {
        return roomManager;
    }

    private RoomManager roomManager;


    /**
     * loads json from selected path
     * @param resourcePath -> String of file path
     */
    public void Load(String resourcePath){
        ObjectMapper parser = new ObjectMapper();
        try{
            InputStream input = new FileInputStream(resourcePath);
            roomManager = parser.readValue(input, RoomManager.class);
            /*System.out.println(roomManager.toString());*/

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
