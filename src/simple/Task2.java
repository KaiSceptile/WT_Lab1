package simple;

public class Task2 {
    public boolean CheckBelongingToFigure(double x, double y){
        boolean check=false;
        if ((y>0)&&(y<=5)&&(Math.abs(x)<=4)) check=true;
        if ((y<=0)&&(y>=-3)&&(Math.abs(x)<=6)) check=true;
        return check;
    }
}
