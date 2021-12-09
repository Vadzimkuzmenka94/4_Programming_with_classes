package task2_1.entity;

public class Text  {
    private Word word;
    private Sentence sentence ;

    public Text(Word word, Sentence sentence) {
        this.word = word;
        this.sentence = sentence;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Sentence getSentence() {
        return sentence;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "" +  word
                + sentence
                ;
    }
}
