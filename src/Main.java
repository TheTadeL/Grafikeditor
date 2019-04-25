import figuren.*;
import figuren.Rectangle;
import storage.FigureLoader;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Display mainDisplay = new Display();
    private static MainWindow mainWindow = new MainWindow();
    private static Toolbox toolBox = new Toolbox();

    public static void main(String[] args) {
        mainWindow.add(toolBox, BorderLayout.NORTH);
        mainWindow.add(mainDisplay, BorderLayout.CENTER);
        mainWindow.pack();

        List<Figure> figures = new ArrayList<Figure>();
//        //Rechtecke
//        Rectangle r1 = new Rectangle(150, 100, 50, 30);
//        figures.add(r1);
//
//        //Kreise
//        Circle k1 = new Circle(150, 125, 75);
//        k1.setFillColor(Color.blue);
//        Circle k2 = new Circle(450, 125, 75 , Color.red);
//        k2.setFillColor(Color.blue);
//        figures.add(k1);
//        figures.add(k2);
//
//        //Linien
//        Line l1 = new Line(600, 450, 550, 500);
//        figures.add(l1);
//
//        //Text
//        Text t1 = new Text(700, 150, "Hello World!", Color.magenta);
//        figures.add(t1);
//
//        //Arc
//        Arc b1 = new Arc(150, 250, 300, 200, 180, 180);
//        figures.add(b1);
//
//        //Oval
//        Oval e1 = new Oval(300, 250, 25, 50);
//        e1.setFillColor(Color.RED);
//        figures.add(e1);
//
//        Drawing drawing = new Drawing(figures);
//        drawing.save();
//
//        //Oval
//        Oval e2 = new Oval(400, 350, 25, 50);
//        e2.setFillColor(Color.GREEN);
//        drawing.add(e2);
//        drawing.save();
//
//        mainDisplay.setDrawing(drawing);

        FigureLoader figureLoader = new FigureLoader("./figures.txt");
        Drawing drawing = new Drawing(figureLoader.load());
        mainDisplay.setDrawing(drawing);
    }
}
