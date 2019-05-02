package figuren;

import java.awt.*;

public class Smiley extends Figure {
    private int width;
    private int height;

    private Circle head;
    private Circle leftEye;
    private Circle rightEye;
    private Oval nose;
    private Arc mouth;



    public Smiley(int posX, int posY, int width, int height) {
        super(posX, posY, null);
        this.width = width;
        this.height = height;

        this.head = new Circle(this.posX, this.posY, this.height/2);
        this.leftEye = new Circle((this.posX+this.width/5),(this.posY+this.height/5), this.height/10);
        this.rightEye = new Circle((this.posX+this.width)-(this.width/5+this.height/5),(this.posY+this.height/5), this.height/10);
        this.nose = new Oval(this.posX + this.width/2 - this.width/20, this.posY + this.height/2 - this.height/20, this.width/20, this.height/10);
        this.mouth = new Arc(this.posX + this.width/10, this.posY+this.height-this.height/2, this.width-(this.width/10)*2, this.height/5, 0, -180);
    }

    @Override
    public String serialize() {
        return null;
    }

    @Override
    public Figure deSerialize(String figureData) {
        return null;
    }

    @Override
    public boolean isFigureOfPrefix(String prefix) {
        return false;
    }

    @Override
    public void draw(Graphics2D g) {
        head.draw(g);
        leftEye.draw(g);
        rightEye.draw(g);
        nose.draw(g);
        mouth.draw(g);
    }
}
