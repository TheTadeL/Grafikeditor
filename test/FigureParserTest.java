import figuren.Circle;
import figuren.Figure;
import figuren.Line;
import figuren.Rectangle;
import org.junit.Test;
import org.junit.Before;
import storage.FigureDAO;
import storage.FigureFileDAO;
import storage.FigureParser;
import static org.junit.Assert.*;

import java.awt.*;
import java.util.List;

public class FigureParserTest {
    private FigureDAO dao;
    private FigureParser figureParser;

    @Before
    public void setup() {
        this.dao = new FigureDAOStub(); // Stub-Klasse
        this.figureParser = new FigureParser(dao);
    }

    @Test
    public void testParseFunction() {
        List<Figure> figures = figureParser.parse();
        assertEquals(5, figures.size());
        assertTrue(figures.get(0) instanceof Rectangle);
        assertTrue(figures.get(2) instanceof Line);
        assertTrue(figures.get(4) instanceof Circle);
    }

    @Test
    public void testDrawCircle() {
        GraphicsStub g = new GraphicsStub();
        Circle c = new Circle(10, 10, 100);
        c.draw(g);
        assertEquals(1, g.callCount);
        assertEquals(c.getRadius(), g.width / 2); //Radius ist die Hälfte der Breite und der Höhe
        assertEquals(c.getRadius(), g.height / 2);
        // Bei drawOval wird die Breite und Höhe angegeben. Deshalb muss hier anders überprüft werden,
        // ob diese Werte auch stimmen:
        assertEquals(c.getPosX(), g.x + g.width/2);
        assertEquals(c.getPosY(), g.x + g.height/2);
    }
}