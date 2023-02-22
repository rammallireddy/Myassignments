package week1.day1;

public class Car {

	public void drivecar() {
		
		System.out.println("I am driving car");
	}
	
	public void applyBrake() {
		
		System.out.println("I am applying brakes");
	}
	
	public void soundHorn() {
		
		System.out.println("I am applying Horn");
	}
	
	public void isPuncture() {
		
		System.out.println("My car is Puncture");
	}
	
	public static void main(String[] args) {
		Car obj2= new Car();
		
		obj2.drivecar();
		obj2.applyBrake();
		obj2.soundHorn();
		obj2.isPuncture();
	}
}
