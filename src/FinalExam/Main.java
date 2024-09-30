package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Asking For the number of student
        System.out.println("*****   Student Exam Result   *****");
        System.out.print("Enter number of student : ");
        int numOfStudent = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < numOfStudent; i++) {
            //Getting Name Input
            System.out.print("Enter no." + (i + 1) + " Student name : ");
            String name = scanner.nextLine();
            //Getting Gender Input
            System.out.print("Enter Gender (m/f) : ");
            char gender = scanner.nextLine().charAt(0);
            //Getting Myanmar Mark
            System.out.print("Enter " + name + "'s Myanmar Mark : ");
            int myanmarMark = scanner.nextInt();
            //Getting English Mark
            System.out.print("Enter " + name + "'s English Mark : ");
            int englishMark = scanner.nextInt();
            //Getting Myanmar Mark
            System.out.print("Enter " + name + "'s Math Mark : ");
            int mathMark = scanner.nextInt();
            scanner.nextLine();
            studentList.add(new Student(name,gender,myanmarMark, englishMark, mathMark));
        }
    }
}
