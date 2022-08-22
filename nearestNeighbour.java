package arrays;

public class nearestNeighbour {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int search = 70;
        int low = 0;
        int mid = 0;
        int nearestLowest=0;
        int nearestHighest=0;
        int high = arr.length - 1;
        while (low < high) {
            mid = (low + high) / 2;
            
            if (search > arr[mid]) {
                low = mid + 1;
                nearestLowest=arr[mid];

            } else if (search < arr[mid]) {
                high = mid - 1;
                nearestHighest=arr[mid];
            }
            else{
                nearestHighest=nearestLowest=arr[mid];
                return;
            }
        }
    }
}
