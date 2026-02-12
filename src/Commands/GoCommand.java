package Commands;

import Player.Player;

import java.util.Scanner;

import Util.CompFunc;
import World.Connections;
import World.Exit;
import World.RoomManager;

/**
 * One of Command classes, this one takes care of
 * action go -> moves player around the map
 */
public class GoCommand implements Command{

    private String finalMessage = "";

    private Player player;
    private RoomManager roomManager;
    private CompFunc cf = new CompFunc();
    private Exit exit;

    public GoCommand(Player player, RoomManager roomManager, Exit exit) {
        this.player = player;
        this.roomManager = roomManager;
        this.exit = exit;
    }

    /**
     * Method that moves player around the map
     * @param args -> direction that player wants to go
     *             it is compared by Room info and decides if it can go there or not
     * @return finalMesg -> returns appropriate message, if it failed it will say something
     * with you bumped into wall or why you cant go there, otherwise it tells player he moved into his selected direction
     */
    @Override
    public String execute(String[] args) {

        String item1 = "";
        String item2 = "";

        Connections connections = roomManager.getRooms().get(player.getRoomID()).getConnections();

        if (!player.inventory().getInventory().isEmpty()) {
            if (player.inventory().getInventory().get(0) != null) {
                item1 = player.inventory().getInventory().get(0).getName();
            }
        }
        if (player.inventory().getInventory().size()>1) {
            if (player.inventory().getInventory().get(1) != null) {
                item2 = player.inventory().getInventory().get(1).getName();
            }
        }


        Scanner scanner = new Scanner(System.in);

        switch (args[1]){
            case "south" -> {

                boolean torch = item1.equals("Wooden Torch")||item2.equals("Wooden Torch");
                boolean dark = torch&&roomManager.getRooms().get(connections.getSouthID()).isDark();

                if(connections.getSouth() != null){
                    if (!roomManager.getRooms().get(connections.getSouthID()).isLocked()) {
                        if (!roomManager.getRooms().get(connections.getSouthID()).isDark()||dark) {
                            player.setRoomID(connections.getSouthID());
                            player.setCurrentRoomName(roomManager.getRooms().get(connections.getSouthID()).getName());

                            finalMessage = ("You walked in " + player.getCurrentRoomName());
                        }else {
                            finalMessage = ("This room is too dark to enter.. I need something to be able to see");
                        }
                    }else {
                        finalMessage = ("The room is locked");
                    }

                }else
                   finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            case "north" -> {

                boolean torch = item1.equals("Wooden Torch")||item2.equals("Wooden Torch");
                boolean dark = torch&&roomManager.getRooms().get(connections.getNorthID()).isDark();

                if(connections.getNorth() != null){
                    if (!roomManager.getRooms().get(connections.getNorthID()).isLocked()) {
                        if (!roomManager.getRooms().get(connections.getNorthID()).isDark()||dark) {
                            player.setRoomID(connections.getNorthID());
                            player.setCurrentRoomName(roomManager.getRooms().get(connections.getNorthID()).getName());

                            finalMessage = ("You walked in " + player.getCurrentRoomName());
                        }else {
                            finalMessage = ("This room is too dark to enter.. I need something to be able to see");
                        }
                    }else {
                        finalMessage = ("The room is locked");
                    }

                }else
                    finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            case "east" -> {

                boolean torch = item1.equals("Wooden Torch")||item2.equals("Wooden Torch");
                boolean dark = torch&&roomManager.getRooms().get(connections.getEastID()).isDark();

                if(connections.getEast() != null){
                    if (!roomManager.getRooms().get(connections.getEastID()).isLocked()) {
                        if (!roomManager.getRooms().get(connections.getEastID()).isDark()||dark) {
                            player.setRoomID(connections.getEastID());
                            player.setCurrentRoomName(roomManager.getRooms().get(connections.getEastID()).getName());

                            finalMessage = ("You walked in " + player.getCurrentRoomName());
                        }else {
                            finalMessage = ("This room is too dark to enter.. I need something to be able to see");
                        }
                    }else {
                        finalMessage = ("The room is locked");
                    }

                }else
                    finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            case "west" -> {

                boolean torch = item1.equals("Wooden Torch")||item2.equals("Wooden Torch");
                boolean dark = torch&&roomManager.getRooms().get(connections.getWestID()).isDark();

                if(connections.getWest() != null){
                    if (!roomManager.getRooms().get(connections.getWestID()).isLocked()) {
                        if (!roomManager.getRooms().get(connections.getWestID()).isDark()||dark) {
                            player.setRoomID(connections.getWestID());
                            player.setCurrentRoomName(roomManager.getRooms().get(connections.getWestID()).getName());

                            finalMessage = ("You walked in " + player.getCurrentRoomName());
                        }else {
                            finalMessage = ("This room is too dark to enter.. I need something to be able to see");
                        }
                    }else {
                        finalMessage = ("The room is locked");
                    }

                }else
                    finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            default -> {
                System.out.println("where you want to go:");
                System.out.println("-----------------------");
                if (connections.getSouth() != null) {
                    System.out.println("South: "+roomManager.getRooms().get(connections.getSouthID()).getName());
                }
                if (connections.getNorth() != null) {
                    System.out.println("North: "+roomManager.getRooms().get(connections.getNorthID()).getName());
                }
                if (connections.getEast() != null) {
                    System.out.println("East: "+roomManager.getRooms().get(connections.getEastID()).getName());
                }
                if (connections.getWest() != null) {
                    System.out.println("West: "+roomManager.getRooms().get(connections.getWestID()).getName());
                }

                System.out.println("-----------------------" +
                        "\n        exit");

                System.out.print("\n>> ");
                args[1] = scanner.nextLine();


                if (args[1].equals("exit")||args[1].equals("quit")||args[1].equals("cancel")) {
                    break;
                }
                execute(args);
            }

        }

        if (player.getRoomID()==8){
            if (!exit.End()){
                finalMessage = "You returned back into the Yard";
                isExit();
            }
        }

        return finalMessage;
    }

    @Override
    public boolean isExit() {

        if (exit.getWin()){

                cf.Line(20);

            cf.Sound("resources//sounds//celebration.wav");

                cf.Sleep(6000);

            System.out.println("              CONGRATULATIONS");
            System.out.println();
            System.out.println("YOU SUCCESFULLY COMPLETED THE WHOLE GAME");

                cf.Sleep(5000);
            return true;
        } else return false;
    }
}
