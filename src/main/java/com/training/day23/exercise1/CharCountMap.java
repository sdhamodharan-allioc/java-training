package com.training.day23.exercise1;

import com.training.day23.WordCount;

import java.util.LinkedHashMap;

public class CharCountMap extends LinkedHashMap<Character, CharCount> {

    public void add(String word) {
        for(int i=0; i<word.length(); i++){
            Character character = word.charAt(i);
            CharCount charCount = null;                    ;
            if(containsKey(character)){
                charCount = get(character);
            }else{
                charCount = new CharCount();
            }
            charCount.increment();
            put(character, charCount);
        }
    }
}
