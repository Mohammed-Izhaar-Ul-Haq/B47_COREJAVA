package com.tnsif.statickeyword;

public class Employee {

		private String name;
		private int id;
		static int count=0;
		//declare static variable
		static String companyName="tns";
		private int salary=0;

		/*
		 * //nuclear family int counttwo=0; Employee(){ counttwo++;
		 * System.out.println(counttwo); } //joint family static int counttwo=0;
		 * Employee(){ counttwo++; System.out.println(counttwo); }
		 */
		Employee(){
			salary++;
			System.out.println(salary);
		}
		int count() {
			count++;
			return count;
		}
		
		Employee(String name,int id){
			this.name=name;
			this.id=id;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + "]";
		}
}
