import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First task
        System.out.println("Задание 1:");
        task1();
        System.out.println();

        //Second task
        System.out.println("Задание 2:");
        task2();
        System.out.println();

        System.out.println("Задание 3:");
        task3();
        System.out.println();

        System.out.println("Задание 4:");
        task4();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Введите 2 числа - диапазон для рандомоного целого числа");
        System.out.println("Первое число - Min. Второе число - Max");
        Scanner myInput = new Scanner(System.in);
        int min = myInput.nextInt();
        int max = myInput.nextInt();

        int a = new Random().nextInt(((max - min) + 1) + min);
        System.out.println("Ответ: " + a);
    }


    public static void task2() {
        System.out.println("Введите строку для проверки на полиндромность.");
        Scanner myInput = new Scanner(System.in);
        String string = myInput.nextLine();

        StringBuilder sb = new StringBuilder(string);
        String stringRev = sb.reverse().toString();
        System.out.println("Ответ: " + string.equals(stringRev));
    }

    public static void task3() {
        System.out.println("Введите целое число для получения всех его натуральных делителей:");
        Scanner myInput = new Scanner(System.in);
        int num = myInput.nextInt();

        MyArrayList dividers = new MyArrayList();

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                dividers.addItems(i);
        }
        dividers.printMyArray();
        System.out.println();

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }

    public static void task4() {
        System.out.println("Введите целое число для получения суммы его членов:");
        Scanner myInput = new Scanner(System.in);
        int num = myInput.nextInt();
        int numArr = num;
        int result = 0;
        while(num>0)
        {
            result += num%10;
            num/=10;
        }
        System.out.println(result);


        int resultArr = 0;

        MyArrayList myArray = new MyArrayList();
        while(numArr>0)
        {
            myArray.addItems(numArr%10);
            numArr/=10;
        }

        for(int i = 0; i < myArray.getLength(); i++)
        {
           resultArr += myArray.getItem(i);
        }
        System.out.println(resultArr);

    }




/*
    public static boolean task2(String string)
    {
        int n;
        if (string.length()%2 == 0)
            n =  string.length()/2;
        else
            n =  string.length()/2+1;
        String firstHalf = string.substring(0, n);
        String secondHalf = string.substring(string.length()/2);
        StringBuilder sb = new StringBuilder(secondHalf);
        String secondHalfRev = sb.reverse().toString();
        return firstHalf.equals(secondHalfRev);
    }
*/

}

