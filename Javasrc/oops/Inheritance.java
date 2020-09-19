package oops;

public class Inheritance {
	float Salary=40000;
}
class Employee extends Inheritance{
	
	int bonus=1000;
	public static void main(String args[]){ 
		Employee E=new Employee();
		System.out.println("Employee salary:"+E.Salary);
		System.out.println("Employee bonus"+E.bonus);
	}

}
