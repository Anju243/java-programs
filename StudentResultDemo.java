
class Student {
    int rollNumber;
    String name;
    double academicScore;

    Student(int rollNumber, String name, double academicScore) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.academicScore = academicScore;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academicScore);
    }
}


interface Sports {
    double getSportsScore();
}


class Result extends Student implements Sports {
    double sportsScore;

    Result(int rollNumber, String name, double academicScore, double sportsScore) {
        super(rollNumber, name, academicScore);
        this.sportsScore = sportsScore;
    }

    
    public double getSportsScore() {
        return sportsScore;
    }

   
    void displayResult() {
        displayStudent();
        System.out.println("Sports Score: " + getSportsScore());
        System.out.println("-----------------------------");
    }
}


public class StudentResultDemo {
    public static void main(String[] args) {
        Result student = new Result(101, "Alice Johnson", 88.5, 75.0);
        student.displayResult();
    }
}

