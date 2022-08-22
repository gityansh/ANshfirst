package arrays;

public class kadane {
    static int ms(int nums[]){
        int mxsum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j =i;j< nums.length;j++){
                int sum = 0;
                sum = nums[i]+nums[j];
                for(int k =i;k<=j;k++){
                    sum += nums[k];
                    if(sum>mxsum){
                        mxsum = sum;
                    }
                }
            }
        }
        return mxsum;
    }
    static int kadan(int nums[]){
        int msum = nums[0];
        int csum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(csum>=0){
                csum+=nums[i];

            }
            else{
                csum = nums[i];
            }
            if(csum>msum){
                msum=csum;
            }
        }
        return msum;
    }
    public static void main(String[] args) {
        int nums[]={1,-2,3};
        System.out.println(kadan(nums));
    }

}
