import java.util.Arrays;

public class ImperativeSorting {

  //compare two integers, used by both sort functions
  public static boolean compare (int value1,int value2){
  	return value1 > value2;
  }

  //swamp values in two adjacent array cells, used by both sort functions
  public static void swap_values(int[] arrayIn, int current_index){
  	int temp = arrayIn[current_index];
  	arrayIn[current_index] = arrayIn[current_index+1];
  	arrayIn[current_index+1] = temp;
  }

  //sort given array using insertion method
  public static void insertion_sort(int[] arrayIn){
     for (int current_index = 1; current_index < arrayIn.length; current_index++) {
         int value = arrayIn[current_index];
         int previous_index = current_index-1;
         while ( (previous_index > -1) && compare( arrayIn [previous_index], value ) ) {
             swap_values(arrayIn, previous_index);
             previous_index--;
         }
     }
  }

  //sort given array using bubble method
  public static void bubble_sort(int[] arrayIn){
    for (int index_outer = 1; index_outer <= arrayIn.length-1 ; index_outer++ ) {
      for (int index_inner = 0; index_inner <= arrayIn.length-2 ; index_inner++ ) {
        if(compare(arrayIn[index_inner], arrayIn[index_inner+1])){
          swap_values(arrayIn, index_inner);
        }
      }
    }
  }

  public static void main(String []args){
		int[] bubbleArray = {6,2,7,5,3,4,1}; //instantiate array with values
    System.out.println(Arrays.toString(bubbleArray));
    bubble_sort(bubbleArray);
    System.out.println(Arrays.toString(bubbleArray));

    int[] insertionArray = {6,2,7,5,3,4,1}; //instantiate array with values
    System.out.println(Arrays.toString(insertionArray));
    insertion_sort(insertionArray);
    System.out.println(Arrays.toString(insertionArray));

	}
}
