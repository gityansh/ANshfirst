package arrays;

public class largestEle {
    static void optApproach(int arr[],int n){
        int max = arr[0];
        for(int i=1 ;i<n;i++ ){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int SecMax = arr[0];
        for(int i=1 ;i<n;i++ ){
            if (arr[i]!=max){
                if (arr[i]>SecMax){
                    SecMax = arr[i];
            }
                }
                
        System.out.println("Second Largest element is : "+ SecMax);        
        System.out.println("Largest element is : "+ max);}
    }
    public static void main(String[] args) {
        int arr[] = {20,24,10,36,76,90};
        int n = arr.length;
        optApproach(arr,n);
    }
}
