import java.util.Scanner;


class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

  
    Employee(int empid, String name, double salary, String address) {
        this.Empid = empid;
        this.Name = name;
        this.Salary = salary;
        this.Address = address;
    }
}

ds Employee {
    String Department;
    String SubjectsTaught;

   data members
    Teacher(int empid, String name, double salary, String address, String department, String subjectsTaught) {
        super(empid, name, salary, address);
        this.Department = department;
        this.SubjectsTaught = subjectsTaught;
    }

    
    void display() {
        System.out.println("Employee ID: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + Department);
        System.out.println("Subjects Taught: " + SubjectsTaught);
        System.out.println("----------------------------------");
    }
}


public class TeacherDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1));
            System.out.print("Enter Empid: ");
            int empid = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Subjects Taught: ");
            String subjectsTaught = sc.nextLine();

            teachers[i] = new Teacher(empid, name, salary, address, department, subjectsTaught);
        }

        System.out.println("\n--- Displaying Teacher Details ---");
        for (Teacher teacher : teachers) {
            teacher.display();
        }

        sc.close();
    }
}

