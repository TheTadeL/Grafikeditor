package figuren;

import java.awt.*;

public class Text extends Figure {
    private String text;

    public Text(int posX, int posY, String text){
        super(posX, posY, null);
        this.text = text;
    }

    public Text(int posX, int posY, String text, Color linienFarbe){
        super(posX, posY, linienFarbe);
        this.text = text;
    }

    @Override
    public String serialize() {
        return String.format("Text;%d;%d;%s", posX, posY, text);
    }

    @Override
    public Figure deSerialize(String figureData) {
        String[] data = figureData.split(";");
        return new Text(Integer.valueOf(data[1]), Integer.valueOf(data[2]), data[3]);
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return prefix.equals("Text");
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(lineColor);
        g.drawString(text, posX, posY);
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
