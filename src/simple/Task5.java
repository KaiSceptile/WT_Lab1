package simple;

public class Task5 {
    int N;
    int[] Array;
    public Task5(int N, int[] Array){
        this.N=N;
        this.Array= Array;
    }
    public int GetTheLeastNumberOfElements(){
        int result = 0, currMaxNumber = this.Array[0];
        for(int i = 0; i < this.Array.length - 1; i++){
            if (this.Array[i + 1] <= currMaxNumber){
                result++;
            }
            else{
                currMaxNumber = this.Array[i + 1];
            }
        }
        return result;
    }
}
