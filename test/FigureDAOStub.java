public class FigureDAOStub implements storage.FigureDAO {
    private String[] testData = {
            "Rechteck 100 200 30 40",
            "Rechteck 10 100 350 70",
            "Linie 20 400 30 740",
            "Linie 400 500 350 740",
            "Kreis 10 50 70",
    };
    private int counter = 0;

    @Override
    public String[] readNextFigurData() {
        if(this.counter < this.testData.length) {
            String[] result = this.testData[counter].split("\\s");
            this.counter++;
            return result;
        }
        return null;
    }
}
