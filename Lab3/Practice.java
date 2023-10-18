package Lab3;

import java.util.Scanner;
import java.util.Vector;
import java.util.Comparator;
import java.util.Collections;

public class Practice {
    public static Student findMostSuccessfulStudent(Vector<Student> students) {
        Comparator<Student> scoreComparator = Comparator.comparingDouble(Student::getAverageScore);
        Student mostSuccessfulStudent = Collections.max(students, scoreComparator);
        return mostSuccessfulStudent;
    }

    public static void lab3() {
        Scanner scanner = new Scanner(System.in);
        Vector<Student> students = new Vector<>();

        while (true) {
            System.out.println("Enter one operations:");
            System.out.println("1. Add new student");
            System.out.println("2. Show information about student");
            System.out.println("3. Find the most successful");
            System.out.println("4. Clear data about students");
            System.out.println("5. Exit");

            int x = Integer.parseInt(scanner.nextLine());

            if (x == 1) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("University: ");
                String university = scanner.nextLine();

                System.out.print("Faculty: ");
                String faculty = scanner.nextLine();

                System.out.print("AverageScore: ");
                double averageScore = Double.parseDouble(scanner.nextLine());
                students.add(new Student(name, university, faculty, averageScore));
            } else if (x == 2) {
                if(students.isEmpty()){
                    System.out.println("Empty data about students");
                }else {
                    int studentNumber = 1;
                    for (Student student : students) {
                        System.out.println("Details of Lab3.Student " + studentNumber + ":");
                        student.printInformation();
                        System.out.println("----------------");
                        studentNumber++;
                    }
                }
            } else if(x==3){
                if(students.isEmpty()){
                    System.out.println("Empty data about students");
                }
                else {
                    Student mostSuccessfulStudent = findMostSuccessfulStudent(students);
                    System.out.print("The most successful student is: ");
                    mostSuccessfulStudent.printInformation();
                    System.out.println("----------------");
                }
            } else if(x==4){
                System.out.println("All data was deleted");
                students.clear();
            } else if(x==5){
                System.out.println("The end of program");
                break;
            } else {
                System.out.println("Enter integer between 1 - 5");
            }
        }
    }
}
