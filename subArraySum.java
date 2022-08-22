package arrays;

public class subArraySum {
    static void appr_2(int arr[], int k, int n) {
        int slidesum = 0;
        int maxsum=0;
        for (int i = 0; i < k; i++) {
            slidesum = slidesum + arr[i];
        }
        maxsum=slidesum;
        System.out.println(slidesum + ",");
        for (int j = k; j < n; j++) {
            
            slidesum = slidesum + arr[j] - arr[j - k];
            System.out.println(slidesum + ",");
        }
        if (slidesum>maxsum){
            maxsum=slidesum;
        }
        System.out.println(maxsum);
    }

    static void appr_1(int arr[], int k, int n) {
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.println(sum + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        int n = arr.length;
        appr_1(arr, k, n);
        appr_2(arr, k, n);
    }
}
