package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Student> studentList = new ArrayList<>();
    private static Result result = new Result(studentList);
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
            Student student = new Student(name,gender,myanmarMark, englishMark, mathMark);
            studentList.add(student);
            //Retrieving total mark
            String examResult = student.hasPassed()? " (Passed)" : " (Failed)";
            System.out.println("Total Marks of " + name + " is " + student.getTotalMark() + examResult);
            System.out.println("\t");
        }
        /** Getting Average **/
        // Retrieving Pass Rate
        System.out.println(result.getPassedCount() + " out of "+ numOfStudent + " student passed the exam!");
        double passedRate = ((double) result.getPassedCount() / numOfStudent) * 100;
        System.out.println("Passed Rate : " + passedRate +"%");
        //Average Mark (All Subject)
        double allAverageMarks = result.getAverageMark();
        System.out.println("Average Mark (All Subject) : " + allAverageMarks);
        //Average Myanmar Mark
        double averageMyanmarMark = result.getAverageMyanmarMark();
        System.out.println("Average Myanmar Mark : " + averageMyanmarMark);
        //Average English Mark
        double averageEnglishMark = result.getAverageEnglishMark();
        System.out.println("Average Myanmar Mark : " + averageEnglishMark);
        //Average Myanmar Mark
        double averageMathMark = result.getAverageMathMark();
        System.out.println("Average Myanmar Mark : " + averageMathMark);
        //Retrieving the student with the highest mark
        System.out.println(result.getHighestMark());
        System.out.println("\t");

        /** Student Summary **/
        System.out.println("*************** Student Summary ***************");
        for (Student student : studentList) {
            System.out.println("Name : " + student.getName());
            System.out.println("Gender : " + student.getGender());
            System.out.println("Myanmar Mark : " + student.getMyanmarMark());
            System.out.println("English Mark : " + student.getEnglishMark());
            System.out.println("Math Mark : " + student.getMathMark());
            System.out.println("Total Mark : " + student.getTotalMark());
            System.out.println("Passed / Failed : " + student.getExamResult());
            System.out.println("\t");
            System.out.println("******************************");
        }
    }
}
