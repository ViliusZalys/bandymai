package lt.vtvpmc.ems.akademijait.Vilius;

import java.util.Arrays;

public class ArraysDifferent {
   // Object object;

    public static void main(String[] args) {
        // System.out.println();
        randomArray(10000);
    }

    public static void randomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.print(numbers);
        System.out.print("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("\n");
        for (int elements : numbers) {
            System.out.print(elements);
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n");
        int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(numbersCopy);
        System.out.println(Arrays.toString(numbersCopy));
        long startTime = System.currentTimeMillis();
        searchMaxNumber(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "mS");
    }

    public static void searchMaxNumber (int [] numbers) {
        if (numbers == null){
            System.out.println("Go home !");
        }
        else{
        int maxValue = numbers [0];
        for (int i = 0; i < numbers.length; i++){
            if (maxValue < numbers [i]) {
                maxValue = numbers[i];
            }
        }
        System.out.println(maxValue);
    }

}}
