package figuren;

import java.awt.*;

public class Ellipse extends Figur implements IFuellbar {
    private Color fuellung;
    private boolean istGefuellt;

    public Ellipse(int posX, int posY){
        super(posX, posY, null);
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
