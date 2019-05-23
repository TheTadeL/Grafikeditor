import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Toolbox extends JPanel {
    private EditorControl editorControl;
    private List<Button> figureButton = new ArrayList<>();

    public Toolbox(EditorControl editorControl) {
        this.editorControl = editorControl;

        MouseListener listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource() instanceof Button){
                    Button btn = (Button)e.getSource();
                    for(Button b : figureButton){
                        b.setBackground(Color.WHITE);
                    }
                    btn.setBackground(Color.GREEN);
                    setFigureType(btn.getLabel());
                }
            }
        };

        figureButton.add(new Button("Bogen"));
        figureButton.add(new Button("Kreis"));
        figureButton.add(new Button("Linie"));
        figureButton.add(new Button("Oval"));
        figureButton.add(new Button("Rechteck"));
        figureButton.add(new Button("Text"));

        for(Button b : figureButton){
            b.addMouseListener(listener);
            b.setBackground(Color.WHITE);
            this.add(b);
        }

        setPreferredSize(new Dimension(800, 50));
        setBackground(Color.lightGray);
        setVisible(true);
    }

    private void setFigureType(String type){
        switch(type){
            case "Bogen":
                break;
            case "Kreis":
                this.editorControl.setFigurTyp('c');
                break;
            case "Linie":
                this.editorControl.setFigurTyp('l');
                break;
            case "Rechteck":
                this.editorControl.setFigurTyp('r');
                break;
            case "Oval":
                this.editorControl.setFigurTyp('o');
                break;
            case "Text":
                break;
        }
    }
}
