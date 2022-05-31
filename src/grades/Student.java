package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;

        for(int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }

        return (double)total / (double)this.grades.size();
    }


    public static void main(String[] args) {
        Student Cory = new Student("Cory");
        Cory.addGrade(90);
        Cory.addGrade(80);


        System.out.println(Cory.getGradeAverage());
    }


}