package task2_2.Service;

import task2_2.entity.Engine;
import task2_2.entity.Wheel;

public class RunService {

    public void run(Engine engine, Wheel lefrFron, Wheel leftRear, Wheel rightFront, Wheel rightRear) {
        boolean EngineStart = true;
        boolean WheelRun = true;
        if (EngineStart == true && WheelRun == true) {
            boolean AutomobileRun = true;
            if (AutomobileRun == true) {
                System.out.println("Двигатель запущен");
                System.out.println("Колеса вращаются");
                System.out.println("Автомобиль движется");
            } else {
                System.out.println("Автомобиль не движется");
            }
        }
    }
}
