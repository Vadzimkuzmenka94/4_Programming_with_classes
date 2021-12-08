package task1_10;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String shopName;
    private ArrayList<Airline> AirlineList = new ArrayList<>();

    public Airport(String Minsk2) {
    }

    void addAirline(Airline airline) {
        AirlineList.add(airline);
    }

    public String getShopName() {
        return shopName;
    }

    List<Airline> getListByTimeAndDay(String DayGo, Double TimeGo) {
        List<Airline> list = new ArrayList<>();
        for (Airline c : AirlineList) {
            if (c.getDay() == DayGo && c.getTime() >= TimeGo ) {
                list.add(c);
            }
        }
        return list;
    }


    List<Airline> getListByNumberDayOfWeek(String dayOfWeek) {
        List<Airline> list = new ArrayList<>();
        for (Airline c : AirlineList) {
            if (c.getDay() == dayOfWeek) {
                list.add(c);
            }
        }
        return list;
    }

    List<Airline> getListByDestination(String DestinationEq) {
        List<Airline> list = new ArrayList<>();
        for (Airline c : AirlineList) {
            if (c.getDestination() == DestinationEq) {
                list.add(c);
            }
        }
        return list;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}

