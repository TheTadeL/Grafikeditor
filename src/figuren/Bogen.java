package figuren;

import java.awt.*;

public class Bogen extends Figur {
    private int startWinkel;
    private int bogenWinkel;
    private int breite;
    private int hoehe;

    public Bogen(int posX, int posY, int breite, int hoehe, int startWinkel, int bogenWinkel){
        super(posX, posY, null);
        this.breite = breite;
        this.hoehe = hoehe;
        this.startWinkel = startWinkel;
        this.bogenWinkel = bogenWinkel;
    }

    public Bogen(int posX, int posY, int breite, int hoehe, int startWinkel, int bogenWinkel, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.breite = breite;
        this.hoehe = hoehe;
        this.startWinkel = startWinkel;
        this.bogenWinkel = bogenWinkel;
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(linienFarbe);
        g.drawArc(posX, posY, breite, hoehe, startWinkel, bogenWinkel);
    }

    public int getBreite() {
        return breite;
    }
    public void setBreite(int breite) {
        this.breite = breite;
    }
    public int getHoehe() {
        return hoehe;
    }
    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
    public int getStartWinkel() {
        return startWinkel;
    }
    public void setStartWinkel(int startWinkel) {
        this.startWinkel = startWinkel;
    }
    public int getBogenWinkel() {
        return bogenWinkel;
    }
    public void setBogenWinkel(int bogenWinkel) {
        this.bogenWinkel = bogenWinkel;
    }
}
