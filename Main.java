import java.util.Date;
public class Main{
    public static void main(){
        // primite types
        byte number = 127;
        int number1 = 3434_891;
        long number3 = 3843014_0394L;
        float number4 = 191.019F;
        char letter = 'A';
        boolean isTrue = false;

        //Reference types
        Date now = new Date();

        //primitive vs ref types

        byte x = 1;
        byte y = x;
        x = 2;

        // String msg = new String("Hello Java");
        // String msg1 = "Msg without" + "instance";

        //arrays
        int[] arr = new int[5];
        arr[0] = 1;
        System.out.println(arr[0]);

        int[] arr1 = {1,3,8,4,2,9};
        System.out.println(arr1.length);
    }
}