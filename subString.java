package arrays;

import java.util.ArrayList;

public class subString {
    static void substr(String str){
        ArrayList<String> subseq = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char firstchar = str.charAt(i);
            if(subseq.size()==0){
                subseq.add(" ");
                subseq.add(" "+firstchar);
                continue;
            }
            int sublen = subseq.size();
            for(int j=0;j<sublen;j++){
                if(!subseq.contains(" "+firstchar)){
                    subseq.add(" "+firstchar);
                }
                String temp = subseq.get(j)+firstchar;
                if(!subseq.contains(temp)){
                    subseq.add(temp);
                }
            }
            
        }
    }
}
