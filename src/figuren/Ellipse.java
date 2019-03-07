package figuren;

import java.awt.*;

public class Ellipse extends Figur implements IFuellbar {
    private Color fuellung;
    private boolean istGefuellt;
    private int radiusHoehe;
    private int radiusBreite;

    public Ellipse(int posX, int posY, int radiusBreite, int radiusHoehe){
        super(posX, posY, null);
        this.radiusBreite = radiusBreite;
        this.radiusHoehe = radiusHoehe;
    }

    public Ellipse(int posX, int posY, int radiusBreite, int radiusHoehe, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.radiusBreite = radiusBreite;
        this.radiusHoehe = radiusHoehe;
    }

    @Override
    public void setFuellung(Color fuellung) {
        this.istGefuellt = fuellung != null;
        this.fuellung = fuellung != null ? fuellung : IFuellbar.STANDARD_FUELLUNG;
    }

    @Override
    public void zeichne(Graphics g) {

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
    @Override
    public int getPosX() {
        return super.getPosX() - radiusBreite;
    }
    @Override
    public int getPosY() {
        return super.getPosY() - radiusHoehe;
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
