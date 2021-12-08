package task1_4;

import java.util.Comparator;
class Train {
    private String destination;
    private int number;
    private String departure_time;

    public Train(String destination, int number, String departure_time) {
        this.destination = destination;
        this.number = number;
        this.departure_time = departure_time;
    }

    public static class ByNumberComparator implements Comparator < Train > {
        @Override
        public int compare(Train left, Train right) {
            return left.number - right.number;
        }
    }
    public static class ByDestinationAndTimeComparator implements Comparator< Train > {
        @Override
        public int compare(Train left, Train right) {
            if (left.destination == right.destination)
                return left.departure_time.compareTo(right.departure_time);
            return left.destination.compareTo(right.destination);
        }
    }
    public void print() {
        System.out.println(number + " -> " + destination + " : " + departure_time);
    }
}


