//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

package task1_6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Time time = new Time(2, 30, 59);
        System.out.println(time);
        time.setTime();
        System.out.println(time);
        time.addTime();
        System.out.println(time);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. Установка часов" + "\n" +
                            "2. Установка минут" + "\n" +
                            "3. Установка секунд" + "\n" +
                            "4. Показать время" + "\n" +
                            "5. выход" + "\n"
            );
            int choice = scanner.nextInt();
            if (choice == 5)
                break;
            if (choice < 1 || choice > 5) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    time.setHour();
                    System.out.println(time);
                    break;
                case 2:
                    time.setMinute();
                    System.out.println(time);
                    break;
                case 3:
                    time.setSecond();
                    System.out.println(time);
                    break;
                case 4:
                    System.out.println(time);
                    break;
                case 5:
                    break;
            }
        }
    }
}