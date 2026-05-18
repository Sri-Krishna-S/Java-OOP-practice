import java.util.Arrays;
public class fcfs{
    public static void main(String[] args){
        int[]pid={1,2,3,4,5};
        int[]arr={1,0,2,3,4};
        int[]burst={2,3,5,4,6};
        int n=pid.length;
        int[] ct=new int[n];
        int[] tat=new int[n];
        int[] wt=new int[n];
        int time=0;
        int init=0;
        for(int i=0;i<n;i++){
           if(init<pid[i]){
                time=time+burst[i];
                ct[i]=time;
                tat[i]=ct[i]-arr[i];
                wt[i]=tat[i]-burst[i];
            }
            init++;
        }
        System.out.println("printing the output...");
        System.out.println("Process ID "+Arrays.toString(pid));
        System.out.println("Arrival time "+Arrays.toString(arr));
        System.out.println("Burst time "+Arrays.toString(burst));
        System.out.println("Completion time "+Arrays.toString(ct));
        System.out.println("Turn around time "+Arrays.toString(tat));
        System.out.println("Waiting time "+Arrays.toString(wt));
}
}