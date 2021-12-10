package task2_4.Service;

import task2_4.entity.Bill;
import task2_4.entity.Person;

public class BlockBill {
    public void blockPersonBill (Bill bill, Bill bill1) {
        bill1.setCondition(false);
        bill.setCondition(false);
    }
}
