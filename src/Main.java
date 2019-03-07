import figuren.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //Todo: SAM sagen dass Radius noch *2 gerrechnet werden muss. ++ getPos vom figuren.Kreis!!!
    private static Display mainDisplay = new Display();

    public static void main(String[] args) {
        List<Figur> figuren = new ArrayList<Figur>();
        //Rechtecke
        Rechteck r1 = new Rechteck(100, 100, 50, 30);
        figuren.add(r1);

        //Kreise
        Kreis k1 = new Kreis(150, 125, 75);
        k1.setFuellung(Color.blue);
        Kreis k2 = new Kreis(450, 125, 75 , Color.red);
        k2.setFuellung(Color.blue);
        figuren.add(k1);
        figuren.add(k2);

        //Linien
        Linie l1 = new Linie(600, 450, 550, 500);
        figuren.add(l1);

        //Text
        Text t1 = new Text(700, 150, "Hello World!", Color.magenta);
        figuren.add(t1);

        //Bogen
        Bogen b1 = new Bogen(150, 250, 300, 200, 180, 180);
        figuren.add(b1);

        //Ellipse
        Ellipse e1 = new Ellipse(300, 250, 25, 50);
        e1.setFuellung(Color.RED);
        figuren.add(e1);

        Zeichnung zeichnung = new Zeichnung(figuren);
        mainDisplay.setZeichnung(zeichnung);
    }
}
