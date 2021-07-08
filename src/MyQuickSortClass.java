import java.util.Arrays;
import java.util.Random;

public class MyQuickSortClass {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];
        for (int i = 0; i <15 ; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("before sorting: "+ Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length-1);
        System.out.println("after sorting: "+ Arrays.toString(numbers));

    }

    public static void quickSort(int[] numbers, int begin, int end) {

        int pivot = end;

        int counter = begin;

        for (int i = begin; i < end; i++) {
            if (numbers[i] < numbers[pivot]) {
                int temp = numbers[counter];
                numbers[counter] = numbers[i];
                numbers[i] = temp;
                counter++;
            }
        }

    }
}
