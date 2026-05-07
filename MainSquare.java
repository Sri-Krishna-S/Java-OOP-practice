import java.util.Scanner;
class Square{
    private double length;
    public Square(double length){
        this.length=length;
    }
    public static double calculateArea(double length){
        return length*length;
    }
}
public class MainSquare{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of length: ");
        double length = sc.nextDouble();
        System.out.println("The area of Square with length : "+length+" is : "+Square.calculateArea(length));
    }
}