package simple;

public class Task8 {
    public int[] GetIndexesToInsert(double[] a, double[] b){
        int[] indexes=new int[b.length];
        int currenta=0;
        int currentb=0;
        int i=0;
        while ((currentb<b.length)&&(currenta<a.length)){
            if (a[currenta]<=b[currentb]) {currenta++;}
            else {
                indexes[i]=currenta+1;
                i++;
                currentb++;
            }
        }
        while (currentb<b.length){
            indexes[i]=currenta;
            i++;
            currentb++;
        }
        return indexes;
    }

    public String PrintIntArray(int[] array){
        String print="";
        for (int i=0; i<array.length; i++){
            print=print+array[i]+" ";
        }
        return print;
    }
}
