package arrays;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int search=70;
        int low=0;
        int mid=0;
        int high = arr.length-1;
        while(low<high){
            mid=(low+high)/2;
            if(search==arr[mid]){
                System.out.println("Element found ....");
                return;
            }
            if(search>arr[mid]){
                low=mid+1;

            }
            else if(search<arr[mid]){
                high=mid-1;
            }
        }
    }
}
