package arrays;
public class leaderElement {
    public static void main(String[] args) {
        int arr[]={10,12,6,8,7,5,3};
        int n = arr.length;
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                System.out.println("Leader Element : "+arr[i]);
                max=arr[i];

            }
        }
    }
}
