import figuren.Figur;

import java.awt.*;

public class Zeichnung {
    private Figur[] figuren;

    public void zeichneFiguren(Graphics g){
        for(Figur f : figuren){
            f.zeichne(g);
        }
    }

    public void move(int dx, int dy){

    }
}
