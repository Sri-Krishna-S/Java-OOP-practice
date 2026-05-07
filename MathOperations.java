public class MathOperations{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add()//in varargs method we can input any no of arguments like (0/0,1/0,1,2,3)
        int sum=0;
        for (int num:numbers){
            sum+=num;
        }
        return sum;
    // different parameter order
    public String concatenate(String a, int b){//converts b into string and 
        return concatenate(a,b);// converts b into string and joins
    }
    public String concatenate(int a, String b){
        return concatenate(a,b);// converts a into string and joins
    }
}