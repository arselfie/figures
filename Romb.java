package figures;

public class Romb extends Figure {

    public Romb(String name, double sideLength, double height) {
        super(name, sideLength, height);
    }

    @Override
    public void calculateSquare(Figure figure) {
        double square = figure.sideLength * figure.height;
        System.out.println(square);
    }

}
