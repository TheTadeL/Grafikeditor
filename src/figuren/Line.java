package figuren;

import java.awt.*;

public class Line extends Figure {
    private int endPosX;
    private int endPosY;

    public Line(int posX, int posY, int endPosX, int endPosY){
        super(posX, posY, null);
        this.endPosX = endPosX;
        this.endPosY = endPosY;
    }

    public Line(int posX, int posY, int endPosX, int endPosY, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.endPosX = endPosX;
        this.endPosY = endPosY;
    }

    @Override
    public String serialize() {
        return String.format("Line;%d;%d;%d;%d", posX, posY, endPosX, endPosY);
    }

    @Override
    public Figure deSerialize(String figureData) {
        String[] data = figureData.split(";");
        return new Line(Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]), Integer.valueOf(data[4]));
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return prefix.equals("Line");
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(lineColor);
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
