package Commands;

/**
 * One of Command classes, this one takes care of
 * action stop -> stops the game on player's demand
 */
public class StopCommand implements Command{

    /**
     * shutdowns the gmae
     * @param args - unused
     * @return "Shutting down"
     */
    @Override
    public String execute(String[] args) {
        return "Shutting down";
    }

    /**
     * boolean that tells rest of the game to end itself
     * @return true if command is ran
     */
    @Override
    public boolean isExit() {
        return true;
    }
}
