import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        Dimension windowSize = new Dimension(800, 650);
        setPreferredSize(windowSize);
        setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowPositionX = (screenSize.width - windowSize.width) / 2;
        int windowPositionY = (screenSize.height - windowSize.height) / 2;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Point windowPosition = new Point(windowPositionX, windowPositionY);
        setLocation(windowPosition);
        setBackground(Color.RED);
        setLayout(new BorderLayout());
        setVisible(true);
    }
}
