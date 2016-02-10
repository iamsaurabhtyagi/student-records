package com.college.student;

class OverrideParent {

	int a=20;
	static int b=30;
	
	public void show1() {
		System.out.println("Show1 method of Parent Class");
	}
	public static void show2() {
		System.out.println("Show2 method of Parent Class");
	}
}
public class OverridingEx extends OverrideParent{

	int a=100;
	static int b=300;
	
	public void show1() {
		System.out.println("Show1 method of Child Class");
	}
	public static void show2() {
		System.out.println("Show2 method of Child Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideParent obj= new OverridingEx();
		
		obj.show1();
		obj.show2();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
