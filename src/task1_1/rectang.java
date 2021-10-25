package task1_1;

public class rectang {
    int firstside;
    int secondside;

    void ShowSides () {
        System.out.println(firstside);
        System.out.println(secondside);
    }

    void SumSides () {
        int sum = firstside + secondside;
        System.out.println(sum);
    }

    void MaxSides () {
        if (firstside < secondside)
            System.out.println(secondside);
        else {
            System.out.println(firstside);
        }
    }

    public void setFirstside(int firstside) {
        this.firstside = firstside;
    }

    public void setSecondside(int secondside) {
        this.secondside = secondside;
    }
}
