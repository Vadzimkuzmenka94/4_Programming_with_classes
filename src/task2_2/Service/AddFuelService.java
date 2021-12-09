package task2_2.Service;

import task2_2.entity.Automobile;
import task2_2.entity.FuelTank;

public class AddFuelService {
    public void FuelService () {
        int freeVolume;
        int addFuel = 5;
        FuelTank fuelTank = new FuelTank(60,20);
        if (fuelTank.getVolume() > fuelTank.getCurrentFullnes()) {
            freeVolume = fuelTank.getVolume() - fuelTank.getCurrentFullnes();
            System.out.println("в баке есть свободное место в количестве -> " + freeVolume);
        } else {
            System.out.println("В баке нет свободного места");
        }
        fuelTank.setCurrentFullnes(fuelTank.getCurrentFullnes()+addFuel);
        System.out.println("в бак добавлено " + addFuel + "литров");
        System.out.println("сейчас в баке " + fuelTank.getCurrentFullnes());



    }
}
