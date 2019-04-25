package figuren;


import java.awt.*;

public class Rectangle extends Figure implements IFillable {
    private int width;
    private int height;
    private boolean isFilled;
    private Color fillColor;

    public Rectangle(int posX, int posY, int width, int height){
        super(posX, posY, null);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int posX, int posY, int width, int height, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.width = width;
        this.height = height;
    }

    @Override
    public String serialize() {
        return String.format("Rectangle;%d;%d;%d;%d", posX, posY, width, height);
    }

    @Override
    public Figure deSerialize(String figureData) {
        String[] data = figureData.split(";");
        return new Rectangle(Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]), Integer.valueOf(data[4]));
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return prefix.equals("Rectangle");
    }

    @Override
    public void draw(Graphics2D g) {
        if(isFilled) {
            g.setColor(fillColor);
            g.fillRect(posX, posY, width, height);
        }
        g.setColor(lineColor);
        g.drawRect(posX, posY, width, height);
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
}
