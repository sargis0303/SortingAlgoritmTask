import java.util.Arrays;
import java.util.Random;

public class MySelectionSortClass {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];
        for (int i = 0; i <15 ; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("before sorting: "+ Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("after sorting: "+ Arrays.toString(numbers));

    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minId = i;

            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[j]<min) {
                    min = numbers[j];
                    minId = j;
                }
               int temp =  numbers[i];
                numbers[i] = min;
                numbers[minId] = temp;

            }
        }

    }
}
