package arrays;

import java.lang.reflect.Array;
import java.util.HashSet;

public class remDUPlc {
    static int removedup(int [] nums){
        HashSet<Integer> cont = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(cont.contains(nums[i])){
                continue;
            }
            else{
                cont.add(nums[i]);
            }

        }

        
        return cont.size();
        
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,3,4,4,4,5};
        System.out.println(removedup(nums));

    }
}
