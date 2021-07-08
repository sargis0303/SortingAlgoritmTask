import java.util.Arrays;
import java.util.Random;

public class MyInsertionSortingClass {
    public static void main(String[] args) {
       Random random = new Random();
       int[] numbers = new int[15];
        for (int i = 0; i <15 ; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("before sorting: "+ Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("after sorting: "+ Arrays.toString(numbers));

    }
    public static void insertionSort(int [] numbers) {
        for (int i = 1; i < numbers.length ; i++) {
          int  currentNumber = numbers[i];
          int j = i-1;
          while (j>=0&& numbers[j]> currentNumber) {
              numbers[j+1] =numbers[j];
              j--;
            }
          numbers[j+1] = currentNumber;

        }

    }
}
