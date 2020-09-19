package oops;
//Interface
 interface Interface {
	 void a();
	 void b();
	 void c();
	 void d();

}
 //Abstract class calling interface
 abstract class Test implements Interface{

	 public void c(){
		 System.out.println("running c");
	 }
 }
 class Test1 extends Test{

	 public void a(){
		 System.out.println("running a");
	 }

	 public void b(){
		 System.out.println("running b");
	 }
	 public void d(){
		 System.out.println("running d");
	 }
 }
 //Creating a new call to call the Interface methods
class Test5{
    public static void main(String[] args){

    	Interface t=new Test1();
    	t.a();
    	t.b();
    	t.c();
    	t.d();

    }
 }