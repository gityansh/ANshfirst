package arrays;

import java.util.Arrays;

public class AllAnagramList {
    static void anagramlist(String wordarr[]){
        String words[] = wordarr.clone();
        int index = 0;
        for(String word :words){
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            words[index]=String.valueOf(arr);
            index ++;

        }
        for(int i=0;i<words.length;i++){
            if(i<words.length-1 && words[i].equals(words[i+1])){
                System.out.println(wordarr[i]+wordarr[i+1]);
            }
        }
    }
}
