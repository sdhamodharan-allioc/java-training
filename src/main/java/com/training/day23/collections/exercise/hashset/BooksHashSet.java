package com.training.day23.collections.exercise.hashset;

import java.util.*;

public class BooksHashSet {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<String>();
        books.add("English");
        books.add("Tamil");
        books.add("Science");
        books.add("Maths");
        books.add("Social");
        System.out.println("Books:" + books);
        System.out.println("No of Hashset Elements: " + books.size());

        String[] newarray = new String[books.size()];
        books.toArray(newarray);

        System.out.println("Array elements: ");
        for (String element : newarray) {
            System.out.println(element);
        }
        Set<String> treeset = new TreeSet<String>(books);
        System.out.println("TreeSet elements: ");
        for(String element : treeset) {
            System.out.println(element);
        }

        List list = new ArrayList<String>(books);
        System.out.println("Array List Elements:" +list);

        HashSet<String> books1 = new HashSet<String>();
        books1 = (HashSet) books.clone();
        System.out.println("New HashSet:" + books1);
        System.out.println("Check both are equal(compare 2 hashsets):" +books.equals(books1));

            books1.removeAll(books1);
            System.out.println("Empty:" + books1);
            System.out.println("Is Empty:" + books1.isEmpty());

            Iterator itr = books.iterator();
            while (itr.hasNext()) {
                System.out.println(" " + itr.next());
            }


        }
    }
