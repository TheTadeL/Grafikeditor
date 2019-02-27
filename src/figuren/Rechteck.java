package figuren;


import java.awt.*;

public class Rechteck extends Figur implements IFuellbar {
    private int breite;
    private int hoehe;
    private boolean istGefuellt;
    private Color fuellung;

    public Rechteck(int posX, int posY, int breite, int hoehe){
        super(posX, posY, null);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public Rechteck(int posX, int posY, int breite, int hoehe, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }
    public void setBreite(int breite) {
        this.breite = breite;
    }
    public int getHoehe() {
        return hoehe;
    }
    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
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
}
