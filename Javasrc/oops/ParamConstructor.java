package oops;

public class ParamConstructor {

	int id;
	String name;

	//creating a parametirized constructor
	ParamConstructor(int i,String n){

		id=i;
		name=n;

	}
	//method for displaying the names
	void display(){
		System.out.println(id+""+name);
	}
	public static void main(String[] args) {

		ParamConstructor S1=new ParamConstructor(111,"Test");
		ParamConstructor S2=new ParamConstructor(222,"Abc");

		// Calling display method

		S1.display();
		S2.display();

	}

}
