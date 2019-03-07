package figuren;

import java.awt.*;

public class Linie extends Figur {
    private int endPosX;
    private int endPosY;

    public Linie(int posX, int posY, int endPosX, int endPosY){
        super(posX, posY, null);
        this.endPosX = endPosX;
        this.endPosY = endPosY;
    }

    public Linie(int posX, int posY, int endPosX, int endPosY, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.endPosX = endPosX;
        this.endPosY = endPosY;
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(linienFarbe);
        g.drawLine(posX, posY, endPosX, endPosY);
    }

    public int getEndPosX() {
        return endPosX;
    }
    public void setEndPosX(int endPosX) {
        this.endPosX = endPosX;
    }
    public int getEndPosY() {
        return endPosY;
    }
    public void setEndPosY(int endPosY) {
        this.endPosY = endPosY;
    }
}
