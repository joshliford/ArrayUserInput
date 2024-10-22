import java.util.Scanner;
import java.util.Arrays;

public class ArrayUserInput {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Enter the array size: ");
        size = input.nextInt();

        System.out.println("Enter the elements in the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The initial array is: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        input.close();
    }
}
