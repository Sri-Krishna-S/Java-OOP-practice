public class loops{
    public static int i;
    public static void main(String[] args){
        System.out.println("for loop...");
        for(i=0;i<=10;i++){
            System.out.print(i);
            if(i==10)System.out.print('\n');
        }
        System.out.println("while loop...");
        while(i<=5){
            System.out.print(i);
            i++;
            if(i==5)System.out.print('\n');
        }
        System.out.println("do-while loop...");
        do{
            System.out.print(i);
            i++;
        }while(i<=6);
    }
}