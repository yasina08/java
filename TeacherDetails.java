package yasina;

import java.util.Scanner;


class Employeess {
    int empId;
    String name;
    double salary;
    String address;

    
    Employeess(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}


class Teacher extends Employeess {
    String department;
    String subject;

    
    Teacher(int empId, String name, double salary, String address,
            String department, String subject) {

        super(empId, name, salary, address);  
        this.department = department;
        this.subject = subject;
    }

    
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("---------------------------");
    }
}

public class TeacherDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  

        
        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            
            t[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        
        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}
