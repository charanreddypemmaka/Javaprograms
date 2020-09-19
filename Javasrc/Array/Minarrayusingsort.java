package Array;

import java.util.Arrays;

public class Minarrayusingsort {

	public static void main(String[] args) {

		int array[]={58,95,88,66,75,45,22};
		int size=array.length;
		Arrays.sort(array);
		System.out.println("Sorting the array"+Arrays.toString(array));
		int min=array[0];
		System.out.println("smallest no "+min);

	}

}
