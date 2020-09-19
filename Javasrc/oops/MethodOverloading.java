package oops;

public class MethodOverloading {
	
	public int Sum(int X,int Y)
	{
		return(X+Y);
	}
	
	public int Sum(int X,int Y,int Z)
	{
         return(X+Y+Z);
	}
	
	public double Sum(double X,double Y){
		return (X+Y);
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloading s=new MethodOverloading();
		System.out.println(s.Sum(10, 20));
		System.out.println(s.Sum(20, 30, 40));
		System.out.println(s.Sum(100.20, 200.20));
	}
	
		
	}
	


