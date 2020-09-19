package oops;

public class Methodoverriding {

	void run(){
		System.out.println("bike is running");
	}

	static class test1 extends Methodoverriding{
		void run(){
			System.out.println("Hyundai I20 is running");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj= new test1();
		obj.run();


	}
}
