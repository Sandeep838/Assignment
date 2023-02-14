package Inheritence.com;

class Vehicle1{//parent class
	void running() {
		System.out.println("running mode on");
	}
}
class car1 extends Vehicle1{//child 1
	void run() {
		System.out.println("car mode on");
	}
}
class bike1 extends Vehicle1{//child 2
	void speed() {
		System.out.println("speed is very high");
	}
}
public class Hierarchicalinheritence{//main class
	public static void main(String[]args) {
		bike1 b=new bike1();//object created 
		b.running();
		b.speed();
		car1 c=new car1();//object created
		c.running();
		c.run();
	}
}