package storage;

import figuren.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FigureLoader {
    private BufferedReader reader;
    private List<Figure> figures = new ArrayList<>();
    private List<Figure> prototypes = new ArrayList<>();

    public FigureLoader(String file){
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("Ein Fehler ist aufgetreten: " + e);
        }

        prototypes.add(new Arc(0, 0, 0, 0, 0, 0));
        prototypes.add(new Circle(0, 0, 0));
        prototypes.add(new Line(0, 0, 0, 0));
        prototypes.add(new Oval(0, 0, 0, 0));
        prototypes.add(new Rectangle(0, 0, 0, 0));
        prototypes.add(new Text(0, 0, ""));
    }

    public List<Figure> load() {
        try {
            String line = reader.readLine();
            while(line != null){
                String prefix = line.split(";")[0];
                for (Figure figure : prototypes) {
                    if(figure.isFigureOfPrefix(prefix)){
                        figures.add(figure.deSerialize(line));
                        break;
                    }
                }
                line = reader.readLine();
            }
            //=================================//
            for(Figure figure : figures){
                System.out.println(figure.toString());
            }
            //=================================//
        } catch (IOException e) {
            System.out.println("Ein Fehler ist aufgetreten: " + e);
        }
        return figures;
    }
}
