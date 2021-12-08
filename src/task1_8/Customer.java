package task1_8;



import java.util.*;

public class Customer {
        int id, numbercard;
        String surname, name, patronymic, adress, numberaccount;


    private ArrayList<Customer> customersList = new ArrayList<>();

    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }

    void getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getNumbercard() >= diapazonStart && c.getNumbercard() <= diapazonEnd) {
                list.add(c);
            }
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumbercard() {
        return numbercard;
    }

    public void setNumbercard(int numbercard) {
        this.numbercard = numbercard;
    }

    public String getNumberaccount() {
        return numberaccount;
    }

    public void setNumberaccount(String numberaccount) {
        this.numberaccount = numberaccount;
    }



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

        public Customer(int id, String surname, String name, String patronymic, String adress, int numbercard, String numberaccount) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.adress = adress;
            this.numbercard = numbercard;
            this.numberaccount = numberaccount;
        }


    }


