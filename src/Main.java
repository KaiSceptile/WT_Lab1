import simple.*;
import simple.Task1;

import ClassesAndObjects.Task9.*;
import ClassesAndObjects.Task12to16.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Task1 task1=new Task1();
        System.out.println("Task1: "+task1.GetResult(12,10));

        Task2 task2=new Task2();
        System.out.println("Task2: "+task2.CheckBelongingToFigure(3,11));

        Task3 task3=new Task3(7,11,0.55);
        task3.CalcFunc();
        System.out.println("Task3: \n"+task3.GetTable());

        int[] testarray={9,1,2,3,5,4,2,7};
        Task4 task4= new Task4();
        System.out.println("Task4: "+task4.GetNumbersOfSimple(testarray));

        Task5 task5= new Task5();
        System.out.println("Task5: "+task5.GetTheLeastNumberOfElements(testarray));

        double[] testarray2={1,19,22,10,7,5};
        Task6 task6= new Task6();
        System.out.println("Task6: \n"+task6.PrintMatrix(task6.GetMatrix(testarray2)));

        Task7 task7=new Task7();
        System.out.println("Task7: \n"+task7.PrintArray(task7.ShellSort(testarray2)));

        double[] testinserta={3,9,11,12};
        double[] testinsertb={1,2,8,10,14};
        Task8 task8=new Task8();
        System.out.println("Task8: \n"+task8.PrintIntArray(task8.GetIndexesToInsert(testinserta,testinsertb)));

        ArrayList<Ball> basket = new ArrayList<>();
        basket.add(new Ball(3.76, Color.blue));
        basket.add(new Ball(2.176, Color.yellow));
        basket.add(new Ball(2.176, Color.blue));
        basket.add(new Ball(12.726, Color.blue));
        basket.add(new Ball(12.726, Color.black));

        Basket Baskettest= new Basket(basket);
        System.out.println("Task9: \nweight:"+Baskettest.weight+" number of blue balls:"+Baskettest.CountBlueBalls());

        Book book=new Book("Name","Twen",1200,3,7);
        System.out.println("Task12: \n"+book);

        ProgrammerBook pbook=new ProgrammerBook("Name","Twen",1200,3,7,"C++",3);
        System.out.println("Task13: \n"+pbook);

        Book copy=(Book) book.clone();
        System.out.println("Task14: \n"+copy);

        ArrayList<Book> library= new ArrayList<>();
        library.add(new Book("Name","Twen",1200,3,7));
        library.add(new Book("Magazine","Twen",1110,6,1));
        library.add(new Book("Magazine","Pushkin",1280,2,3));
        library.add(new Book("Collection","Pushkin",180,1,4));
        library.sort(null);
        System.out.println("Task15: \n"+library);

        BookComparator Comparer=new BookComparator();
        library.sort(Comparer.byAuthorandTitle);
        System.out.println("Task16: \n"+library);

    }
}