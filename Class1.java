import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
​
public class Class1 {
    public final String SPECIAL_CHARACTER = "a";
​
    public List<String> method(String paragraph) {
        List<String> shortestWords = new ArrayList<>();
        String[] sentences =   paragraph.split(".");
​
        for (int i=0;i<sentences.length;i++) {
            String[] words = sentences[i].split(" ");
            String shortestWord = words[0];
​
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() < shortestWord.length()) {
                    if (words[j].contains("a")) {
                        shortestWord = words[j];
                    }
                }
            }
​
            shortestWords.add(shortestWord);
        }
​
​
​
        return shortestWords;
    }
​
    public String findShortestWordWithA(String paragraph) {
        List<String> shortestWordsWithA = method(paragraph);
        String shortestWord = shortestWordsWithA.get(0);
​
        for (int i = 0; i < shortestWordsWithA.size(); i++)
        {
            if (shortestWordsWithA.get(i).length() < shortestWord.length()){
                shortestWord = shortestWordsWithA.get(i);
            }
        }
​
        return shortestWord;
    }
​
​
    public String findFirstShortWordStartingWithA(String paragraph) {
        List<String> shortestWordsWithA = method(paragraph);
        String firstShortWordStartingWithA = "";
​
        for(int i = 0; i < shortestWordsWithA.size(); i++) {
            if (shortestWordsWithA.get(i).startsWith("a")) {
                firstShortWordStartingWithA = shortestWordsWithA.get(i);
            }
        }
​
        return firstShortWordStartingWithA;
    }
}