package arrays;

public class optKrotation {
    // static void opApr(int arr[],int n,int k){
    //     int temp[] = new int[n];
    //     for(int i = 0;i<n;i++){
    //         temp[(i+k)%n]=arr[i];
    //     }
    //     System.out.println("Array after rotation : ");
    //     for(int i:arr){
    //         System.out.print(i+",");
    //     }


    //}
    static void reverse(int arr[], int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int m:arr){
            System.out.print(m+",");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        //opApr(arr, n, k);
        reverse(arr, 0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
}
