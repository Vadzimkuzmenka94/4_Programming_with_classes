package task2_3;

import task2_3.entity.City;
import task2_3.entity.Country;
import task2_3.entity.District;
import task2_3.entity.Region;
import task2_3.logic.AmountRegions;
import task2_3.logic.PrintCapital;
import task2_3.logic.PrintCityCentre;
import task2_3.logic.PrintSquare;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList <City> cityArrayList = new ArrayList<>();
        ArrayList <District> districtArrayList = new ArrayList<>();
        ArrayList <Region> regionArrayList = new ArrayList<>();
        City Gomel = new City("Гомель", 500000, false, true);
        City Minsk = new City("Минск", 1500000, true, true);
        City Vitebsk = new City("Витебск", 400000, false, true);
        City Mogilev = new City("Могилев", 450000, false, true);
        City Brest = new City("Брест", 500000, false, true);
        City Grodno = new City("Гродно", 500000, false, true);
        District Gomelski = new District("Гомельский район", 1000000);
        District Miski = new District("Минский район", 1900000);
        District Vitebski = new District("Витебский район", 9000000);
        District Mogilevski = new District("Могилевский район", 8000000);
        District Brestski = new District("Брестский район", 700000);
        District Grodnenski = new District("Гродненский район", 850000);
        Region Gomelskaya = new Region("Гомельская область", 300000, 200000);
        Region Minskaya = new Region("Минская область", 240000, 200000);
        Region Vitebskaya = new Region("Витебская область", 100000, 200000);
        Region Mogilevskaya = new Region("Могилевская область", 190000, 200000);
        Region Brestskaya = new Region("Бресткая область", 200000, 200000);
        Region Grodnenskaya= new Region("Гродненская область", 200000, 200000);


        cityArrayList.add (Gomel);
        cityArrayList.add (Minsk);
        cityArrayList.add (Vitebsk);
        cityArrayList.add (Mogilev);
        cityArrayList.add (Brest);
        cityArrayList.add (Grodno);
        districtArrayList.add (Gomelski);
        districtArrayList.add (Miski);
        districtArrayList.add (Vitebski);
        districtArrayList.add (Mogilevski);
        districtArrayList.add (Brestski);
        districtArrayList.add (Grodnenski);
        regionArrayList.add (Gomelskaya);
        regionArrayList.add (Minskaya);
        regionArrayList.add (Vitebskaya);
        regionArrayList.add (Mogilevskaya);
        regionArrayList.add (Brestskaya);
        regionArrayList.add (Grodnenskaya);

        Country Belarus = new Country("Беларусь", cityArrayList, districtArrayList, regionArrayList );
        System.out.println(Belarus);

        PrintCapital printCapital = new PrintCapital();
        printCapital.CapitalPrint(Belarus);

        PrintSquare printSquare = new PrintSquare();
        printSquare.SquarePrint(Belarus);

        AmountRegions amountRegions = new AmountRegions();
        amountRegions.RegionAmount(Belarus);

        PrintCityCentre printCityCentre = new PrintCityCentre();
        printCityCentre.CityCentrePrint(Belarus);
    }
}
