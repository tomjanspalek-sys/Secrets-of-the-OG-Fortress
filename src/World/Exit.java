package World;

import Player.Player;
import Util.CompFunc;


/**
 * End game class that is premade Room for starting the
 * end of the whole game
 */
public class Exit {
    private boolean isEnd = false;

        private Player player;
        private CompFunc cf = new CompFunc();
        private boolean win = false;

        public Exit(Player player) {
            this.player = player;
        }

    /**
     * checks if the winning condition is true
     * @return true/false -> then tells the game if it was completed or not
     */
    public boolean End() {
            boolean isEmpty = !player.inventory().getInventory().isEmpty();
            if (isEmpty) {
                if (player.inventory().getInventory().get(0).getId() == 3 || player.inventory().getInventory().get(1).getId() == 3) {
                    win = true;
                    return true;
                }
            } else System.out.println("it looks like i forgot the artifact");

        cf.Line(1);
        cf.Sleep(500);
            player.setRoomID(0);
            player.setCurrentRoomName("Yard");

        return false;
    }

    public boolean getWin() {
        return win;
    }



}
