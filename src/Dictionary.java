import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<Word> wordList;

    public Dictionary() {
        this.wordList = new ArrayList<Word>();
    }

    public void addNewWord(Word p) {
        this.wordList.add(p);
    }

    public List<Word> getWordList() {
        return this.wordList;
    }
}