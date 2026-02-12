package Commands;

import Player.Player;

/**
 * One of Command classes, this one takes care of
 * action map -> prints map with player's current location
 */
public class MapCommand implements Command {

    private Player player;

    public MapCommand(Player player) {
        this.player = player;
    }

    /**
     * Method prints map variant that is chosen by
     * player's id of his room
     * @param args - unused
     * @return finalMesg -> changes by player's id of his current room
     */
    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        String finalMesg = "                    E X I T                      \n" +
                "                                                 \n" +
                "                       ▲                         \n" +
                "                       │                         \n" +
                "┌────────────────────  │  ──────────────────────┐\n" +
                "│          ?                                    │\n" +
                "│   ?           ?     Yard                      │\n" +
                "│         ?                                     │\n" +
                "│  ?                    │                       │\n" +
                "│      ?        ?       ▼                       │\n" +
                "│                                               │\n" +
                "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                "│                                               │\n" +
                "│                       │                       │\n" +
                "│                       │                       │\n" +
                "│                       ▼                       │\n" +
                "│                                               │\n" +
                "│                    Library                    │\n" +
                "│                                               │\n" +
                "│                       │                       │\n" +
                "│                       ▼                       │\n" +
                "│                                               │\n" +
                "│                 Dark Basement  ──► Treasury   │\n" +
                "│                                               │\n" +
                "│                                       │       │\n" +
                "│      N                                │       │\n" +
                "│      ▲                                │       │\n" +
                "│   W─◄┼►─E                             ▼       │\n" +
                "│      ▼                                        │\n" +
                "│      S                  ┌───── Secret Chamber │\n" +
                "│                         │                     │\n" +
                "└─────────────────────────┼─────────────────────┘\n" +
                "                          │                      \n" +
                "                          └── tlustej karl?      ";

        switch (currID) {
            case 0 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?         ┌────┐                     │\n" +
                        "│   ?           ?    │Yard│                     │\n" +
                        "│         ?          └────┘                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 1 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                  ┌─────────┐                  │\n" +
                        "│ Guard Room ◄─────│Main Hall│──────► Armory    │\n" +
                        "│                  └─────────┘                  │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 2 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                    ┌──────┐   │\n" +
                        "│ Guard Room ◄───── Main Hall ──────►│Armory│   │\n" +
                        "│                                    └──────┘   │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 4 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│┌──────────┐                                   │\n" +
                        "││Guard Room│◄───── Main Hall ──────► Armory    │\n" +
                        "│└──────────┘                                   │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 3 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                   ┌───────┐                   │\n" +
                        "│                   │Library│                   │\n" +
                        "│                   └───────┘                   │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 5 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                ┌─────────────┐                │\n" +
                        "│                │Dark Basement│ ──► Treasury   │\n" +
                        "│                └─────────────┘                │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 6 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                   ┌────────┐  │\n" +
                        "│                 Dark Basement  ──►│Treasury│  │\n" +
                        "│                                   └────────┘  │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 7 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                        ┌──────────────┐│\n" +
                        "│      S                  ┌─────│Secret Chamber││\n" +
                        "│                         │     └──────────────┘│\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 8 -> {
                finalMesg = "                   ┌───────┐                     \n" +
                        "                   │E X I T│                     \n" +
                        "                   └───────┘                     \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│          ?                                    │\n" +
                        "│   ?           ?     Yard                      │\n" +
                        "│         ?                                     │\n" +
                        "│  ?                    │                       │\n" +
                        "│      ?        ?       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
            case 9 -> {
                finalMesg = "                    E X I T                      \n" +
                        "                                                 \n" +
                        "                       ▲                         \n" +
                        "                       │                         \n" +
                        "┌────────────────────  │  ──────────────────────┐\n" +
                        "│   ┌────┐                                      │\n" +
                        "│   │Shed│ ◄───────── Yard                      │\n" +
                        "│   └────┘                                      │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│ Guard Room ◄───── Main Hall ──────► Armory    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                    Library                    │\n" +
                        "│                                               │\n" +
                        "│                       │                       │\n" +
                        "│                       ▼                       │\n" +
                        "│                                               │\n" +
                        "│                 Dark Basement  ──► Treasury   │\n" +
                        "│                                               │\n" +
                        "│                                       │       │\n" +
                        "│      N                                │       │\n" +
                        "│      ▲                                │       │\n" +
                        "│   W─◄┼►─E                             ▼       │\n" +
                        "│      ▼                                        │\n" +
                        "│      S                  ┌───── Secret Chamber │\n" +
                        "│                         │                     │\n" +
                        "└─────────────────────────┼─────────────────────┘\n" +
                        "                          │                      \n" +
                        "                          └── tlustej karl?      ";
            }
        }
        return finalMesg;

    }

    @Override
    public boolean isExit() {
        return false;
    }

}
