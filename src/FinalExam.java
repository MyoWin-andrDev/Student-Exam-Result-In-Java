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
        int passedCount = 0;
        int highestMark = 0;
        String highestMarkedStudent = "";
        for (int i = 0 ; i < numOfStudent ; i++){
            //Getting Name Input
            System.out.print("Enter no."+ i +" Student name : ");
            name[i] = scanner.nextLine();
            //Getting Gender Input
            System.out.print("Enter Gender (m/f) : ");
            gender[i] = scanner.nextLine().charAt(0);
            //Getting Myanmar Mark
            System.out.print("Enter " + name[i] + "'s Myanmar Mark : ");
            myanmarMark[i] = scanner.nextInt();
            //Getting English Mark
            System.out.print("Enter " + name[i] + "'s English Mark : ");
            englishMark[i] = scanner.nextInt();
            //Getting Myanmar Mark
            System.out.print("Enter " + name[i] + "'s Math Mark : ");
            mathMark[i] = scanner.nextInt();
            scanner.nextLine();
            //Calculating total mark
            if(myanmarMark[i] >= 40 && englishMark[i] >= 40 && mathMark[i] >= 40){
                examResult[i] = true;
                passedCount++;
            }else {
                examResult[i] = false;
            }
            totalMark[i] = myanmarMark[i] + englishMark[i] + mathMark[i];
            //Comparing Mark finding the highest
            if(totalMark[i] > highestMark){
                highestMark = totalMark[i];
                highestMarkedStudent = name[i];
            }
            String passedResult = examResult[i]? " (Passed)" : " (Failed)";
            System.out.println("Total Marks of " + name[i] + " is " + totalMark[i] + passedResult);
        }


        //Calculating Average Mark
    }
}
