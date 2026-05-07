import java.util.Scanner;
class Square{
    public double length;
    public static double calculateArea(double length){
        return length*length;
    }
}
public class MainSquare{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        int length = sc.nextDouble();
        System.out.println("The area of Square with length :"+length+" is : "+calculateArea(length));
        
    }
}