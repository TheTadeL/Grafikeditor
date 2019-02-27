import figuren.Figur;
import figuren.Linie;
import figuren.Rechteck;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verf�gung, in welchem
 * Figur-Objekte dargestellt werden k�nnen.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Display extends JFrame {
  /** Die Liste der dargestellten Figur-Objekte */
  private List<Figur> figuren = new ArrayList<Figur>();

  /**
   * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
   * JFrame-Objekt, auf welchem die figuren gezeichnet werden.
   */
  public Display() {
    Dimension windowSize = new Dimension(800, 600);
    setSize(windowSize);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int windowPositionX = (screenSize.width - windowSize.width) / 2;
    int windowPositionY = (screenSize.height - windowSize.height) / 2;
    Point windowPosition = new Point(windowPositionX, windowPositionY);
    setLocation(windowPosition);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    createAndAddDrawingPanel();
    setVisible(true);
  }

  private void createAndAddDrawingPanel() {
    // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
    // Siehe Java-Grundkurs Abschnitt 3.9
    add(new JPanel() {
      // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
      // Methode beim Dsiplay aufruft.
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        zeichneFiguren(g);
      }
    });
  }

  /**
   * Zeichnet alle figuren.
   * @param g Referenz auf das Graphics-Objekt zum zeichnen.
   */
  private void zeichneFiguren(Graphics g) {
    Graphics2D g2d = (Graphics2D)g;
    for (Figur f : figuren) {
      // Farbe zurücksetzen
      g2d.setColor(Figur.STANDARD_LINIENFARBE);

      // Rechteck
      if (f instanceof Rechteck) {
        Rechteck r = (Rechteck)f;
        if(r.istGefuellt()) {
          g2d.setColor(r.getFuellung());
          g2d.fillRect(r.getPosX(), r.getPosY(), r.getBreite(), r.getHoehe());
        }
        g2d.setColor(r.getLinienFarbe());
        g2d.drawRect(r.getPosX(), r.getPosY(), r.getBreite(), r.getHoehe());
      }

      // Kreis
      if(f instanceof Kreis){
        Kreis k = (Kreis)f;
        if(k.istGefuellt()){
          g2d.setColor(k.getFuellung());
          g2d.fillOval(k.getPosX(), k.getPosY(), k.getRadius(), k.getRadius());
        }
        g2d.setColor(k.getLinienFarbe());
        g2d.drawOval(k.getPosX(), k.getPosY(), k.getRadius(), k.getRadius());
      }

      // Linie
      if(f instanceof Linie){
        Linie l = (Linie)f;
        g2d.setColor(l.getLinienFarbe());
        g2d.drawLine(l.getPosX(), l.getPosY(), l.getEndPosX(), l.getEndPosY());
      }

      // Text


      // Bogen


      // Ellipse

    }
  }

  /**
   * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
   * @param figur Referenz auf das weitere Figur-Objekt.
   */
  public void hinzufuegen(Figur figur) {
    figuren.add(figur);
    repaint();
  }

  /**
   * L�scht alle figuren und l�st die Auffrischung des Fensterinhaltes aus.
   */
  public void allesLoeschen() {
    figuren.clear();
    repaint();
  }
}
