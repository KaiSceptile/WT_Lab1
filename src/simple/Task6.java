package simple;

public class Task6 {
    public double[][] GetMatrix(double[] array){
        double[][] matrix= new double[array.length] [array.length];
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                matrix[i][j]=array[(j+i)%array.length];
            }
        }
        return matrix;
    }

    public String PrintMatrix(double[][] array){
        String PrintedMatrix="";
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                PrintedMatrix=PrintedMatrix+array[i][j]+" ";
            }
            PrintedMatrix=PrintedMatrix+"\n";
        }
        return PrintedMatrix;
    }
}
