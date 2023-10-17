package Lab1;

import java.util.Scanner;

public class Array {
    public static void lab1(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int SIZE = scanner1.nextInt();
        if (SIZE <= 0) {
            System.out.println("Enter at least 1 element");
            return;
        }
        int[] arr = new int[SIZE];
        int sum = 0;
        int mul = 1;
        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = scanner1.nextInt();
            if (i % 2 == 1) {
                mul *= arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiplying = " + mul);
    }
}
