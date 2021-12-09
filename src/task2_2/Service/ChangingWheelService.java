package task2_2.Service;

import task2_2.entity.Automobile;
import task2_2.entity.Wheel;

public class ChangingWheelService {
    boolean needChangingWheelToSummer = true;
    public void ChangingWheel(Automobile automobile) {
        if (needChangingWheelToSummer == true) {
            Wheel wheelLeftFrontSpare = new Wheel("Michelin", "Summer", 16, "Left front");
            Wheel wheelLeftRearSpare = new Wheel("Michelin", "Summer", 16, "Left rear");
            Wheel wheelRightFrontSpare = new Wheel("Michelin", "Summer", 16, "Right front");
            Wheel wheelRightRearSpare = new Wheel("Michelin", "Summer", 16, "Right rear");
            automobile.setLeftFront(wheelLeftFrontSpare);
            automobile.setRightFront(wheelRightFrontSpare);
            automobile.setRightRear(wheelRightRearSpare);
            automobile.setLeftRear(wheelLeftRearSpare);
        } else {
            System.out.println("не требует менять резину");
        }
    }
}


