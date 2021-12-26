package task1_1;
//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class main {
    public static void main(String[] args) {
        rectang Rectang = new rectang();
        Rectang.setFirstside(25);
        Rectang.setSecondside(44);
        Rectang.SumSides();
        Rectang.MaxSides();
        Rectang.ShowSides();
    }
}
