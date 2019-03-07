package figuren;

import figuren.Figur;
import figuren.IFuellbar;

import java.awt.*;

public class Kreis extends Figur implements IFuellbar {
    private boolean istGefuellt;
    private Color fuellung;
    private int radius;

    public Kreis(int posX, int posY, int radius){
        super(posX, posY, null);
        this.radius = radius;
    }

    public Kreis(int posX, int posY, int radius, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.radius = radius;
    }

    @Override
    public void zeichne(Graphics g) {

    }

    @Override
    public void setFuellung(Color fuellung) {
        this.istGefuellt = fuellung != null;
        this.fuellung = fuellung != null ? fuellung : IFuellbar.STANDARD_FUELLUNG;
    }
    @Override
    public Color getFuellung() {
        return fuellung;
    }
    @Override
    public void setIstGefuellt(boolean istGefuellt) {
        this.istGefuellt = istGefuellt;
    }
    @Override
    public boolean istGefuellt() {
        return istGefuellt;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public int getPosX() {
        return super.getPosX() - radius;
    }
    @Override
    public int getPosY() {
        return super.getPosY() - radius;
    }
}
