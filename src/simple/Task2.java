package simple;

public class Task2 {
    double x;
    double y;
    public Task2(double x, double y){
        this.x=x;
        this.y=y;
    }
    public boolean CheckBelongingToFigure(){
        boolean check=false;
        if ((y>0)&&(y<=5)&&(Math.abs(x)<=4)) check=true;
        if ((y<=0)&&(y>=-3)&&(Math.abs(x)<=6)) check=true;
        return check;
    }
}
