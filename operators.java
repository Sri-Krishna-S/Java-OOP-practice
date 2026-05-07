import java.util.Scanner;
public class operators{
    public int x;
    public int y;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the operator to be used : ");
        char op=sc.next().charAt(0);
        System.out.print("Enter the value of y : ");
        int  y= sc.nextInt();
        int result=0;
        switch(op){
            case '+':result=x+y;break;
            case '-':result=x-y;break;
            case '*':result=x*y;break;
            case '/':result=x/y;break;
            case '%':result=x%y;break;
            default:System.out.println("Operator is invalid...");return;
        }
        System.out.println("the arithmetic operation of x & y : "+result);
        sc.close();
    }
}