package Array;

public class MinnumberArray {


	static int arr[]={58,0,2,1};
	//creating a method which receives array as a parameter
	static  int small(){
        int i;
		int min=arr[0];
		for(i=1;i<arr.length;i++){
		if(min>arr[i])
			min=arr[i];
		}
		return min;
	}
 public static void main(String[] args) {
	 MinnumberArray least=new MinnumberArray();
	 System.out.println(least.small());
}
}
