package arrays;

public class barGraph {
    public static void main(String[] args) {
        int arr[]={2,1,4,9,5};
        int max = arr[0];
        int n = arr.length;
        for (int ele:arr){
            if(ele>max){
                max=ele;
            }
        }
        for(int i = max;i>=1;i--){
            for(int j=0;j<n;j++){
                if (i<=arr[j]){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }
    }
}
