package figuren;

import com.sun.istack.internal.Nullable;
import java.awt.*;

public abstract class Figure {
    public static final Color DEFAULT_LINE_COLOR = Color.BLACK;
    protected int posX;
    protected int posY;
    protected Color lineColor;

    public Figure(int posX, int posY, @Nullable Color lineColor){
        this.posX = posX;
        this.posY = posY;
        this.lineColor = lineColor != null ? lineColor : DEFAULT_LINE_COLOR;
    }

    public void move(int dx, int dy){
        posX += dx;
        posY += dy;

    }

    public abstract String serialize();
    public abstract Figure deSerialize(String figureData);
    public abstract boolean isFigureOfPrefix(String prefix);

    public abstract void draw(Graphics2D g);

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
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
}
