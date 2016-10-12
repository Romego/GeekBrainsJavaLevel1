import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roman Egorov on 11.10.2016.
 */
class HomeWorkSecond {
    static int first[] = {1,0,1,1,0};
    static int second[] = new int[8];
    static int mas[] = {1,5,3,2,11,4,5,2,4,8,9,1};

    public static void main(String[] args) {
        System.out.println("First task - " + taskOne());
        System.out.println("Second task - " + taskTwo());
        System.out.println("Third task - " + taskThree());
        System.out.println("Fourth task - " + taskFour());
        System.out.println(taskFive());
    }

    static String taskOne(){ // программа работает, но не понял, почему не надо было в скобках заявлять о переменной.
        int firstLength = first.length;
        for (int i = 0 ; i < firstLength; i++){
            if (first[i] == 0){
                first[i] = 1;
            }
            else {
                first[i] = 0;
            }
        }
        String firstString = Arrays.toString(first);
        return firstString;
    }

    static String taskTwo(){
        int i,a;
        for (i = 0, a = 1; i < 8 && a <= 22 ; a += 3, i++) { // не понимаю, почему нельзя объявить и инициализировать переменные прямо в for (int i = 0; int a = 1).
            second[i] = a;
        }
        String secondString =  Arrays.toString(second);
        return secondString;
    }

    static String taskThree(){
        int masLength = mas.length;
        for (int i = 0 ; i < masLength; i++){
            if (mas[i] < 6){
                mas[i] = mas[i]*2;
            }
            else {
                mas[i] = mas[i];
            }
        }
        String masString = Arrays.toString(mas);
        return masString;
    }

    static String taskFour() {
        int masLength = mas.length;
        Arrays.sort(mas);
        String a = Integer.toString(mas[0]);
        String b = Integer.toString(mas[masLength - 1]);
        return "min: " + a + ", " + "max: " + b;
    }
    static String taskFive(){
        System.out.print("Enter first number ");
        Scanner a1 = new Scanner(System.in);
        int a =  a1.nextInt();
        System.out.print("Enter calc operation (only + - / *) ");
        Scanner c1 = new Scanner(System.in);
        String c = c1.nextLine();
        System.out.print("Enter second number ");
        Scanner b1 = new Scanner(System.in);
        int b = b1.nextInt();
        String d = null;
        int e;

        if (c.equals("*")){
            e = a*b;
            d = Integer.toString(e);
        }
        if (c.equals("/")){
            e = a/b;
            d = Integer.toString(e);
        }
        if (c.equals("+")){
            e = a+b;
            d = Integer.toString(e);
        }
        if (c.equals("-")){
            e = a-b;
            d = Integer.toString(e);
        }
        if (c.length() > 1){
            System.out.println("ERROR");
        }

        return "Result: " + d ;
    }
}


