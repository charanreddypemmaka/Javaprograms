package oops;

public class Superkeyword {

	String color="black";

	static class Key extends Superkeyword{

		String color="blue";
		void Printcolor(){

			System.out.println(color);
			System.out.println(super.color);

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Key obj=new Key();
		obj.Printcolor();

	}

}
