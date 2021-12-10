package task2_3.logic;

import task2_3.entity.Country;

public class PrintCapital {
    public void CapitalPrint (Country country) {
        int i;
        for (i=0; i < country.getCityArrayList().size(); i++)
        if (country.getCityArrayList().get(i).isCapital() == true) {
            System.out.println(country.getCityArrayList().get(i));
        }
    }
}
