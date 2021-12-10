package task2_4.Service;

import task2_4.entity.Person;

public class SumBillPositive {
    public void sumPositiveBills(Person person) {
        int sum = 0;
        int y;
        for (y = 0; y < person.getBillList().size(); y++) {
            if (person.getBillList().get(y).getAmount() > 0 && person.getBillList().get(y).isCondition() == true) {
                sum += person.getBillList().get(y).getAmount();
            }
        }
        System.out.println("сумма по положительным (за исключением заблокированных) счетам равна = " + sum);
    }
}
