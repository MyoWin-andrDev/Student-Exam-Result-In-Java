import java.util.Scanner;

public class FinalExam {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Asking For the number of student
        System.out.println("*****   Student Exam Result   *****");
        System.out.print("Enter number of student : ");
        int numOfStudent = scanner.nextInt();
        scanner.nextLine();
        //Adding the number of student as total array indexes
        String[] name = new String[numOfStudent];
        char[] gender = new char[numOfStudent];
        int[] myanmarMark = new int[numOfStudent];
        int[] englishMark = new int[numOfStudent];
        int[] mathMark = new int[numOfStudent];
        int[] totalMark = new int[numOfStudent];
        boolean[] examResult = new boolean[numOfStudent];

        for (int i = 0 ; i < numOfStudent ; i++){
            //Getting Name Input
            System.out.print("Enter no."+ i +" Student name : ");
            name[i] = scanner.next();
            //Getting Gender Input
            System.out.print("Enter Gender (m/f) : ");
            gender[i] = scanner.nextLine().charAt(0);
        }
    }
}
