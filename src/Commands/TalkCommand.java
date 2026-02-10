package Commands;

import Audio.AudioPlayer;
import Audio.MusicPlayer;
import Player.Player;
import Util.CompFunc;
import World.RoomManager;
import World.Character;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TalkCommand implements Command{

    private RoomManager roomManager;
    private Player player;
    private CompFunc cf = new CompFunc();

    public TalkCommand(RoomManager roomManager, Player player) {
        this.roomManager = roomManager;
        this.player = player;
    }

    /**
     * Starts dialogue with character, if it's located in the room
     * @param args - unused
     * @return null
     * all prints are using System.out.print() with animation and sound effects
     */
    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        Character character = null;
        boolean isMatch = false;
        String finalMesg = "";

        try {
            for (int i = 0; i < roomManager.getCharacters().size(); i++) {
                if (currID==roomManager.getCharacters().get(i).getCurrentRoom()){
                    isMatch = true;
                    character = roomManager.getCharacters().get(i);
                }
            }

            try(BufferedReader br = new BufferedReader(new FileReader(character.getDialogueFile()))) {
                String text = null;


                /*MusicPlayer.play(AudioPlayer.loadSound("resources//sounds//dialogueSound.wav"));*/

                    while ((text = br.readLine()) != null) {
                        if (text.equalsIgnoreCase("...")){
                            cf.Sleep(3000);
                            text = "";
                        }
                        if (text.equalsIgnoreCase("!!!")) {
                            cf.Line(3);
                            text = "";
                        } else {
                            String[] words = text.split(" ");
                            if (words[0].equalsIgnoreCase("p")) {
                                words[0] = "";
                                MusicPlayer.play(AudioPlayer.loadSound("resources//sounds//dialoguePlayerSound.wav"));
                                for (int i = 0; i < 50; i++) {
                                    System.out.print(" ");
                                }
                            }
                            if (words[0].equalsIgnoreCase("N1")) {
                                MusicPlayer.play(AudioPlayer.loadSound("resources//sounds//dialogueNPCSound.wav"));
                                words[0] = "";
                            }
                            if (words[0].equalsIgnoreCase("N2")) {
                                MusicPlayer.play(AudioPlayer.loadSound("resources//sounds//dialogueNPC2Sound.wav"));
                                words[0] = "";
                            }
                            if (words[0].equalsIgnoreCase("N3")) {
                                MusicPlayer.play(AudioPlayer.loadSound("resources//sounds//dialogueNPC3Sound.wav"));
                                words[0] = "";
                            }

                                for (int i = 0; i < words.length; i++) {
                                    System.out.print(words[i] + " ");
                                    cf.Sleep(200);
                                }
                            MusicPlayer.stop();
                            System.out.println();

                        }
                    }
            }catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            catch (IOException e){
                e.printStackTrace();
            }

            System.out.println();
        } catch (NullPointerException e) {
            return "your mind: ,,it looks like there's nobody i can talk to''";
        }
        /*MusicPlayer.stop();*/

        return finalMesg;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
