import simple.*;
import simple.Task1;

import ClassesAndObjects.Task9.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Task1 task1=new Task1(12,10);
        System.out.println("Task1: "+task1.GetResult());

        Task2 task2=new Task2(3,11);
        System.out.println("Task2: "+task2.CheckBelongingToFigure());

        Task3 task3=new Task3(7,11,0.55);
        task3.CalcFunc();
        System.out.println("Task3: \n"+task3.GetTable());

        int[] testarray={1,19,22,10,7,5};
        Task4 task4= new Task4(testarray.length,testarray);
        System.out.println("Task4: "+task4.GetNumbersOfSimple());

        Task5 task5= new Task5(testarray.length,testarray);
        System.out.println("Task5: "+task5.GetTheLeastNumberOfElements());

        double[] testarray2={1,19,22,10,7,5};
        Task6 task6= new Task6();
        System.out.println("Task6: \n"+task6.PrintMatrix(task6.GetMatrix(testarray2)));

        Task7 task7=new Task7();
        System.out.println("Task7: \n"+task7.PrintArray(task7.ShellSort(testarray2)));

        double[] testinserta={3,9,11,12};
        double[] testinsertb={1,2,8,10,14};
        Task8 task8=new Task8();
        System.out.println("Task8: \n"+task8.PrintIntArray(task8.GetIndexesToInsert(testinserta,testinsertb)));

        ArrayList<Ball> basket = new ArrayList<Ball>();
        basket.add(new Ball(3.76, Color.blue));
        basket.add(new Ball(2.176, Color.yellow));
        basket.add(new Ball(2.176, Color.blue));
        basket.add(new Ball(12.726, Color.blue));
        basket.add(new Ball(12.726, Color.black));

        Basket Baskettest= new Basket(basket);
        System.out.println("Task9: \nweight:"+Baskettest.weight+" number of blue balls:"+Baskettest.CountBlueBalls());

    }
}