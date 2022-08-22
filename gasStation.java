package arrays;

public class gasStation {
    static int gasProblem(){

        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int startpt = 0;
        int loss = 0;
        for(int i =0;i<gas.length;i++){
            loss=loss+gas[i]-cost[i];
            if(loss<0){
                startpt+=1;
            }
        }
        return loss>=0 ? startpt :-1;
    }
    public static void main(String[] args) {
        gasProblem();
    }
}
