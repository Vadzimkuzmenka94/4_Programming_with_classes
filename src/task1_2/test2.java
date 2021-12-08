package task1_2;

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