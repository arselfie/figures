package figures;

import java.util.Objects;


abstract class Figure implements Calculatable{
    
    String name;
    double sideLength;
    double height;

    public Figure(String name, double sideLength, double height) {
        this.name = name;
        this.sideLength = sideLength;
        this.height = height;
    }

    public Figure() {
    }
    

    public String getName() {
        return name;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void calculateSquare(Figure figure) {
        if (Objects.isNull(figure)) {
         throw new NullPointerException();
        }
    }

    
    
    

   

    
   
    
  
    
   
      
    
    
    
}
