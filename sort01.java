package arrays;

public class sort01 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,0,0,1,1,0};
        int count=0;
        for(int e:arr){
            if(e==0){
                count ++;

            }

        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println(arr);
    }
}
