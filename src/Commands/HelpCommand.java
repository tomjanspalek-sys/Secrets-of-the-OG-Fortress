package Commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * One of Command classes, this one takes care of
 * action help -> prints list of all commands
 */
public class HelpCommand implements Command{

    /**
     * prints helpText.txt
     * @param args - unused
     * @return help -> prints out all commands with simple guide how to use them
     */
    @Override
    public String execute(String[] args) {
        String help = "";
        try(BufferedReader br = new BufferedReader(new FileReader("resources//helpText.txt"))) {
            String txt = null;

            while ((txt = br.readLine()) != null) {
                help = help + txt+"\n";
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("I/O Exception");
        }

        return help;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
