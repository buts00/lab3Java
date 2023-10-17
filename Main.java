import Lab1.*;
import Lab3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Chose one operations 1 - 3:");
            System.out.println("1.Lab1");
            System.out.println("2.Lab3");
            System.out.println("3.Exit");
            int x = scanner.nextInt();
            if(x==1){
                System.out.println("Lab1");
                Array.lab1();
            } else if (x == 2) {
                System.out.println("Lab3");
                Practice.lab3();
            } else if (x == 3) {
                System.out.println("The end of program");
                break;
            }
            else {
                System.out.println("Enter integer between 1 - 3");
            }
        }
        scanner.close();

    }
}
