package figuren;

import com.sun.istack.internal.Nullable;

import java.awt.*;

public abstract class Figur {
    public static final Color STANDARD_LINIENFARBE = Color.BLACK;
    protected int posX;
    protected int posY;
    protected Color linienFarbe;

    public Figur(int posX, int posY, @Nullable Color linienFarbe){
        this.posX = posX;
        this.posY = posY;
        this.linienFarbe = linienFarbe != null ? linienFarbe : STANDARD_LINIENFARBE;
    }

    public abstract void zeichne(Graphics2D g);

    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public Color getLinienFarbe() {
        return linienFarbe;
    }
    public void setLinienFarbe(Color linienFarbe) {
        this.linienFarbe = linienFarbe;
    }
}
