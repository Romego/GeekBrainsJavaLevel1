
/**
 * Created by Roman on 06.10.2016.
 */
class trueorfalse {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = -9;
        int d = a;
        System.out.println(math(a,b,c,d));
    }
    static int math (int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
