package simple;

public class Task1 {
    int x;
    int y;
    public Task1(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double GetResult(){
        double result=(1+Math.pow((Math.sin(x+y)),2))/(2+Math.abs(x-(2*x)/(1+x*x*y*y)))+x;
        return result;
    }
}
