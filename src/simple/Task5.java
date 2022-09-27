package simple;

import java.util.Arrays;

public class Task5 {

    public int GetTheLeastNumberOfElements(int[] Array){
        int[] count=new int[Array.length];

        for(int j = 1; j < Array.length; j++){
            for (int i=0; i<j; i++){
                if ((Array[j]>Array[i])&&(count[j] <= count[i])) count[j] = count[i] + 1;
            }
        }
        Arrays.sort(count);
        return Array.length-count[count.length-1]-1;
    }
}
