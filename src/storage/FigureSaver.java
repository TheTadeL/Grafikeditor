package storage;

import figuren.Figure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FigureSaver {
    BufferedWriter writer;

    public FigureSaver(String filePath) {
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
        } catch (IOException exception) {
            System.out.println("Ein Problem ist aufgetreten: " + exception.getMessage());
        }
    }

    public void save(Figure figure){
        writeToFile(figure.serialize());
    }

    public void close(){
        try {
            writer.close();
        } catch (IOException exception) {
            System.out.println("Ein Problem ist aufgetreten: " + exception.getMessage());
        }
    }

    private boolean writeToFile(String content){
        try {
            writer.append(content+"\n");
            return true;
        } catch (IOException exception) {
            System.out.println("Ein Problem ist aufgetreten: " + exception.getMessage());
            return false;
        }
    }
}
