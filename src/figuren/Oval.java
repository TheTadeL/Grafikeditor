package figuren;

import java.awt.*;

//Todo: Farben speichern können
public class Oval extends Figure implements IFillable {
    private Color fuellung;
    private boolean istGefuellt;
    private int radiusHoehe;
    private int radiusBreite;

    public Oval(int posX, int posY, int radiusBreite, int radiusHoehe){
        super(posX, posY, null);
        this.radiusBreite = radiusBreite;
        this.radiusHoehe = radiusHoehe;
    }

    public Oval(int posX, int posY, int radiusBreite, int radiusHoehe, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.radiusBreite = radiusBreite;
        this.radiusHoehe = radiusHoehe;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.istGefuellt = fillColor != null;
        this.fuellung = fillColor != null ? fillColor : IFillable.DEFAULT_FILL_COLOR;
    }

    @Override
    public String serialize() {
        return String.format("Oval;%d;%d;%d;%d", posX, posY, radiusBreite, radiusHoehe);
    }

    @Override
    public Figure deSerialize(String figureData) {
        String[] data = figureData.split(";");
        return new Oval(Integer.valueOf(data[1]), Integer.valueOf(data[2]), Integer.valueOf(data[3]), Integer.valueOf(data[4]));
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return prefix.equals("Oval");
    }

    @SuppressWarnings("Duplicates")
    @Override
    public void draw(Graphics2D g) {
        if(istGefuellt){
            g.setColor(fuellung);
            g.fillOval(posX, posY, radiusBreite, radiusHoehe);
        }
        g.setColor(lineColor);
        g.drawOval(posX - radiusBreite, posY - radiusHoehe, radiusBreite*2, radiusHoehe*2);
        // Radius zeichnen
        g.setColor(Color.RED);
        g.drawLine(posX, posY, posX+radiusBreite, posY);
        //
    }

    @Override
    public Color getFillColor() {
        return fuellung;
    }
    @Override
    public void setFilled(boolean filled) {
        this.istGefuellt = filled;
    }
    @Override
    public boolean isFilled() {
        return istGefuellt;
    }
    public int getRadiusHoehe() {
        return radiusHoehe;
    }
    public void setRadiusHoehe(int radiusHoehe) {
        this.radiusHoehe = radiusHoehe;
    }
    public int getRadiusBreite() {
        return radiusBreite;
    }
    public void setRadiusBreite(int radiusBreite) {
        this.radiusBreite = radiusBreite;
    }
}
