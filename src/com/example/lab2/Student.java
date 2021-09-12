package com.example.lab2;

import java.lang.Comparable;
import java.lang.Override;
import java.lang.String;

public class Student implements Comparable<Student>  {

		int no;
		String name;
		int age;
		
		@Override
		public String toString() {
			return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
		}

		@Override 
		public int compareTo(Student o) {
			return name.compareTo(o.name);
		}
		
		public Student(int no, String name, int age) { //생성자
			this.no = no;
			this.name = name;
			this.age = age;
			
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}


