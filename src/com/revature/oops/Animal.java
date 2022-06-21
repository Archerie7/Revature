package com.revature.oops;

public class Animal {
	public int numOfLegs;
	
	public void speak() {
		System.out.println("*generic animal noise*");
		
	}
	public class Dog extends Animal{
		public static void main(String[] args) {
			Animal d = new Animal();
			d.speak();
		}
		public void speak() {
			System.out.println("Woof!");
		}
	}
}