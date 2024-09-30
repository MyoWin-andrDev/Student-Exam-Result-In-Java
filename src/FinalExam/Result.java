package FinalExam;

import java.util.List;

public class Result {
    private List<Student> students;
    public Result(List<Student> students){
        this.students = students;
    }
    //Getting Passed student count
    public int getPassedCount(){
        int count = 0;
        for (Student student : students){
            if(student.hasPassed()){
                count++;
            }
        }
        return count;
    }
    //Getting AverageTotalMark
    public double getAverageMark(){
        int total = 0;
        for (Student student : students){
            total += student.getTotalMark();
        }
        return (double) total / students.size();
    }
    //Getting Average Myanmar Mark
    public double getAverageMyanmarMark(){
        int total = 0;
        for (Student student : students){
            total += student.getMyanmarMark();
        }
        return (double) total / students.size();
    }
    //Getting Average Myanmar Mark
    public double getAverageEnglishMark(){
        int total = 0;
        for (Student student : students){
            total += student.getEnglishMark();
        }
        return (double) total / students.size();
    }
    //Getting Average Myanmar Mark
    public double getAverageMathMark(){
        int total = 0;
        for (Student student : students){
            total += student.getMathMark();
        }
        return (double) total / students.size();
    }
    //Getting Highest
    public String getHighestMark(){
        String highestMarkedStudent = "";
        int highestMark = 0;
        for (Student student : students){
            if(student.getTotalMark() > highestMark){
                highestMark = student.getTotalMark();
                highestMarkedStudent = student.getName();
            }
        }
        return highestMarkedStudent + " got the highest mark with " + highestMark ;
    }

}
