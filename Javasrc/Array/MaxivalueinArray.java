package Array;


public class MaxivalueinArray {

	   //array values
	   static int arr[]={100,200,1000,20000};

	   //method to find the max value from array
	   static int largest(){
		   int i;
		   int max=arr[0];
		 for(i=0;i<arr.length;i++){
		   //for(int k:arr)
		     if(arr[i]>max)
		    	 max=arr[i];
		 }
			return max;
	   }

	   public static void main(String[] args) {

		 //  MaxivalueinArray larg= new MaxivalueinArray();
		   System.out.println("printing largesr number "+largest());
	}
}
