package com.training.day23.customtreemap;
import java.util.Comparator;
public class EmpNameSortUsingComparator implements Comparator<Employe>{
    @Override
    public int compare(Employe o1, Employe o2)
    {
        return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());
    }

}
