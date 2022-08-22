package arrays;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    static void app_1(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j =i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[j]+",");
                    break;
                }
            }
            if(j==n){
                System.out.println(-1+",");
            }
            
        }
    }
    static void app_2(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int output[]=new int[n];
        Arrays.fill(output,-1);
        st.push(0);
        for(int i=1;i<n;i++){
            if(arr[st.peek()]>=arr[i]){
                st.push(i);

            }
            else{
                while(arr[st.peek()]<arr[i]){
                    output[st.peek()]=arr[i];
                    st.pop();
                }
            }
        }
    }
    static void app_3(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int output[]=new int[n];
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            output[i]=(st.empty()? -1 : st.peek());
            st.push(arr[i]);
        }
    }
}
