package task2_3.logic;

import task2_3.entity.Country;

public class PrintSquare {
    public void SquarePrint (Country country) {
        int i;
        int squareCountry = 0;
        for (i=0; i < country.getCityArrayList().size(); i++) {
        squareCountry += country.getRegionArrayList().get(i).getSquare();
        }
        System.out.println("Общая площадь Беларуси равна " + squareCountry + " квадратных километров");
    }
}
