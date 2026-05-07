import java.util.Scanner;
class Rectangle{
    private double length; private double breadth;
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public static double CalculateArea(double length, double breadth){
        return length*breadth;
        }
}
public class MainRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the length : ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of the breadth : ");
        double y = sc.nextDouble();
        System.out.print("\n Calculating...\n");
        System.out.printf("The Area of the Rectangle with length %f and breadth %f  is : %f",x,y,Rectangle.CalculateArea(x,y));
    }
}