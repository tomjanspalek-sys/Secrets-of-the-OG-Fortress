package Commands;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import Util.CompFunc;

/**
 * One of Command classes, this one takes care of
 * action hint -> prints out random hint
 */
public class HintCommand implements Command{

    ArrayList<String> hints = new ArrayList<>();
    CompFunc cf = new CompFunc();
    Random rd = new Random();

    /**
     * prints one of the hints, which are randomly picked
     * @param args - unused
     * @return text -> returns selected random hint
     */
    @Override
    public String execute(String[] args) {


        InputStream input = HintCommand.class.getClassLoader().getResourceAsStream("hints.txt");
        if(input == null) {
            throw new RuntimeException("Unable to load file");
        }


        try(BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            String text = null;

            while ((text = br.readLine()) != null) {
                    hints.add(text);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        int random = rd.nextInt(hints.size());

        return hints.get(random);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
