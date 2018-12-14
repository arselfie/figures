package figures;

import java.util.Objects;

public class Parallelogram extends Figure {

    public Parallelogram(String name, double sideLength, double height) {
        super(name, sideLength, height);
    }

    @Override
    public void calculateSquare(Figure figure) {
        if (Objects.isNull(figure)) {
         throw new NullPointerException();
        }
        double square = figure.sideLength * figure.height;
        System.out.println(square);
    }

}
