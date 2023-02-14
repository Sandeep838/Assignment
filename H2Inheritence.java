package Inheritence.com;
class Employe{
	int salary=10100;
	int bonus=1500;
void action() {
	int newsalary=salary+bonus;
	System.out.println(newsalary);
	
}
}
class Enginer extends Employe{
	int benifit=10;
	
}
class doctor extends Employe{
	int da=5;
}

public class H2Inheritence {

	public static void main(String[] args) {
		Enginer E=new Enginer();
		System.out.println(E.salary+" "+E.benifit+" "+" salary of enginer");
		
		E.action();
		doctor d=new doctor();
		System.out.println(d.salary+" "+d.da+" "+" salary of doctor");
		d.action();

	}

}
