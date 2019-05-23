import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame {
  private EditorControl editorControl = new EditorControl();
  
  public EditorFrame(int width, int height) {
    setupEditorPanel(width, height - (height/8));
    setupToolboxPanel(width, height/8);
    centerWindow(width, height);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setFocusable(true);
    setVisible(true);
    setLayout(new BorderLayout());

//    this.addKeyListener(new KeyAdapter() {
//      @Override
//      public void keyTyped(KeyEvent e) {
//        editorControl.setFigurTyp(e.getKeyChar());
//      }
//    });
  }

  private void setupEditorPanel(int width, int height) {
    JPanel panel = new EditorPanel(editorControl);
    panel.setPreferredSize(new Dimension(width, height));
    this.add(panel, BorderLayout.CENTER);
  }

  private void setupToolboxPanel(int width, int height) {
    JPanel panel = new Toolbox(editorControl);
    panel.setPreferredSize(new Dimension(width, height));
    this.add(panel, BorderLayout.NORTH);
  }

  private void centerWindow(int width, int height) {
    Dimension windowDimensions = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle fensterAusschnitt = new Rectangle();
    fensterAusschnitt.width = width;
    fensterAusschnitt.height = height;
    fensterAusschnitt.x = (windowDimensions.width - fensterAusschnitt.width) / 2;
    fensterAusschnitt.y = (windowDimensions.height - fensterAusschnitt.height) / 2;
    setBounds(fensterAusschnitt);
  }
}
