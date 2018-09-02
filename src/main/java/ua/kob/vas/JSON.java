package ua.kob.vas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JSON {
    public static Card cardFromJson(String path) {
        try (FileReader fileReader = new FileReader(new File(path))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.fromJson(fileReader, Card.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
