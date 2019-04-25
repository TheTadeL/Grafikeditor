package figuren;

import java.awt.*;

public interface IFillable {
    static final Color DEFAULT_FILL_COLOR = Color.WHITE;
    public void setFillColor(Color fillColor);
    public Color getFillColor();
    public void setFilled(boolean filled);
    public boolean isFilled();
}
