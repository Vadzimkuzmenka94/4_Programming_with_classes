package task2_1.entity;

public class Sentence {
String sent;

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public Sentence(String sent) {
        this.sent = sent;
    }

    @Override
    public String toString() {
        return "" +
                 sent+".";
    }
}
