import java.util.Arrays;
import java.util.Random;

/**
 * Created by Roman Egorov on 12.10.2016.
 */
class TaskOne {
    static Random rand = new Random();
    int[] mas = createArray();


    int[] createArray(){    // Create an array with random size (5 to 10), but only 1 or 0 value.
        int[] newArray = new int[rand.nextInt(5) + 5];
        for (int j = 0 ; j < newArray.length ; j++) {
            newArray[j] = rand.nextInt(2);
        }
        return newArray;
    }

    int[] swapNumbers(){  // Swap 1 and 0.

        for (int i = 0 ; i < mas.length; i++){
            mas[i] = (mas[i] == 0) ? 1 : 0;  //add ternary operator
        }
        return mas;
    }

    void printArrays(){  // print first and second edition of array.
        System.out.println("First edition of Array: " + Arrays.toString(mas));
        System.out.println("Swap edition: " + Arrays.toString(swapNumbers()));
        System.out.println();
    }
}

class TaskOneTester {
    public static void main(String[] args) {
        TaskOne first = new TaskOne();
        TaskOne second = new TaskOne();
        TaskOne third =  new TaskOne();
        first.printArrays();
        second.printArrays();
        third.printArrays();
    }
}
