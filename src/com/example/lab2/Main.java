package com.example.lab2;
//한폴더에 두 파일을 두는것 

import java.util.List;
import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
		//파일이름 - 이름, 학번 
		public static void main(String args[]) {
			List<Student> al = new ArrayList<Student>();
			System.out.println("Studnet List (ordered by name)");
			Student s1 = new Student(101,"kim",23);
			al.add(s1);// adding student class
			Student s2 = new Student(102,"hee",21);
			al.add(s2);
			Student s3 = new Student(103,"park",20);
			al.add(s3);
			Student s4 = new Student(104,"Lee",21);
			al.add(s4);
			Student s5= new Student(105,"ho",21);
			al.add(s5);
			Student s6 = new Student(106,"jiwon",21);
			al.add(s6);
			Student s7 = new Student(107,"chang",21);
			al.add(s7);
			Student s8 = new Student(107,"su",21);
			al.add(s8);
			Student s9 = new Student(108,"hyun",21);
			al.add(s9);
			Student s10 = new Student(107,"bong",21);
			al.add(s10);
			
			Collections.sort(al);
			//traverse elements of arraylist
			
			for(Student s : al ) {
				System.out.println(s.toString());
				
			}
			System.out.println("Student List (reverse ordered by name)");
			
			Collections.sort(al, Collections.reverseOrder());
			//traverse elements of arraylist(reverse ordered)
			for(int i=0; i<al.size(); i++) {
				System.out.println(al.get(i).toString());
				
			}
			
		}
	}
	


