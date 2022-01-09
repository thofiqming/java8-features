package servian_company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class CreateFile {

    public static void main(String[] args) {

        Path path = Paths.get("fileTest.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("[a-zA-Z].GIF");

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("gifs_"+args[0]), "utf-8"))) {
            try {
                writer.write("something");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
