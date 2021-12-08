package task1_8;



import java.util.Comparator;

public class Customer {
        int id;
        String surname, name, patronymic, adress, numbercard, numberaccount;

    public static class BySurnnameComparator implements Comparator<Customer> {
            @Override
            public int compare(Customer left, Customer right) {
                if (left.surname == right.surname)
                    return left.name.compareTo(right.name);
                return left.surname.compareTo(right.surname);
            }
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", patronymic='" + patronymic + '\'' +
                    ", adress='" + adress + '\'' +
                    ", numbercard='" + numbercard + '\'' +
                    ", numberaccount='" + numberaccount + '\'' +
                    '}';
        }

        public Customer(int id, String surname, String name, String patronymic, String adress, String numbercard, String numberaccount) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.adress = adress;
            this.numbercard = numbercard;
            this.numberaccount = numberaccount;
        }
    }


