package Util;

//Class from older projects

import Audio.AudioPlayer;
import Audio.MusicPlayer;

public class CompFunc {

    private int duration;
    private int amount;

    /**
     * Method for more code compact Thread.sleep()
     * @param duration amount of miliseconds for sleep()
     */
    public void Sleep(int duration) {
        this.duration = duration;

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Method for more code compact console spacing line
     * @param amount amount of how much lines it will skip
     */
    public void Line(int amount){
        this.amount = amount;

        for (int i = 0; i <= amount-1; i++) {
            System.out.println();
        }
    }

    public void Sound(String input) {
        MusicPlayer.play(AudioPlayer.loadSound(input));

    }
}

