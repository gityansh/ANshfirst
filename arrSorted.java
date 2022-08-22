package arrays;

public class arrSorted {
    static void isSorted(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    System.out.println("Not Sorted!");
                }
                
            }
            
        }
        System.out.println("Sorted!");
    }
    static void app_2 (int arr[],int n){
        for(int i =0;i<n;i++){
            if(arr[i]<arr[i-1]){
                System.out.println(" Not Sorted!");
            }
        }
        System.out.println("Sorted!");
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,5,3,6};
        isSorted(arr,5);
    }
}
