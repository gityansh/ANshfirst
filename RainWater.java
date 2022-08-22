package arrays;



public class RainWater {
    public static void main(String[] args) {
        int pillars[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n =pillars.length;
        if(n==0){
            System.out.println("No Pillar's Found......");
        }
        int pMax[]=new int[n];
        int sMax[]=new int[n];
        pMax[0]=pillars[0];
        sMax[n-1]=pillars[n-1];
        for(int i=1;i<n;i++){
            pMax[i] = Math.max(pMax[i-1], pillars[i]);
        }
        for(int i=n-2;i>=0;i--){
            sMax[i]=Math.max(sMax[i+1], pillars[i]);
        }
        int amtOFwater = 0;
        for(int i=0;i<n;i++){
            int currentPillar=pillars[i];
            int h1 = pMax[i];
            int h2 = sMax[i];
            int decidingHeight = Math.min(h1, h2);
            if(decidingHeight>currentPillar){
                amtOFwater += decidingHeight-currentPillar;
            }

        }
        System.out.println("Amount of water is : "+ amtOFwater);
    }
}
