package task1_5;

public class main {
    public static void main(String[] args) {
        Counter a = new Counter(10, 4,6); // корректные числа
        Counter b = new Counter(3, 7,2); // некоректные цифры которые преобразуются
        // в корректные программой

        System.out.println("a=" + a.value()); // возвращает текущее значение
        System.out.println("b=" + b.value()); // возвращает текущее значение
        System.out.println("_________________");
        for (int i = 0; i < 1; i++) {
            a.increment();
            b.increment();
        }
        System.out.println("a="+ a.value()); // // возвращает текущее значение после инкримента
        System.out.println("b=" + b.value()); // возвращает текущее значение после инкримента
        System.out.println("____________");
        for (int i = 0; i < 1; i++) {
            a.decrement();
            b.decrement();
        }
        System.out.println("a=" + a.value()); // возвращает текущее значение после декремента
        System.out.println("b=" + b.value());// возвращает текущее значение после декремента
    }
}
