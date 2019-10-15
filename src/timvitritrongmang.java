import java.util.Random;
import java.util.Scanner;

public class timvitritrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int[] a = ranArray ( 5 );
        for (int x : a) {
            System.out.print ( x + "-" );
        }
        System.out.println ( "\nNhap vao value can tim:" );
        int b = scanner.nextInt ();
        findIndex ( a,b );
    }

    public static int[] ranArray(int length) {
        Random ran = new Random ();
        int[] newarray = new int[length];
        for (int i = 0; i < length; i++) {
            newarray[i] = ran.nextInt ( 100 ) + 0;
        }
        return newarray;
    }

    public static void findIndex(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == value) {
                index = i + 1;
                break;
            }
        }
        if (index == -1) {
            System.out.println ( "Khong tim thay!" );
        } else {
            System.out.println ( "Index finded:" + index );
        }
    }
}
