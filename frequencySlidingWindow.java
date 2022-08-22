package arrays;

public class frequencySlidingWindow {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,1,2,3,1};
        int n = arr.length;
        int k = 2;
        int x = 2;
        int freq = 0;
        for(int i=0;i<k;i++){
            if(arr[i]==x){
                freq += 1;

            }

        }
        System.out.println("Frequency is : "+freq);
        for(int i=k;i<n;i++){
            int kickoutele = arr[i-k];
            if (kickoutele == x){
                freq -- ;
            }
            int newele = arr[i];
            if(newele == x){
                freq ++;
            }
            System.out.println("Frequency is : "+freq);
        }
    }
}
