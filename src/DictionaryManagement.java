import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DictionaryManagement {

    private Dictionary dictionary;

    public DictionaryManagement() {
        dictionary = new Dictionary();
    }

    public void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        
        // So luong tu muon nhap
        int wordCount = input.nextInt();
        input.nextLine();

        // Nhap tu tieng anh va nghia tieng viet
        while (wordCount > 0) {
            Word temp = new Word();
            temp.setWordTarget(input.nextLine());
            temp.setWordExplain(input.nextLine());
            dictionary.addNewWord(temp);
            wordCount--;
        }
    }

    public void showAllWords() {
        int wordCount = 1;
        List<Word> temp = dictionary.getWordList();

        System.out.printf("%-4s | %-7s | %s\n", "NO", "English", "Vietnamese");

        for(Word w : temp) {
            System.out.printf("%-4d | %-7s | %s\n", wordCount, w.getWordTarget(), w.getWordExplain());
            wordCount++;
        }
    }


    public static void main(String[] args) {
        DictionaryManagement manager = new DictionaryManagement();
        manager.insertFromCommandline();
        manager.showAllWords();
    }
}