package storage;

import figuren.Circle;
import figuren.Figure;
import figuren.Line;
import figuren.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class FigureParser {
  // Es reicht zu sagen, dass dao eine Klasse ist, welche das Interface FigureDAO implementiert
  private FigureDAO dao;

  public FigureParser(FigureDAO dao) {
    this.dao = dao;
  }

  public List<Figure> parse() {
    List<Figure> figuren = new ArrayList<>();
    String[] figurData = dao.readNextFigurData();
    while (figurData != null) {
      String figurTyp = figurData[0];
      int x = Integer.valueOf(figurData[1]);
      int y = Integer.valueOf(figurData[2]);
      switch (figurTyp) {
      case "Rechteck":
        int breite = Integer.valueOf(figurData[3]);
        int hoehe = Integer.valueOf(figurData[4]);
        figuren.add(new Rectangle(x, y, breite, hoehe));
        break;
      case "Kreis":
        int radius = Integer.valueOf(figurData[3]);
        figuren.add(new Circle(x, y, radius));
        break;
      case "Linie":
        int endx = Integer.valueOf(figurData[3]);
        int endy = Integer.valueOf(figurData[4]);
        figuren.add(new Line(x, y, endx, endy));
        break;
      }
      figurData = dao.readNextFigurData();
    }
    return figuren;
  }
}
