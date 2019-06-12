package figuren;

import java.awt.*;

public class Circle extends Figure implements IFillable {
    private boolean isFilled;
    private Color fillColor;
    private int radius;

    public Circle(int posX, int posY, int radius){
        super(posX, posY, null);
        this.radius = radius;
    }

    public Circle(int posX, int posY, int radius, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.radius = radius;
    }

    @Override
    public String serialize() {
        return String.format("Circle;%d;%d;%d", posX, posY, radius);
    }

    @Override
    public Figure deSerialize(String figureData) {
        String[] data = figureData.split(";");
        return new Circle(Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]));
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return prefix.equals("Circle");
    }

    @SuppressWarnings("Duplicates")
    @Override
    public void draw(Graphics2D g) {
        if(isFilled){
            g.setColor(fillColor);
            g.fillOval(posX, posY, radius, radius);
        }
        g.setColor(lineColor);
        g.drawOval(posX - radius, posY - radius, radius * 2, radius * 2);
        // Radius zeichnen
        g.setColor(Color.GREEN);
        g.drawLine(posX, posY, posX+radius, posY);
        //
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.isFilled = fillColor != null;
        this.fillColor = fillColor != null ? fillColor : IFillable.DEFAULT_FILL_COLOR;
    }
    @Override
    public Color getFillColor() {
        return fillColor;
    }
    @Override
    public void setFilled(boolean filled) {
        this.isFilled = filled;
    }
    @Override
    public boolean isFilled() {
        return isFilled;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
