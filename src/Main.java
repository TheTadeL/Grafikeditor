import figuren.Linie;
import figuren.Rechteck;

import java.awt.*;

public class Main {
    private static Display mainDisplay = new Display();

    public static void main(String[] args) {
        //Rechtecke
        Rechteck r1 = new Rechteck(100, 100, 450, 300);
        mainDisplay.hinzufuegen(r1);

        //Kreise
        Kreis k1 = new Kreis(100, 100, 150);
        k1.setFuellung(Color.blue);
        Kreis k2 = new Kreis(400, 100, 150 , Color.red);
        k2.setFuellung(Color.blue);
        mainDisplay.hinzufuegen(k1);
        mainDisplay.hinzufuegen(k2);

        //Linien
        Linie l1 = new Linie(100, 500, 550, 500);
        mainDisplay.hinzufuegen(l1);
    }
}
