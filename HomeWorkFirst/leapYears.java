import java.util.Scanner;

/**
 * Created by Roman on 06.10.2016.
 */
class leapYears{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год : ");
        int year = in.nextInt();
        String a = null;
        String b = null;  // не могу понять, почему надо обязательно прописывать null? Но без null выдает ошибку.
        System.out.println(year + " год" + waswill(b, year) + leap(a, year));
    }
    static String leap (String a, int year){
        if (year % 4 == 0 && year % 100 != 0) {
            a = "високосным";
        }
        else if (year % 400 == 0) {
            a = "високосным";
        }
        else {
            a = "не високосным";
        }
        return a;
    }
    static String waswill (String b, int year){
        if (year < 2016){
            b = " был ";
        }
        else if (year == 2016){
            b = " является ";
        }
        else {
            b = " будет ";
        }
        return b;
    }
}