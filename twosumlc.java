package arrays;

import java.util.HashMap;


public class twosumlc {
    static void twosum(int arr[],int n){
        HashMap<Integer,Integer> cont = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            cont.put(arr[i], i);
            
        }
        for(int i = 0;i<arr.length;i++){
            
            int rem = n-arr[i];
            if(cont.containsKey(rem)){
                int index = cont.get(rem);
                System.out.println(i+","+index);
            }

        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,5};
        int n = 4;
        twosum(arr, n);
    }
}
