package figures;

import java.util.Objects;

public class Triangle extends Figure {

    public Triangle(String name, double sideLength, double height) {
        super(name, sideLength, height);
    }

    public Triangle() {
        super(null, 0, 0);
    }

 
    @Override
    public void calculateSquare(Figure figure) {
        if (Objects.isNull(figure)) {
         throw new NullPointerException();
        }
        double square =0.5*figure.getSideLength()*figure.getHeight();
        System.out.println("Square :" + square);
        
    }    
    
}
