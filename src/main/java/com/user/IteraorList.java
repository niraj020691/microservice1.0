package com.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IteraorList {

    public static void main(String[] args){
        List<Employee> employees= new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",30,40000));
        employees.add(new Employee(20,"Ram",31,50000));
        employees.add(new Employee(30,"Ra",32,30000));
        employees.add(new Employee(40,"RRR",33,90000));

        Collections.sort(employees,new MySort());
        System.out.println(employees);
    }
}

class MySort implements Comparator<Employee>{

    public int compare (Employee o1,Employee o2){
        return (int)(o1.getSalary()-o2.getSalary());
    }

}
