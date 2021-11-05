package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer>grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double averageGrade = 0;
        for(double grade : grades){
            averageGrade += grade;
        }
        return averageGrade / grades.size();
    }

    public static void main(String[] args){
        Student mag = new Student("Magallan");
        Student kap = new Student("Kap");
        mag.addGrade(80);
        mag.addGrade(20);
        mag.addGrade(100);

        kap.addGrade(100);
        kap.addGrade(40);
        kap.addGrade(10);

        System.out.println("The average grades are: ");
        System.out.println("mag.getGradeAverage() = " + mag.getGradeAverage());
        System.out.println("kap.getGradeAverage() = " + kap.getGradeAverage());


    }

}


