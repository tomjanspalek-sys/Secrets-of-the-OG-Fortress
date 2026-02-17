package Commands;

import java.io.*;

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

        InputStream input = HelpCommand.class.getResourceAsStream("/helpText.txt");
        if(input == null) {
            throw new RuntimeException("Unable to load file");
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
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
