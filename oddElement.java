package arrays;

public class oddElement {
    static void appr_1(int arr[],int n){
        int hash[]=new int[100];
        for(int i=0;i<n;i++){
            hash[arr[i]] = ++hash[arr[i]];
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
                System.out.println("Element is : "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        appr_1(arr, n);
    }
}
