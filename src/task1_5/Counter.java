package task1_5;

public class Counter {
    private int minCount; // задаем два счётчика
    private int maxCount;
    private int min, max, current; // задаем минимальное, максимальное и текущее значение

    public Counter (int maxCount, int minCount, int currentCount) { // создаем метод счётчик
        min = minCount;
        max = maxCount;
        current = currentCount; // приравниваем текущее значение к текущему счетчику
        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        if (current < min) // если текущее значение меньше минимального - делаем его равным минимальному
            current = min;
        if (current > max) // если текущее значение больше максимального - делаем его равным максимальному
            current = max;
    }

    public Counter (int minCount, int maxCount) { // создаем конструктор с параметрами
        this.minCount = minCount;
        this.maxCount = maxCount;
        current = min;
    }

    public Counter () { // значения по умолчанию
        this (3, 1,2);
    }
    public void increment () {
        current++; // Добавляем единицу
        if (current > max) // если текущее значение больше максимального - делаем его минимальным
            current = min;
    }
    public void decrement () {
        current--; // убирает единицу
        if (current < min)
            current = max; // но если текущее значение меньше минимального - то значение становится максимальным
    }
    public int value () { // возвращает текущее значение
        return current;
    }
}
