package figures;

public class Romb extends Figure {

    public Romb(String name, double sideLength, double height) {
        super(name, sideLength, height);
    }

    @Override
    public void calculateSquare() {
        
        double square = getSideLength() * getHeight();
        System.out.println(square);
    }

}
