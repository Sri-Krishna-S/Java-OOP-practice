import java.util.Arrays;
public class sjf{
    public static void main(String[] args){
        int[]pid={1,2,3,4,5};
        int[]at={3,1,4,0,2};
        int[]bt={1,4,2,6,3};
        int n=at.length;
        int[]ct=new int[n];
        int[]wt=new int[n];
        int[]tat=new int[n];
        int temp;
       int time=0;
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(bt[i]>bt[j]){
                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;

                    temp=pid[i];
                    pid[i]=pid[j];
                    pid[j]=temp;

                    temp=at[i];
                    at[i]=at[j];
                    at[j]=temp;
                }

            }
        }
        int minindex=0;
        int temp1;
        for(int i=1;i<n;i++){
            if(at[i]<at[minindex]){
                temp1=at[i];
                at[i]=at[minindex];
                at[minindex]=temp1;

                temp1=pid[i];
                pid[i]=pid[minindex];
                pid[minindex]=temp1;

                temp1=bt[i];
                bt[i]=bt[minindex];
                bt[minindex]=temp1;
                
                
            }
        }
        time=time+bt[minindex];
        ct[minindex]=time;
        tat[minindex]=ct[minindex]-at[minindex];
        wt[minindex]=tat[minindex]-bt[minindex];
        for(int i=1;i<n;i++){
                time=time+bt[i];
                ct[i]=time;
                tat[i]=ct[i]-at[i];
                wt[i]=tat[i]-bt[i];
        }
        System.out.println("printing the output...");
        System.out.println("Process ID "+Arrays.toString(pid));
        System.out.println("Arrival time "+Arrays.toString(at));
        System.out.println("Burst time "+Arrays.toString(bt));
        System.out.println("Completion time "+Arrays.toString(ct));
        System.out.println("Turn around time "+Arrays.toString(tat));
        System.out.println("Waiting time "+Arrays.toString(wt));
        }
    }