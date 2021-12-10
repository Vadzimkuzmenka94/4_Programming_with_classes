package task2_3.logic;

import task2_3.entity.Country;

public class AmountRegions {
    public void RegionAmount (Country country) {
        int i;
        for (i = 0; i <= country.getRegionArrayList().size()-1; i++);
        System.out.println("количество областей -" + i);
    }

}
