package figuren;

import java.awt.*;

public class Arc extends Figure {
    public static final String SAVE_PREFIX = "";

    private int startWinkel;
    private int bogenWinkel;
    private int width;
    private int height;

    public Arc(int posX, int posY, int width, int height, int startWinkel, int bogenWinkel){
        super(posX, posY, null);
        this.width = width;
        this.height = height;
        this.startWinkel = startWinkel;
        this.bogenWinkel = bogenWinkel;
    }

    public Arc(int posX, int posY, int width, int height, int startWinkel, int bogenWinkel, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.width = width;
        this.height = height;
        this.startWinkel = startWinkel;
        this.bogenWinkel = bogenWinkel;
    }

    @Override
    public String serialize() {
        return String.format("Arc;%d;%d;%d;%d;%d;%d", posX, posY, width, height, startWinkel, bogenWinkel);
    }

    @Override
    public Figure deSerialize(String figureData) {
        //Todo: Farben speichern/laden können.
        String[] data = figureData.split(";");
        return new Arc(Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]), Integer.valueOf(data[4]), Integer.valueOf(data[5]), Integer.valueOf(data[6]));
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return prefix.equals("Arc");
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(lineColor);
        g.drawArc(posX, posY, width, height, startWinkel, bogenWinkel);
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
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
