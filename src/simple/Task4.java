package simple;

public class Task4 {
    private boolean CheckSimpleNumber(int a){
        boolean check=true;
        if (a==1) check=false;
        if (a==2) return true;
        for (int i=2; i<1+Math.sqrt((double) a); i++){
            if (a % i == 0) check=false;
        }
        return check;
    }

    public String GetNumbersOfSimple(int[] Array){
        String answer="";
        for (int i=0; i<Array.length; i++){
            if (CheckSimpleNumber(Array[i])) answer=answer+(i+1)+" ";
        }
        if (answer.length() == 0) answer="No";
        return answer;
    }
}
