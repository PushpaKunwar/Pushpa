package Selenium;

 class Vehicle{
	public void run(String a, String b) {

		System.out.println("Vehicle is running");
		
	}
 static class Bike2 extends Vehicle{	
	
	public void run(String a, String b) {
		System.out.println("Bike  is running Safely");
	}
	
public static void main(String[]args) {
	Bike2 obj=new Bike2();
	obj.run("print","Bike  is running Safely");

}
}
}


