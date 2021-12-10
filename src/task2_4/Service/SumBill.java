package task2_4.Service;

import task2_4.entity.Bill;
import task2_4.entity.Person;

public class SumBill {
    public void sumAllBills (Person person ) {
         int sum = 0;
         int y;
         for (y = 0; y < person.getBillList().size(); y++) {
             if (person.getBillList().get(y).isCondition() == true)
             sum += person.getBillList().get(y).getAmount();
         }
        System.out.println("сумма по всем счетам равна (за исключением заблокированных) = " + sum);
    }

}
