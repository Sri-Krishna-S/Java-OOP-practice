import java.util.Scanner;
class Employee{
    private String NAME; private int ID; private double BP; private double HRA;
    private double DA; private double TA;
    public Employee(String NAME, int ID, double BP, double HRA, double DA, double TA){
        this.NAME=NAME;
        this.ID=ID;
        this.BP=BP;
        this.HRA=HRA;
        this.DA=DA;
        this.TA=TA;
    }
    public double CalculateGrossSalary(){
        return BP+HRA+DA+TA;
    }
    private void DisplayDetails(){
        System.out.println("Name : "+ NAME);
        System.out.println("ID : "+ ID);
        System.out.println("BP : "+ BP);
        System.out.println("HRA : "+ HRA);
        System.out.println("DA : "+ DA);
        System.out.println("TA : "+ TA);
        System.out.println("Gross Salary : "+ CalculateGrossSalary());
    }
    public String NAME(){return NAME;}
    public int ID(){return ID;}
}
public class MainEmployee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee e1=new readEmployee(sc,1);
        Employee e2=new readEmployee(sc,2);

        System.out.println("Total Salaries");
        System.out.printf("Employee %s has ID %d with gross salary %f",e1.NAME(),e1.ID(),e1.CalculateGrossSalary());
        System.out.printf("Employee %s has ID %d with gross salary %f",e2.NAME(),e2.ID(),e2.CalculateGrossSalary());
        System.out.println("Employee's highest salary comparison...");

        
    }
    public static Employee readEmployee(Scanner sc,int EmpNum){
        System.out.print("Enter the NAME of the Employee : ");
        String NAME=sc.nextLine();
        System.out.print("Enter the ID of the Employee : ");
        int ID=sc.nextInt();
        System.out.print("Enter the BP of the Employee : ");
        double BP=sc.nextDouble();
        System.out.print("Enter the HRA of the Employee : ");
        double HRA=sc.nextDouble();
        System.out.print("Enter the DA of the Employee : ");
        double DA=sc.nextDouble();
        System.out.print("Enter the TA of the Employee : ");
        double TA=sc.nextDouble();

        return Employee(NAME,ID,BP,HRA,DA,TA);
    } 
}