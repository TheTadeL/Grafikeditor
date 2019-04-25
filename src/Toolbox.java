import javax.swing.*;
import java.awt.*;

public class Toolbox extends JPanel {
    public Toolbox() {
        Button arcBtn = new Button("(");
        Button circleBtn = new Button("o");
        Button lineBtn = new Button("\\");
        Button ovalBtn = new Button("0");
        Button rectangleBtn = new Button("[]");
        Button textBtn = new Button("T");

        this.add(arcBtn);
        this.add(circleBtn);
        this.add(lineBtn);
        this.add(ovalBtn);
        this.add(rectangleBtn);
        this.add(textBtn);

        setPreferredSize(new Dimension(800, 50));
        setBackground(Color.lightGray);
        setVisible(true);
    }
}
