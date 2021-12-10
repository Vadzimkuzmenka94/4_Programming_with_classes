package task2_1;

import task2_1.entity.Sentence;
import task2_1.entity.Text;
import task2_1.entity.Word;
import task2_1.service.addText;
import task2_1.service.printText;
import task2_1.service.printTopic;

public class main {
    public static void main(String[] args) {
        Word word = new Word("Привет.");
        Sentence sentence = new Sentence("Главные роли исполняют Александр Петров, Иван Янковский и Кристина Асмус");
        Text text = new Text(word, sentence);

        printText PrintText = new printText();
        PrintText.prntTxt(text);

        System.out.println("текст после добавления текста");
        addText AddText = new addText();
        AddText.addtxt(sentence);
        System.out.println(text);
    }
}
