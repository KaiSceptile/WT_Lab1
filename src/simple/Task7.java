package simple;

public class Task7 {
    public double[] ShellSort(double[] array){
        for (int i=0; i+1<array.length; ){
            if (array[i]>array[i+1]) {
                double swap= array[i];
                array[i]=array[i+1];
                array[i+1]=swap;
                if (i!=0) i--;
            } else {
                i++;
            }
        }
        return array;
    }

    public String PrintArray(double[] array){
        String print="";
        for (int i=0; i<array.length; i++){
            print=print+array[i]+" ";
        }
        return print;
    }
}
