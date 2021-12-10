package task2_3.entity;

import java.util.ArrayList;

public class Country {
    String title;
    ArrayList <City> cityArrayList;
    ArrayList <District> districtArrayList;
    ArrayList <Region> regionArrayList;

    public Country(String title, ArrayList<City> cityArrayList, ArrayList<District> districtArrayList, ArrayList<Region> regionArrayList) {
        this.title = title;
        this.cityArrayList = cityArrayList;
        this.districtArrayList = districtArrayList;
        this.regionArrayList = regionArrayList;
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", cityArrayList=" + cityArrayList +
                ", districtArrayList=" + districtArrayList +
                ", regionArrayList=" + regionArrayList +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }

    public void setCityArrayList(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }

    public ArrayList<District> getDistrictArrayList() {
        return districtArrayList;
    }

    public void setDistrictArrayList(ArrayList<District> districtArrayList) {
        this.districtArrayList = districtArrayList;
    }

    public ArrayList<Region> getRegionArrayList() {
        return regionArrayList;
    }

    public void setRegionArrayList(ArrayList<Region> regionArrayList) {
        this.regionArrayList = regionArrayList;
    }
}


