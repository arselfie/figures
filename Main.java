package figures;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle("triangle", 10, 5);

        triangle.calculateSquare(triangle);

        Parallelogram parallelogram = new Parallelogram("parallelogram", 10, 5);

        parallelogram.calculateSquare(parallelogram);

        Romb romb = new Romb("romb", 10, 15);

        romb.calculateSquare(romb);

        
        
        
        // как написать тест для войд методов?
        // как избегать дурацкой конструкции в майне triangle.calculateSquare(triangle),
        // parallelogram.calculateSquare(parallelogram), romb.calculateSquare(romb);
        //как добавить дефолтный метод и его реализацию
    }

}
