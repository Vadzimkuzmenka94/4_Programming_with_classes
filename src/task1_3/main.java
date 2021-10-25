package task1_3;

public class main {
    public static void main(String[] args) {
        int n = 4;
        students student[] = new students[n];
        student[0] = new students("Ivanov", "I.I.", "1", new int[]{2, 3, 3, 5, 5});
        student[1] = new students("Petrov", "P.P.", "2", new int[]{9, 10, 10, 10, 10});
        student[2] = new students("Sidorov", "S.S.", "2", new int[]{9, 10, 10, 10, 10});
        student[3] = new students("Smirnov", "S.S.", "1", new int[]{1, 2, 5, 10, 10});
        System.out.println("все студенты: ");
        for (int i = 0; i < 4; ++i) {
            student[i].print(); // выводим на экран всех студентов
        }
        System.out.println("хорошие студенты: "); //
        for (int i = 0; i < 3; ++i) {
            if (student[i].isGood()) // Только если студент хороший, выводим на экран
                student[i].print();
        }
    }
}