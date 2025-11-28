import java.util.Arrays;

class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 1, 9, 4};

        display("Original array values:      ", numbers);

        Arrays.fill(numbers, 8);
        display("After filling with 8s:      ", numbers);

        numbers[0] = 3;
        numbers[2] = 1; 
        display("After changing two values:  ", numbers);

        Arrays.sort(numbers);
        display("After sorting:              ", numbers);
    }

    public static void display(String message, int array[]) {
        System.out.print(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
