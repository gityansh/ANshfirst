package arrays;

public class subarrGivenSum {
    static void app_1(int arr[],int sum,int n){
        for(int i=0;i<arr.length-1;i++){
            int total=0;
            for(int j=i;j<arr.length;j++){
                total += arr[j];
                if(sum==total){
                    System.out.println("Sum Found");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
    static void appr_2(int arr[],int sum,int n){
        int startIndex=0;
        int slideSum= arr[0];
        for(int i=1;i<n;i++){
            while(slideSum>sum && startIndex<i-1){
                slideSum = slideSum - arr[startIndex];
                startIndex ++;
            }
            if (sum == slideSum){
                System.out.println("Sum Found.....");
            }
            if (i<arr.length){
                slideSum += arr[i];
                return;
            }
            System.out.println("No such sum found....");
        }
        if (slideSum==sum){
            System.out.println("Sum Found.....");
        }
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int sum=6;
        int n=arr.length;
        app_1(arr, sum, n);
        appr_2(arr, sum, n);
    }
}
