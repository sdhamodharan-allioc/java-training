package com.training.day23.customtreemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet {

    public static void main(String[] args) {

        /**
         *  Constructs a new, empty tree set, sorted according to the natural ordering of its elements.
         *  All elements inserted into the set must implement the Comparable interface.
         * 	Furthermore, all such elements must be mutually comparable using compareTo() method.
         *
         *  like  code e1.compareTo(e2)
         *
         *  i.   Creates Empty TreeSet
         *  ii.  Sorting logic is Natural order
         *  iii. elements in Set should implement Comparable interface
         */
        //new TreeSet<>();

        /**
         * Constructs a new, empty tree set, sorted according to the specified comparator.
         * All elements inserted into the set must be mutually comparable by the
         * specified comparator: like
         *
         *  comparator.compare(e1, e2)
         *
         *  i.   Creates Empty TreeSet
         *  ii.  Sorting logic is Custom sorting logic implemented using Comparator.
         *
         *  if comparator parameter is null, then TreeSet uses natural ordering of the elements.
         */

        // new TreeSet<>(new EmpIdSortUsingComparator());


        Set<Employe> employeeSet = new TreeSet<Employe>(new EmpIdSortUsingComparator());
        employeeSet.add(new Employe(101,"Rama",10000));
        employeeSet.add(new Employe(108,"Sita",50000));
        employeeSet.add(new Employe(101,"Radha",45000));
        employeeSet.add(new Employe(104,"Krishna",70000));
        employeeSet.add(new Employe(102,"Sai",99000));
        employeeSet.add(new Employe(105,"Krish",25000));


        System.out.println("employeeSet :: "+employeeSet);
        /**
         * employeeSet ::
         *     [Employee [empId=101, empName=Rama, empSalary=10000.0],
         *      Employee [empId=102, empName=Sai, empSalary=99000.0],
         *      Employee [empId=104, empName=Krishna, empSalary=70000.0],
         *      Employee [empId=105, empName=Krish, empSalary=25000.0],
         *      Employee [empId=108, empName=Sita, empSalary=50000.0]]
         */



        Set<Employe> employeeSet1 = new TreeSet<Employe>(new EmpNameSortUsingComparator());
        employeeSet1.add(new Employe(101,"Rama",10000));
        employeeSet1.add(new Employe(108,"Sita",50000));
        employeeSet1.add(new Employe(101,"Radha",45000));
        employeeSet1.add(new Employe(104,"Krishna",70000));
        employeeSet1.add(new Employe(102,"Sai",99000));
        employeeSet1.add(new Employe(105,"Krish",25000));

        System.out.println("employeeSet :: "+employeeSet1);

        /**
         * employeeSet ::
         * 	[Employee [empId=105, empName=Krish, empSalary=25000.0],
         *   Employee [empId=104, empName=Krishna, empSalary=70000.0],
         *   Employee [empId=101, empName=Radha, empSalary=45000.0],
         *   Employee [empId=101, empName=Rama, empSalary=10000.0],
         *   Employee [empId=102, empName=Sai, empSalary=99000.0],
         *   Employee [empId=108, empName=Sita, empSalary=50000.0]]
         *
         *
         */

        Set<Employe> employeeSet2 = new TreeSet<Employe>(new EmpNameAndSalarySortUsingComparator());
        employeeSet2.add(new Employe(101,"Rama",70000));
        employeeSet2.add(new Employe(108,"Sita",50000));
        employeeSet2.add(new Employe(101,"Radha",45000));
        employeeSet2.add(new Employe(104,"Krishna",25000));
        employeeSet2.add(new Employe(107,"Rama",45000));
        employeeSet2.add(new Employe(102,"Sai",99000));
        employeeSet2.add(new Employe(105,"Krish",70000));

        System.out.println("employeeSet :: "+employeeSet2);
        /**
         * employeeSet ::
         *  	[Employee [empId=105, empName=Krish, empSalary=70000.0],
         *       Employee [empId=104, empName=Krishna, empSalary=25000.0],
         *       Employee [empId=101, empName=Radha, empSalary=45000.0],
         *       Employee [empId=107, empName=Rama, empSalary=45000.0],
         *       Employee [empId=101, empName=Rama, empSalary=70000.0],
         *       Employee [empId=102, empName=Sai, empSalary=99000.0],
         *       Employee [empId=108, empName=Sita, empSalary=50000.0]]*/


    }

}
