package task1_3;

public class students {
    String surname, inicials, group; // создаем переменные стринговые
    private int grades []; // создаем массив с оценками

    public students(String surname, String inicials, String group, int[] grades) { // создание конструктора
        this.surname = surname;
        this.inicials = inicials;
        this.group = group;
        this.grades = grades;
    }
    boolean isGood() { //определяем хороших студентов, если оценки не равны 9 или 10 то фолс, если равны то тру
        for (int i = 0; i < grades.length; ++i)
            if (grades[i] != 9 && grades[i] != 10)
                return false;
        return true;
    }

    void print() { // выводим на экран фимилию, инициалы, группу и массив оценок
        System.out.print(surname + " " + inicials);
        System.out.print(". Group: " + group + ". Grades: ");
        for (int i = 0; i < grades.length; ++i)
            System.out.print((grades[i]) + " ");
        System.out.print("\n");
    }
}