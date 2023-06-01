package Selenium;

public class MethodOverloading {;

public void add(double p,double q) {
double s= p+q;
	System.out.println("addition");
}
public void add(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
public void add(String name) {
	String c = "vennela";
	System.out.println(c);
}
public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.add(74,89);
	obj.add(78, 90);
	obj.add("vennela");
	
}
}
