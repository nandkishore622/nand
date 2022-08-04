package com.cg;

        /*1.Write a program to print employee details working in each department

        2.Write a program to print employees count working in each department

        3.Write a program to print active and inactive employees in the given collection

        4.Write a program to print Max/Min employee salary from the given collection

        5.Write a program to print the max salary of an employee from each department*/

import java.util.*;
import java.util.stream.Collectors;

public class Java8All {
    public static void main(String[] args) {

        List<Emp> listEmp = getListOfEmployee();

        System.out.println("\n\nWrite a program to print employee details working in each department");
//        Map<String, List<Emp>> empDetailsByDept = listEmp.stream().collect(Collectors.groupingBy(Emp::getDept));
        Map<String, List<Emp>> empDetailsByDept = listEmp.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.toList()));
//        System.out.println(empDetailsByDept);
        empDetailsByDept.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        });

        System.out.println("\n\nWrite a program to print employees count working in each department");
        Map<String, Long> empCountByDept = listEmp.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
        System.out.println(empCountByDept);

        System.out.println("\n\nWrite a program to print active and inactive employees in the given collection");
        listEmp.stream().filter(emp->"y".equalsIgnoreCase(emp.status)).forEach(System.out::println);
        listEmp.stream().filter(emp->!"y".equalsIgnoreCase(emp.status)).forEach(System.out::println);

        System.out.println("\n\nWrite a program to print Max/Min employee salary from the given collection");
        Optional<Emp> maxSalary = listEmp.stream().max(Comparator.comparing(Emp::getSalary));
        System.out.println(maxSalary);

        Optional<Emp> minSalary = listEmp.stream().min(Comparator.comparing(Emp::getSalary));
        System.out.println(minSalary);

        System.out.println("\n\nWrite a program to print the max salary of an employee from each department");
        Map<String, Optional<Emp>> maxSalaryByDept = listEmp.stream().collect(Collectors.groupingBy(emp->emp.getDept(), Collectors.maxBy(Comparator.comparing(Emp::getSalary))));
        System.out.println(maxSalaryByDept);

        System.out.println("\n\nWrite a program to print an employee in sorted order by age");
        listEmp.stream().sorted(Comparator.comparing(Emp::getEmpAge)).forEach(System.out::println);

        System.out.println("\n\nWrite a program to print an employee in sorted order in reverse by age");
        listEmp.stream().sorted(Comparator.comparing(Emp::getEmpAge).reversed()).forEach(System.out::println);
    }

    private static List<Emp> getListOfEmployee() {
        List<Emp> listEmp = new ArrayList<>();
        listEmp.add(new Emp(1,"nand",32, 10000d, "sg","y"));
        listEmp.add(new Emp(2,"narm",31, 200000d, "cg","y"));
        listEmp.add(new Emp(3,"ram",34, 30000d, "sg","n"));
        listEmp.add(new Emp(4,"kumar",25, 110000d, "cg","n"));
        listEmp.add(new Emp(5,"arun",38, 5000d, "sg","y"));

        return listEmp;
    }
}

