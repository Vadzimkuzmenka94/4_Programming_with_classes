package task1_7;
//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        System.out.println("введите А:");
        a.read(scanner);
        System.out.println("введите Б:");
        b.read(scanner);
        System.out.println("введите Ц:");
        c.read(scanner);
        Triagle triagle = new Triagle(a,b,c);
        System.out.println("Squere:" + triagle.square());
        System.out.println("Perimetr:" + triagle.perimetr());
        System.out.println("median_crossing:");
        triagle.median_crossing().print();
    }
}