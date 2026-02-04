package Commands;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import Util.CompFunc;


public class HintCommand implements Command{

    ArrayList<String> hints = new ArrayList<>();
    CompFunc cf = new CompFunc();
    Random rd = new Random();

    @Override
    public String execute(String[] args) {



        try(BufferedReader br = new BufferedReader(new FileReader("resources//hints.txt"))) {
            String text = null;

            while ((text = br.readLine()) != null) {
                    hints.add(text);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        int random = rd.nextInt(hints.size());

        return hints.get(random);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
