package Practive_5_5;

import Practice.main;

public class mother implements father,son {

	public void kitchen() {
		System.out.println("mother's kitchen");
	}
	public static void main(String[] args) {
		 mother m1 = new mother();
		 m1.home();
		m1.car();
		m1.land();
		m1.laptop();
		m1.bike();
		m1.kitchen();
	}
	@Override
	public void bike() {
		System.out.println("rz");
		
	}
	@Override
	public void laptop() {
		System.out.println("hp");		
	}
	@Override
	public void home() {
		System.out.println("2bhk");		
	}
	@Override
	public void car() {
		System.out.println("baleno");		
	}
	@Override
	public void land() {
		System.out.println("50 acre");		
	}
	
}
