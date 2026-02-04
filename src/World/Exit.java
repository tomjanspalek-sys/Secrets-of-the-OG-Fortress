package World;

import Commands.StopCommand;
import Player.Inventory;
import Player.Player;
import Util.CompFunc;

import java.util.function.Predicate;

public class Exit {
    private boolean isEnd = false;

        private Player player;
        private CompFunc cf = new CompFunc();
        private boolean win = false;

        public Exit(Player player) {
            this.player = player;
        }

    public boolean End() {
            boolean isEmpty = !player.inventory().getInventory().isEmpty();
            if (isEmpty) {
                if (player.inventory().getInventory().get(0).getId() == 3 || player.inventory().getInventory().get(1).getId() == 3) {
                    System.out.println("huste ty");
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
