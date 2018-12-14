package figures;

import java.util.Objects;

public class Parallelogram extends Figure {

    public Parallelogram(String name, double sideLength, double height) {
        super(name, sideLength, height);
    }

    @Override
    public void calculateSquare() {
        
        double square = getSideLength() * getHeight();
        System.out.println(square);
    }

}
