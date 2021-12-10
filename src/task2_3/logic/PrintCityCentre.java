package task2_3.logic;

import task2_3.entity.Country;

public class PrintCityCentre {
    public void CityCentrePrint(Country country) {
        int i;
        for (i = 0; i < country.getCityArrayList().size(); i++)
            if (country.getCityArrayList().get(i).isRegionCentre() == true) {

                System.out.println("Областной центр -->>" + country.getCityArrayList().get(i));
            }
    }
}



