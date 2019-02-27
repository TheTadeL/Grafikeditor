package figuren;

import java.awt.*;

public interface IFuellbar {
    static final Color STANDARD_FUELLUNG = Color.WHITE;
    public void setFuellung(Color fuellung);
    public Color getFuellung();
    public void setIstGefuellt(boolean istGefuellt);
    public boolean istGefuellt();
}
