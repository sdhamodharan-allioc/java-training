package com.training.day23;

import com.training.day23.exercise1.CharCount;
import com.training.day23.exercise1.CharCountMap;
import com.training.day23.exercise1.EmployeeList;
import com.training.day23.exercise1.WordCountMap;
import org.checkerframework.checker.units.qual.C;

import java.util.Iterator;

public class CountofString {
    public static void main(String[] args) {
        String givenString = "Peter Piper picked a peck of pickled peppers. A peck of pickled peppers Peter " +
                " Piper picked. If Peter Piper picked a peck of pickled peppers, Where's the " +
                " `peck of pickled peppers Peter Piper picked` ";
        String[] strArray = givenString.split(" ");
        System.out.println("Given Sentence:");

        CharCountMap charCountMap = new CharCountMap();
        WordCountMap wordCountMap = new WordCountMap(charCountMap);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
            String word = strArray[i].replace(",", "");
            word = word.replace(".", "");
            word = word.replace("`", "");
            wordCountMap.add(word);
        }
        System.out.println("Number of Words: " + strArray.length);
        Iterator<String> wordIterator = wordCountMap.keySet().iterator();
        while (wordIterator.hasNext()) {
            String word = wordIterator.next();
            WordCount wordcount = wordCountMap.get(word);
            System.out.println("Word :" + word + wordcount);
        }

        Iterator<Character> charIter = charCountMap.keySet().iterator();
        while(charIter.hasNext()){
            Character character = charIter.next();
            CharCount charCount = charCountMap.get(character);
            System.out.println("Char : "+character +", "+charCount);
        }
    }
}

