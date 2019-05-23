import figuren.*;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

final class EditorControl {
  private Drawing drawing = new Drawing(new ArrayList<>());
  private char figurTyp = 'r';
  private Point firstPoint;
  private char[] possibleTypes = {'r', 'c', 'l', 'o'};

  public void allesNeuZeichnen(Graphics g) {
    drawing.drawFigures(g);
  }

  public void setFigurTyp(char figureType) {
    for(char c : this.possibleTypes){
      if(c == figureType){
        this.figurTyp = figureType;
        return;
      }
    }
  }

  public void setErsterPunkt(Point firstPoint) {
    this.firstPoint = firstPoint;
  }

  public void erzeugeFigurMitZweitemPunkt(Point secondPoint) {
    Figure f = null;
    switch (figurTyp){
      case 'r':
        f = new Rectangle(
                Math.min(firstPoint.x, secondPoint.x),
                Math.min(firstPoint.y, secondPoint.y),
                Math.abs(secondPoint.x - firstPoint.x),
                Math.abs(secondPoint.y - firstPoint.y)
        );
        break;
      case 'c':
        f = new Circle(
                Math.min(firstPoint.x, secondPoint.x),
                Math.min(firstPoint.y, secondPoint.y),
                Math.max(Math.abs(secondPoint.x - firstPoint.x), Math.abs(secondPoint.y - firstPoint.y))/2
        );
        break;
      case 'o':
        f = new Oval(
                Math.min(firstPoint.x, secondPoint.x),
                Math.min(firstPoint.y, secondPoint.y),
                Math.abs(secondPoint.x - firstPoint.x)/2,
                Math.abs(secondPoint.y - firstPoint.y)/2
        );
        break;
      case 'l':
        f = new Line(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
        break;
    }
    this.drawing.add(f);
  }
}
