package Assignment_9;

public class Admission {
    private double mark;
    private String grade;

    public void setMark(double mark) {
         this.mark = mark;
        if(mark >= 90){
           grade="A";
        }
           
        else if(mark >= 70){
            grade="B";

        }else if(mark >= 60){
            grade="C";

        }else {
            grade="Not eligible";
        }

        


        
    }

    public String getGrade() {
        return grade;
    }
    
}
