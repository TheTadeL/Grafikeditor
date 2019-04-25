import figuren.Figure;
import storage.FigureLoader;
import storage.FigureSaver;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Figure> figures = new ArrayList<>();


    public Drawing(List<Figure> figures){
        this.figures = figures;
    }

    public void drawFigures(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (Figure f : figures) {
            g2d.setColor(Figure.DEFAULT_LINE_COLOR);
            f.draw(g2d);
        }
    }

    public void add(Figure figure){
        this.figures.add(figure);
    }

    public void save() {
        FigureSaver saver = new FigureSaver("./figures.txt");
        for(Figure figure : figures) {
            saver.save(figure);
        }
        saver.close();
    }

    public void load() {
        FigureLoader loader = new FigureLoader("./figures.txt");
        figures = loader.load();
    }

    public void clear(){
        this.figures.clear();
    }
}
