package task1_2;
/*//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
        класса*/
public class test2 {
    public static void main(String[] args) {
        Student student = new Student("Вася", 2);
        Student student1 = new Student("Дима", 3);
        Employee employee = new Employee();
    }
}

class Employee {
    public Employee() {
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}