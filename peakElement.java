package arrays;

public class peakElement {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,5,6,4};
        int n = arr.length;
        int peak=0;
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i+1]>arr[i]){
                    peak=i+1;
                }
            }
            else if(i==n-1){
                if(arr[i-1]<arr[i]){
                    peak=i;
                }
            }
            else {
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    peak=i;
                }
            }
        }
    }
}
