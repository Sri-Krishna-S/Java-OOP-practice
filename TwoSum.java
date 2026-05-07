import java.util.Scanner;
public class TwoSum{
        static int add(int x, int y){
                return x+y;
        }
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter x value:");
                int x=sc.nextInt();
                System.out.print("\n");
                System.out.print("Enter y value:");
                int y=sc.nextInt();
                System.out.print("\n");
                System.out.println("The addition of x & y is:"+add(x,y));
        }
}