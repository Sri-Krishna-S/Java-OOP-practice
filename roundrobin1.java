import java.util.Arrays;
class roundrobin1{
    public static void main(String[] args){
        int[] pid={0,1,2,3,4};
        int[] at={0,1,2,3,4};
        int[] bt={5,3,1,2,3};
        int n=at.length;
        int[] rbt=Arrays.copyOf(bt,n);
        //we can also use manual copy using for(i=0;i<n;i++){rbt[i]=bt[i]}
        //why do we copy bt to rbt? because it will just reference to it and change in rbt leads to change in bt also
        int[] ct=new int[n];
        int[] tat=new int[n];
        int[] wt=new int[n];
        int q=2;//quantum time
        int time=0;
        while(true){
            boolean done=true;
            for(int i=0;i<n;i++){
            if(at[i]<=time && rbt[i]>0){
                done=false;
                if(rbt[i]>q){
                    time=time+q;
                    rbt[i]=rbt[i]-q;
                }
                else{//rbt[i]<=0
                    time=time+rbt[i];
                    ct[i]=time;
                    rbt[i]=0;
                }
            }
            }
            if(done==true){break;}
        }
        for(int i=0;i<n;i++){
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
        }
        System.out.println("Calculating...");
        System.out.println("Process ID : "+Arrays.toString(pid));
        System.out.println("Arrival Time : "+Arrays.toString(at));
        System.out.println("Burst Time : "+Arrays.toString(bt));
        System.out.println("Remaining Burst Time : "+Arrays.toString(rbt));
        System.out.println("Completion Time : "+Arrays.toString(ct));
        System.out.println("Turn around Time : "+Arrays.toString(tat));
        System.out.println("Waiting Time : "+Arrays.toString(wt));
    }
}