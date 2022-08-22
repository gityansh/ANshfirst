package arrays;

import java.util.HashSet;

public class BuyAndSellStock {
    static void arr_1(int arr[]) {
        int n = arr.length;
        int first = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (max < (arr[j] - arr[i])) {
                    max = arr[j] - arr[i];
                    first = arr[i];
                    last = arr[j];
                }
            }

        }
        System.out.println(first + "," + last);

    }
    static void app_2(int arr[]){
        int n=arr.length;
        int profit=0;
        int final_profit=0;
        int prefixMin[]=new int[n];
        prefixMin[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixMin[i]=Math.min(prefixMin[i-1], arr[i]);
        }
        for(int i=0;i<n;i++){
            final_profit=arr[i]-prefixMin[i];
            profit=Math.max(final_profit, profit);
        }
    }
    static void app_3(int arr[]){
        int min=arr[0];
        int finalProfit=0;
        int profit=0;
        for(int i=1;i<arr.length;i++){
            finalProfit=arr[i]-min;
            profit=Math.max(finalProfit, profit);
            min=Math.min(min, arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        arr_1(arr);
    }
}
