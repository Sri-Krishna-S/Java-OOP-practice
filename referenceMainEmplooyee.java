import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private double bp;
    private double hra;
    private double da;
    private double ta;
    public Employee(String name, String id, double bp, double hra, double da, double ta) {
        this.name = name;
        this.id = id;
        this.bp = bp;
        this.hra = hra;
        this.da = da;
        this.ta = ta;
    }
    public double calculateGrossSalary() {
        return bp + hra + da + ta;
    }
    public void displayDetails() {
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Basic Pay   : " + bp);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("TA          : " + ta);
        System.out.printf("Gross Salary: %.2f%n", calculateGrossSalary());
    }
    public String getName() { return name; }
    public String getId() { return id; }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Employee e1 = readEmployee(sc, 1);
            Employee e2 = readEmployee(sc, 2);

            System.out.println("\n--- Total Salaries ---");
            System.out.printf("%s (%s) : %.2f%n", e1.getName(), e1.getId(), e1.calculateGrossSalary());
            System.out.printf("%s (%s) : %.2f%n", e2.getName(), e2.getId(), e2.calculateGrossSalary());

            System.out.println("\n--- Employee with Highest Salary ---");
            Employee highest = (e1.calculateGrossSalary() >= e2.calculateGrossSalary()) ? e1 : e2;
            highest.displayDetails();
        }
    }
    private static Employee readEmployee(Scanner sc, int empNum) {
        System.out.println("\n--- Enter Details for Employee " + empNum + " ---");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Basic Pay (BP): ");
        double bp = sc.nextDouble();
        System.out.print("HRA: ");
        double hra = sc.nextDouble();
        System.out.print("DA: ");
        double da = sc.nextDouble();
        System.out.print("TA: ");
        double ta = sc.nextDouble();
        sc.nextLine();

        return new Employee(name, id, bp, hra, da, ta);
    }
}
