package Commands;

import Audio.AudioPlayer;
import Audio.MusicPlayer;
import Player.Player;
import Util.CompFunc;
import World.RoomManager;
import World.Character;

import java.io.*;

/**
 * One of Command classes, this one takes care of
 * action talk -> starts dialogue if there's character in current room
 */
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

            String dialogueFile = character.getDialogueFile();

            InputStream input = TalkCommand.class.getClassLoader().getResourceAsStream(dialogueFile);
                if(input == null) {
                    throw new RuntimeException("Unable to load file");
                }


            try(BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
                String text = null;


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
                                MusicPlayer.play(AudioPlayer.loadSound("/sounds/dialoguePlayerSound.wav"));
                                for (int i = 0; i < 50; i++) {
                                    System.out.print(" ");
                                }
                            }
                            if (words[0].equalsIgnoreCase("N1")) {
                                MusicPlayer.play(AudioPlayer.loadSound("/sounds/dialogueNPCSound.wav"));
                                words[0] = "";
                            }
                            if (words[0].equalsIgnoreCase("N2")) {
                                MusicPlayer.play(AudioPlayer.loadSound("/sounds/dialogueNPC2Sound.wav"));
                                words[0] = "";
                            }
                            if (words[0].equalsIgnoreCase("N3")) {
                                MusicPlayer.play(AudioPlayer.loadSound("/sounds/dialogueNPC3Sound.wav"));
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
