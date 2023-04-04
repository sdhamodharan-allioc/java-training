package com.training.day23.exercise1;

import com.training.day23.WordCount;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class WordCountMap extends LinkedHashMap<String, WordCount> {

    private CharCountMap charCountMap;
    public WordCountMap(CharCountMap charCountMap){

        super();
        this.charCountMap = charCountMap;
    }
    public void add(String word) {
        WordCount wordcount = get(word);
        if (wordcount == null) {
            wordcount = new WordCount();
        }
        wordcount.increment();
        put(word, wordcount);

        charCountMap.add(word);
    }
}
