package arrays;

import java.util.Arrays;

public class pairSum {
   static void app_1(int arr[],int n,int k){
        int sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum = arr[i]+arr[j];
                if (sum == k){
                    System.out.println("Pair is : "+arr[i]+","+arr[j]);
                    return;
                } 

            }
        }
    }
    static void app_2(int arr[],int n,int k){
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                System.out.println("Pair is : "+arr[i]+","+arr[j]);
            }

            else if(arr[i]+arr[j]<k){
                i++;
            }
            else if(arr[i]+arr[j]>k){
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]  = {2,7,11,5};
        int n = arr.length;
        int k =9;
        app_1(arr, n, k);
        app_2(arr, n, k);
    }
}
