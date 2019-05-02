import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Display extends JPanel {
  private Drawing drawing;

  public Display() {
    setPreferredSize(new Dimension(800, 600));
    setVisible(true);

    this.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        setBackground(Color.blue);
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseExited(MouseEvent e) {

      }
    });
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (drawing != null)
      drawing.drawFigures(g);
  }

  public void setDrawing(Drawing drawing){
    this.drawing = drawing;
    repaint();
  }
}
