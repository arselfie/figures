package figures;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle("triangle", 10, 5);

        triangle.calculateSquare();

        Parallelogram parallelogram = new Parallelogram("name", 5, 10);

        parallelogram.calculateSquare();

        // как написать тест для войд методов?  -Использую рулу:
        //в тест методе создаю 
//        @Rule
//        public final SystemOutRule outRule = new SystemOutRule().enableLog();
// а затем уже в тест методе ожидаю в логе увидеть стринг
//String log = outRule.getLog();
//        Assert.assertTrue(log.contains("Square :25.0"));
        // как избегать дурацкой конструкции в майне triangle.calculateSquare(triangle),
        // просто использую геттер(перемножаю геттеры и не передаю в метод ничего)      
        // parallelogram.calculateSquare(parallelogram), romb.calculateSquare(romb);
        //как добавить дефолтный метод и его реализацию
    }

}
