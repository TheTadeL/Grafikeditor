import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verf�gung, in welchem
 * Figure-Objekte dargestellt werden k�nnen.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Display extends JPanel {
  /** Die Liste der dargestellten Figure-Objekte */
  private Drawing drawing;

  /**
   * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
   * JFrame-Objekt, auf welchem die figuren gezeichnet werden.
   */
  public Display() {
    setPreferredSize(new Dimension(800, 600));
    setVisible(true);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if(drawing != null)
      drawing.drawFigures(g);
  }

//  public void drawFigures(Graphics g){
//    this.drawing.drawFigures(g);
//    repaint();
//  }

  public void setDrawing(Drawing drawing){
    this.drawing = drawing;
    repaint();
  }
}
