import figuren.Figur;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {
    private List<Figur> figuren = new ArrayList<Figur>();

    public Zeichnung(List<Figur> figuren){
        this.figuren = figuren;
    }

    public void zeichneFiguren(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (Figur f : figuren) {
            g2d.setColor(Figur.STANDARD_LINIENFARBE);
            f.zeichne(g2d);
        }
    }

    public void hinzufuegen(Figur figur){
        this.figuren.add(figur);
        //repaint();
    }

    public void allesLoeschen(){
        this.figuren.clear();
    }

    public void move(int dx, int dy){

    }
}
