/**
 * Created by Roman on 06.10.2016.
 */
class trueorfalse {
    public static void main(String[] args) {
        int a = 5;
        int b = 21;
        System.out.println(checkIt(a , b));
    }
    static boolean checkIt (int a, int b){
        if (a + b < 20 && a + b > 10)
            return true;
        else
            return false;

    }
}