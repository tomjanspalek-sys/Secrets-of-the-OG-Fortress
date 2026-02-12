package Commands;

import Player.*;
import World.Exit;
import World.RoomManager;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Console class that controls whole game by commands,
 * checks player input a starts action of commands
 */
public class GameConsole {


    private HashMap<String, Command> commands;
    private boolean isExit;
    private Scanner scanner;

    public GameConsole() {
        commands = new HashMap<>();
        isExit = false;
        scanner = new Scanner(System.in);
    }

    /**
     * inicializes all commands with additional inputs, which are then used in commands
     * @param player -> player class
     * @param roomManager -> roomManager class
     * @param inventory -> inventory class (could be accessed through player)
     */
    public void inicilization(Player player, RoomManager roomManager, Inventory inventory) {
        commands.put("go", new GoCommand(player, roomManager, new Exit(player)));
        commands.put("exit", new StopCommand());
        commands.put("stop",new StopCommand());
        commands.put("stats", new StatsCommand(player, inventory, roomManager));
        commands.put("help", new HelpCommand());
        commands.put("take", new TakeCommand(roomManager, inventory, player));
        commands.put("pick", new TakeCommand(roomManager, inventory, player));
        commands.put("search", new SearchCommand(roomManager, player));
        commands.put("drop", new DropCommand(inventory, roomManager, player));
        commands.put("talk", new TalkCommand(roomManager, player));
        commands.put("use", new UseCommand(roomManager, player, inventory));
        commands.put("map", new MapCommand(player));
        commands.put("hint", new HintCommand());
    }

    public void execute(Player player) {



        System.out.print(">> ");
        String command = scanner.nextLine()+" "+null;
        command = command.trim().toLowerCase();
        String commandInput[]  = command.split(" ");

        if(commands.containsKey(commandInput[0])) {
            System.out.println(commands.get(commandInput[0]).execute(commandInput));
            isExit = commands.get(commandInput[0]).isExit();

            if (player.inventory().isSecretItem()){
                SecretItem si = new SecretItem();
                si.sikritEnding();
                player.inventory().setSecretItem(false);
            }

        }else{
            System.out.println("Command is not recognized | use 'help' for list of all commands");
        }



    }

    public void start(Player player, RoomManager roomManager, Inventory inventory) {
        inicilization(player, roomManager, inventory);
        do {
            execute(player);
        }while(!isExit);
    }


}
