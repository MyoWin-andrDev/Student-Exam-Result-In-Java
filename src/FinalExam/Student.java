package FinalExam;

public class Student {
    private String name;
    private char gender;
    private int myanmarMark;
    private int englishMark;
    private int mathMark;
    private int totalMark;
    private boolean result;

    public Student(String name , char gender, int myanmarMark, int englishMark, int mathMark, int totalMark, boolean result){
        this.name = name;
        this.gender = gender;
        this.myanmarMark = myanmarMark;
        this.englishMark = englishMark;
        this.mathMark = mathMark;
        this.totalMark = totalMark;
        this.result = result;
    }
}
