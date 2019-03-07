import figuren.*;

import java.awt.*;

public class Main {
    //Todo: SAM sagen dass Radius noch *2 gerrechnet werden muss. ++ getPos vom figuren.Kreis!!!
    private static Display mainDisplay = new Display();

    public static void main(String[] args) {
        //Rechtecke
        Rechteck r1 = new Rechteck(100, 100, 50, 30);
        mainDisplay.hinzufuegen(r1);

        //Kreise
        Kreis k1 = new Kreis(150, 125, 75);
        k1.setFuellung(Color.blue);
        Kreis k2 = new Kreis(450, 125, 75 , Color.red);
        k2.setFuellung(Color.blue);
        mainDisplay.hinzufuegen(k1);
        mainDisplay.hinzufuegen(k2);

        //Linien
        Linie l1 = new Linie(600, 450, 550, 500);
        mainDisplay.hinzufuegen(l1);

        //Text
        Text t1 = new Text(700, 150, "Hello World!", Color.magenta);
        mainDisplay.hinzufuegen(t1);

        //Bogen
        Bogen b1 = new Bogen(150, 250, 300, 200, 180, 180);
        mainDisplay.hinzufuegen(b1);

        //Ellipse
        Ellipse e1 = new Ellipse(300, 250, 25, 50);
        e1.setFuellung(Color.RED);
        mainDisplay.hinzufuegen(e1);
    }
}
