package arrays;

public class rotateArrayByk {
    static void k_times(int arr[],int n, int k){
        for(int j=1;j<=k;j++){
            int x = arr[n-1];
            for(int i = n-1;i>0;i--){
                arr[i]=arr[i-1];

            }
            arr[0]=x;
        }
        System.out.println("Array after rotation : ");
        for(int i:arr){
            System.out.print(i+",");
        }

    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int n = arr.length;
       int k = 4;
        k_times(arr, n, k);
    }
}
