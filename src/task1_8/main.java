package task1_8;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int i = 5;
        Customer customer[] = new Customer[i];
        customer[0] = new Customer(1, "Иванов", "Иван", "Иванович", "Гомель", "1111", "11");
        customer[1] = new Customer(2, "Петров", "Олег", "Иванович", "Минск", "1211", "12");
        customer[2] = new Customer(3, "Сидоров", "Иван", "Иванович", "Москва", "1121", "13");
        customer[3] = new Customer(4, "Сергеев", "Денис", "Иванович", "Добруш", "1112", "14");
        customer[4] = new Customer(5, "Дмитриев", "Дима", "Иванович", "Солигорск", "2111", "15");

        for (i = 0; i < customer.length; i++) {
            System.out.println(customer[i]);
            System.out.println();
    }
        Arrays.sort(customer, new Customer.BySurnnameComparator());
        for (i = 0; i < customer.length; i++) {
            System.out.println("После сортировки" + customer[i]);
}

}
}
