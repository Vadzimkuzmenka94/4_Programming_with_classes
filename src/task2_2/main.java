package task2_2;

import task2_2.Service.AddFuelService;
import task2_2.Service.ChangingWheelService;
import task2_2.Service.RunService;
import task2_2.entity.Automobile;
import task2_2.entity.Engine;
import task2_2.entity.FuelTank;
import task2_2.entity.Wheel;

public class main {
    public static void main(String[] args) {
        Engine TSI = new Engine(2.5, "Дизель", 140);
        Wheel wheelLeftFront = new Wheel("Сontinental", "Winter", 17, "Left front");
        Wheel wheelLeftRear = new Wheel("Сontinental", "Winter", 17, "Left rear");
        Wheel wheelRightFron = new Wheel("Сontinental", "Winter", 17, "Right front");
        Wheel wheelRightRear = new Wheel("Сontinental", "Winter", 17, "Right rear");

        FuelTank fuelTank = new FuelTank(60, 20);
        Automobile automobile = new Automobile("Ауди", TSI, wheelLeftFront, wheelRightFron, wheelLeftRear, wheelRightRear,fuelTank);
        System.out.println(automobile);
        ChangingWheelService changingWheelService = new ChangingWheelService();
        changingWheelService.ChangingWheel(automobile);
        System.out.println("Автомобиль после переобувки на зимнюю резину");
        System.out.println(automobile);

        RunService runService = new RunService();
        runService.run(TSI, wheelRightFron, wheelLeftRear, wheelLeftFront, wheelRightRear);
        AddFuelService addFuelService = new AddFuelService();
        addFuelService.FuelService();
        System.out.println("у нас в наличии автомобиль марки -->>" + automobile.getBrand());

    }
}
