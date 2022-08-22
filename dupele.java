package arrays;

import java.util.HashSet;

public class dupele {
    static boolean dup(int nums[]){
        HashSet<Integer> number = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(number.contains(nums[i])){
                return true;
            }
            number.add(nums[i]);
        }
        return false;
        
        
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,3};
        System.out.println(dup(arr));
    }
}
