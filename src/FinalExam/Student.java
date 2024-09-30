package FinalExam;

public class Student {
    private String name;
    private char gender;
    private int myanmarMark;
    private int englishMark;
    private int mathMark;

    public Student(String name , char gender, int myanmarMark, int englishMark, int mathMark){
        this.name = name;
        this.gender = gender;
        this.myanmarMark = myanmarMark;
        this.englishMark = englishMark;
        this.mathMark = mathMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getMyanmarMark() {
        return myanmarMark;
    }

    public void setMyanmarMark(int myanmarMark) {
        this.myanmarMark = myanmarMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }
    public boolean hasPassed(){
        boolean passCount = myanmarMark >= 40 && englishMark >= 40 && mathMark >= 40;
        return passCount;
    }
    public int getTotalMark(){
        int totalMark = myanmarMark + englishMark + mathMark;
        return totalMark;
    }
    //Getting Exam Result
    public String getExamResult(){
        String result  = hasPassed()? " (Passed)" : " (Failed)";
        return result;
    }
}
