package task2_1.entity;

public class Word {
    String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "" + word + ".";
    }
}
