package simple;

public class Task4 {
    int N;
    int[] Array;
    public Task4(int N, int[] Array){
        this.N=N;
        this.Array= Array;
    }
    private boolean CheckSimpleNumber(int a){
        boolean check=true;
        if (a==1) check=false;
        for (int i=2; i<1+Math.sqrt((double) a); i++){
            if (a % i == 0) check=false;
        }
        return check;
    }

    public String GetNumbersOfSimple(){
        String answer="";
        for (int i=0; i<this.N; i++){
            if (CheckSimpleNumber(this.Array[i])) answer=answer+(i+1)+" ";
        }
        if (answer.length() == 0) answer="No";
        return answer;
    }
}
