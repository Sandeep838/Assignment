package project.com;

 class Manager2{
	 long employeeid=126534;
		String employeeName="peter";
		String employeeAdress="chennai india";
		long  employeePhone=237844;
		double basicSalary=65000*12;
		double TransportAllowence=15*basicSalary/100;
		void show() {
			System.out.println(+ employeeid+" "+employeeName);
			System.out.println("Manager salary "+basicSalary);
		System.out.println("Manager Tansport allowence"+TransportAllowence);
		
		}
}
 
class Traniee extends Manager2{
	long employeeid=29846;
	String employeeName="jack";
	String employeeAdress="mumbai india";
	long  employeePhone=237844;
	double basicSalary=45000*12;
	double  TransportAllowence=10*basicSalary/100;
	void display(){
		System.out.println(+ employeeid+" "+employeeName);
		System.out.println("traniee salary "+basicSalary);
		System.out.println("traniee Tansport allowence"+TransportAllowence);
	}
}

public class Inhertence_Activity {

	public static void main(String[] args) {
		Manager2 ma=new Manager2();
		ma.show();
		Traniee t=new Traniee();
		t.display();

	}

}

