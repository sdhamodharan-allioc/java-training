package com.training.day23.customtreemap;

import java.util.Set;
import java.util.TreeSet;

public class customPersonTreeSet {
    public static void main(String[] args) {
        Set<Person> personTreeSet = new TreeSet<Person>(new PersonAgeSortUsingComparator());
        personTreeSet.add(new Person(30,"Ramu"));
        personTreeSet.add(new Person(25,"Savitha"));
        personTreeSet.add(new Person(35,"Radhika"));
        personTreeSet.add(new Person(40,"Komathy"));
        personTreeSet.add(new Person(50,"Vani"));
        personTreeSet.add(new Person(12, "Kavin"));

        System.out.println("Person Tree set: " + personTreeSet);

        Set<Person> personTreeSet1 = new TreeSet<Person>(new PersonNameSortUsingComparator());
        personTreeSet1.add(new Person(30,"Ramu"));
        personTreeSet1.add(new Person(25,"Savitha"));
        personTreeSet1.add(new Person(35,"Radhika"));
        personTreeSet1.add(new Person(38,"Komathy"));
        personTreeSet1.add(new Person(50,"Vani"));
        personTreeSet1.add(new Person(12, "Kavin"));

        System.out.println("Person Tree set: " + personTreeSet1);


        Set<Person> personTreeSet2 = new TreeSet<Person>(new PersonAgeAndNameSortUsingComparator());
        personTreeSet2.add(new Person(30,"Ramu"));
        personTreeSet2.add(new Person(25,"Savitha"));
        personTreeSet2.add(new Person(35,"Radhika"));
        personTreeSet2.add(new Person(30,"Komathy"));
        personTreeSet2.add(new Person(50,"Vani"));
        personTreeSet2.add(new Person(12, "Kavin"));

        System.out.println("Person Tree set: " + personTreeSet2);
    }
    }
