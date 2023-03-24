package com.training.day23.customtreemap;

import java.util.Comparator;

public class EmpIdSortUsingComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2)
    {
        return o1.getEmpId() - o2.getEmpId();
    }
}
