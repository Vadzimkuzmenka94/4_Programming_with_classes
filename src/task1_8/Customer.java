package task1_8;



import java.util.*;

public class Customer {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String surname;
    private String patronimic;
    private String address;
    private int creditCardId;
    private int bankNumberCard;

    Customer(String name, String surname, String patronimic, String address, int creditCardId, int bankNumberCard) {
        this.name = name;
        this.surname = surname;
        this.patronimic = patronimic;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronimic='" + patronimic + '\'' +
                ", address='" + address + '\'' +
                ", creditCardId=" + creditCardId +
                ", bankNumberCard=" + bankNumberCard +
                '}';
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Customer.idGenerator = idGenerator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(int creditCardId) {
        this.creditCardId = creditCardId;
    }

    public int getBankNumberCard() {
        return bankNumberCard;
    }

    public void setBankNumberCard(int bankNumberCard) {
        this.bankNumberCard = bankNumberCard;
    }
}

