package Commands;

public class MapCommand implements Command {

    @Override
    public String execute(String[] args) {
        return "                    E X I T                       \n" +
                "                                                  \n" +
                "                       ▲                          \n" +
                "                       │                          \n" +
                "┌────────────────────  │  ───────────────────────┐\n" +
                "│         ?                                      │\n" +
                "│  ?           ?     Yard                        │\n" +
                "│                      │                         │\n" +
                "│  ?      ?            │                         │\n" +
                "│              ?       ▼                         │\n" +
                "│     ?                                          │\n" +
                "│  Armory ◄─────── Main Hall ──────► Guard Room  │\n" +
                "│                                                │\n" +
                "│                      │                         │\n" +
                "│                      │                         │\n" +
                "│                      ▼                         │\n" +
                "│                                                │\n" +
                "│                   Library                      │\n" +
                "│                                                │\n" +
                "│                                                │\n" +
                "│                      │                         │\n" +
                "│                      ▼                         │\n" +
                "│                                                │\n" +
                "│                Dark Basement  ───► Treasury    │\n" +
                "│                                                │\n" +
                "│                                       │        │\n" +
                "│                                       │        │\n" +
                "│                                       │        │\n" +
                "│                                       ▼        │\n" +
                "│                                                │\n" +
                "│                        ┌─────  Secret Chamber  │\n" +
                "│                        │                       │\n" +
                "└────────────────────────┼───────────────────────┘\n" +
                "                         │                        \n" +
                "                         └── tlusetej karl?       ";
    }

    @Override
    public boolean isExit() {
        return false;
    }

}
