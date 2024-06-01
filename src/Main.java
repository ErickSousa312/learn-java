
import entities.BusinessAccount;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String [] lines = new String[] {"good morning", "good afternoon", "good night"};

        String path= "C:/Users/erik-pc/IdeaProjects/learn-java/src/out.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}