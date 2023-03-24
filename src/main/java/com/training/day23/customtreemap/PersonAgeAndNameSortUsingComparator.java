package com.training.day23.customtreemap;

import java.util.Comparator;

public class PersonAgeAndNameSortUsingComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() == o2.getAge()) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        } else
            return o1.getAge() - o2.getAge();
    }
}
