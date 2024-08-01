package com.examples;
import java.util.*;
//import java.util.stream.Collectors;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> name=Arrays.asList(10,8,15,19,22,78,18);
     System.out.println("Printing all integers");
     name.stream().forEach(System.out::println);
     System.out.println(" ");
     
     long count = name.stream().count();
     System.out.println("Count the numbers");
     System.out.println("\ncount: "+count);
   //  List<Integer> li name = name.stream()
    //		 .filter(name->name.startsWith("1"))
    //		 .collect(Collectors.toList());
    // System.out.println("\n collect (name starting with '1'): ");
    // li name.forEach(System.out::println);
     System.out.println("Finding the first Element");
     Optional<Integer> firstName = name.stream().findFirst();
     System.out.println("\nfindFirst: ");
     firstName.ifPresent(System.out::println);
     System.out.println("Sorted collection: ");
     name.stream().sorted().forEach(names-> System.out.print(names+" "));
     System.out.println(" ");
     System.out.println(" Display all unique elements in descending order");
     name.stream().distinct().sorted(Collections.reverseOrder()).forEach(values->System.out.print(values+" "));
     /* Optional<Integer> Minimum = name.stream().sorted().findFirst();
     System.out.println("\nfindMinimum: ");
     Minimum.ifPresent(System.out::println);
     */
     
     /*name.stream().sorted().forEach(names-> System.out.print(names+" "));
     Optional<Integer> Maximum = name.stream().sorted().findLast();
     System.out.println("\nfindMaximum: ");
     Maximum.ifPresent(System.out::println); */
     System.out.println(" ");
     System.out.println("Print all the even numbers");
     name.stream().filter(n -> n%2==0).forEach(System.out::println);
     
     System.out.println("Number starts with 1");
     name.stream().map(no -> no +"").filter(no->no.startsWith("1")).forEach(no-> System.out.print(no+" "));
     System.out.println(" ");
     System.out.println("Maximum value : ");
     Optional max=name.stream().max(Integer::compare);
     System.out.println(max.get());
     System.out.println("Minimum value : ");
     Optional min=name.stream().min(Integer::compare);
     System.out.println(min.get());
     System.out.println(" ");
 
     
     }
	}


