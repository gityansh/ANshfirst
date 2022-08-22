package arrays;

public class QuickSelect {
    public static int Quickselect(int arr[],int low,int high,int k){
        int pivot=arr[high];
        int pi=partition(arr, pivot, low, high);
        if(k-1>pi){
            return Quickselect(arr, pi+1, high, k-1);
        }
        if(k-1<pi){
            return Quickselect(arr,low ,pi-1, k-1);
        }
        else{
            return arr[pi];
        }
    }
    public static int partition(int arr[],int pivot,int low,int high){
        int i=low,j=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        return (j);
    }
}
