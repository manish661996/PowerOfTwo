package com.bridgelabz.PowerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {
	private int Number;

	PowerOfTwo(){
		System.out.println("Object is being created");
	}

	public void setNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of power of 2");
		this.Number = sc.nextInt();

	}

	public int getNumber() {
		return this.Number;
	}

	public void printTableOfPowers() {
		if(this.getNumber()>= 0 && this.getNumber()< 31) {
			for(int i =0;i<=this.getNumber();i++) {
				System.out.println("Power of 2 ^ "+ i +" is : "+ (Math.pow(2, i)));
			}
		}
		else
			System.out.println("Invalid input , please enter value from 0 to 30");
	}

}
