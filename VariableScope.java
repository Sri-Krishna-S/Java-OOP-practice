public class VariableScope{
    int instancevar=20;
    static int staticvar=30;
    public static void main(String[] args){
        VariableScope var=new VariableScope();
        int x=50;
        System.out.println("the instance variable is:"+var.instancevar); 
        System.out.println("the static variable is:"+staticvar);//can also use var.staticvar
        System.out.println("Local variable is:"+x);
    }
}