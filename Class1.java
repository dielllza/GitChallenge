import java.util.ArrayList;
import java.util.List;
import java.util.Collections; //this won't be used
​
public class Class1 {
    public final String SPECIAL_CHARACTER = "a";
​
    public List<String> method(String paragraph) { //the methood name "method" could be more self explanatory, for example findShortestWordsWithA
        List<String> shortestWords = new ArrayList<>();
        String[] sentences =   paragraph.split("."); // should be .split("\\.") instead because this method accepts Strings as regex in Java and the dot is a special character in regex, thats why you use \\.
​						     // should include checks wether a paragraph is empty
						     // small style guide: too many spaces after =
        for (int i=0;i<sentences.length;i++) {
            String[] words = sentences[i].split(" ");
            String shortestWord = words[0]; //if none of the words in the sentence contain 'A' a word that doesn't contain 'A' would be returned.
					    // instead use some big integer value for representing a maximal length of the string for example Integer.MAX_VALUE
​
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() < shortestWord.length()) { 
                    if (words[j].contains("a")) { // use SPECIAL_CHARACTER  instead of "a", also check for occurece of uppercase 'A'
                        shortestWord = words[j];
                    }
                }
            }
​
            shortestWords.add(shortestWord);
        }
​
​	//too many empty lines
​
        return shortestWords;
    }

    /*
    public List<String> method(String paragraph) {
        List<String> shortestWords = new ArrayList<>();
        if(paragraph.isEmpty()){
         //code for when the paragraph parameter is empty
        }
        String[] sentences = paragraph.split("\\.");      
        for (int i=0;i<sentences.length;i++){
            String[] words = sentences[i].split(" ");
            int shortestWordLength = Integer.MAX_VALUE;
            int shortestWordIndex = 0;
            for (int j = 0; j < words.length; j++) {
               if (words[j].toLowerCase().contains(SPECIAL_CHARACTER)) {
                  if (words[j].length() < shortestWordLength) {
                        shortestWordLength = words[j].length();
                        shortestWordIndex = j;
                    }
                }
            }
            if (shortestWordLength < Integer.MAX_VALUE){
                shortestWords.add(words[shortestWordIndex]);
            }
        }
        return shortestWords;
    }
   */

    public String findShortestWordWithA(String paragraph) { 
        List<String> shortestWordsWithA = method(paragraph);
        String shortestWord = shortestWordsWithA.get(0); // should include a check wether there the method(paragraph) has no elements (the paragraph does not have any 'a'-s) otherwise it will retrun error in case of empty list
							 // in case of an empty list return for example an empty string
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

	
     //too many empty lines
​
​
    public String findFirstShortWordStartingWithA(String paragraph) {
        List<String> shortestWordsWithA = method(paragraph); 
        String firstShortWordStartingWithA = "";
​
        for(int i = 0; i < shortestWordsWithA.size(); i++) {
            if (shortestWordsWithA.get(i).startsWith("a")) { //should also use .toLowerCase() method because word can contain an uppercase A at the beggining, use SPECIAL_CHARACTER  instead of "a"
                firstShortWordStartingWithA = shortestWordsWithA.get(i); 

		//should insert a break statement here otherwise it will return the last word starting with A
            }
        }
​
        return firstShortWordStartingWithA; 
    }
}