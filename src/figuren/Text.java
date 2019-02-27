package figuren;

import java.awt.*;

public class Text extends Figur {
    private String text;

    public Text(int posX, int posY, String text){
        super(posX, posY, null);
        this.text = text;
    }

    public Text(int posX, int posY, String text, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
