package oops;

public class Encapsulation {
	
	private String geekname;
	private int geekage;
	private int geekroll;
	
	public String getName(){
		
		return geekname;
	}
	public int getAge()
	{
		return geekage;	
	}
	public int getroll()
	{
		return geekroll;	
	}
	public void setName(String newName){	
		geekname=newName;	
	}
	public void setAge(int newage){	
		geekage=newage;
	}
	public void setroll(int newroll){
		  geekroll=newroll;
	}
}
