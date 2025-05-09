import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

   
    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

  
    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

      
        Employee[] employees = new Employee[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();

            System.out.print("Employee Salary: ");
            double eSalary = scanner.nextDouble();

           
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        
        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = scanner.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with number " + searchNo + " not found.");
        }

        scanner.close();
    }
}

