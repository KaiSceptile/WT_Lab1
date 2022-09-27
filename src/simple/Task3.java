package simple;

public class Task3 {
    double a;
    double b;
    double h;
    public double[] arrayarg;
    public double[] arraytg;

    public Task3(double a,double b, double h){
        this.a=a;
        this.b=b;
        this.h=h;
        int size=(int) (Math.round((b-a)/h*10)/10+1);
        this.arrayarg=new double[size];
        this.arraytg=new double[size];
    }
    public void CalcFunc(){
        int current=0;
        for (double i=this.a; i<=this.b; i=i+this.h){
            this.arrayarg[current]=i;
            this.arraytg[current]=Math.tan(i);
            current++;
        }
    }
    public String GetTable(){
        String table="";
            for (int i=0; i<this.arrayarg.length; i++) {
                table = table + "%4.4f    %4.4f\n";
                table = String.format(table, this.arrayarg[i], this.arraytg[i]);
            }
        return table;
    }
}
