package simple;

public class Task1 {
    public double GetResult(double x, double y){
        double result=(1+Math.pow((Math.sin(x+y)),2))/(2+Math.abs(x-(2*x)/(1+x*x*y*y)))+x;
        return result;
    }
}
