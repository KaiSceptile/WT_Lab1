package ClassesAndObjects.Task9;

import java.util.ArrayList;

public class Basket {
    public double weight;
    public ArrayList<Ball> balls;

    public Basket()
    {
        this.balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls)
    {
        this.balls = new ArrayList<>();
        for (Ball ball: balls)
            add(ball);
    }

    public void add(Ball ball){
        this.balls.add(ball);
        this.weight += ball.weight;
    }

    public int CountBlueBalls(){
        int result = 0;
        for (Ball  ball: balls)
        {
            if (ball.color == Color.blue)
                result++;
        }

        return result;
    }
}
