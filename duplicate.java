package arrays;

public class duplicate {
    static int dup(int arr[],int n){
        int j = 0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];

            }
            
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5};
        int n = arr.length;
        System.out.println(dup(arr, n));
    }
}
