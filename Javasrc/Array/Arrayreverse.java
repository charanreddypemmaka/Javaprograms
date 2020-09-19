package Array;

public class Arrayreverse {

	static int arr[]={8,4,5,6,9};
	static void reverse(){
		for(int i=arr.length-1;i>=0;i--){
		System.out.println(""+arr[i]);
		}
	}
	public static void main(String[] args) {
		Arrayreverse rev=new Arrayreverse();
		rev.reverse();
	}

}
