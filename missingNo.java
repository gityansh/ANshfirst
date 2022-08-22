package arrays;

public class missingNo {
    static void missNo(int arr[],int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum+arr[i];

        }
        int total = (n+1) * (n+2)/2;
        int missing = total-sum;
        System.out.println("Missing no. : "+ missing);
    }
    static void app_2(int arr[],int n){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            x=x^arr[i];
        }
        for(int i = min;i<=max;i++){
            y=y^i;
        }
        int miss=x^y;
        System.out.println("Missing no. : "+miss);;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        int n = arr.length;
        missNo(arr, n);
        app_2(arr, n);

    }
}
