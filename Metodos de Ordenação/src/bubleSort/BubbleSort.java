package bubleSort;

import java.util.Arrays;

public class BubbleSort {

	private static void bubbleSort(int[] array) {
		int n = array.length;
	    int temp = 0;
	    for(int i=0; i < n; i++){
	        for(int j=1; j < (n-i); j++){
	            if(array[j-1] > array[j]){
	                //troca os elementos
	                temp = array[j-1];
	                array[j-1] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		int[] array = {6,3,1,2,5,4};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}