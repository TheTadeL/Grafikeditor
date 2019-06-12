
public class GraphicsStub extends ConcreteGraphics {
    int callCount = 0;
    int x, y, width, height;

    @Override
    public void drawOval(int x, int y, int width, int height) {
        callCount++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
