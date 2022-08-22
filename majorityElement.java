package arrays;

public class majorityElement {
    static int app_1(int arr[], int n) {
        int majorityCount = n / 2;
        for (int nums : arr) {
            int count = 0;
            for (int ele : arr) {
                if (ele == nums)
                    ;
                count += 1;
            }
            if (count > majorityCount) {
                return nums;

            }
            

        }
        return -1;
    }
    void app_2(int arr[],int n){ //Boyer moore algo
        int count = 0;
        int majorityElement=0;
        for(int i=0;i<n;i++){
            if(count==0){
                majorityElement=arr[i];
            }
            if(majorityElement==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==majorityElement){
                count++;
            }
        }
        String msg = count>n/2 ? "Majority Element ":"Not Majority Element";
        System.out.println(msg);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 3, 4, 5, 2, 2, 2 };
        int n = arr.length;
        app_1(arr, n);
    }
}
