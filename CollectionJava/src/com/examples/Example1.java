package com.examples;

import java.util.*;

class Student{
 int roll;
 String name;
 Student(int roll,String name){
	 this.roll=roll;
	 this.name=name;
 } 
 
 }

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Student> li = new ArrayList<Student>();
    li.add(new Student(12,"Janani"));
    li.add(new Student(14,"Anita"));
    li.add(new Student(12,"Stella"));
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));
	}

}}
