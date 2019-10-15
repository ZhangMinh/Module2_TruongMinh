import java.util.Random;
import java.util.Scanner;

public class chenphantuvaomang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner ( System.in );
        System.out.println ("Nhap vao kich thuoc mang");
        int[] mang = ranArray ( scanner.nextInt () );
    }
    public static int[] ranArray(int length) {
        Random ran = new Random ();
        int[] newarray = new int[length];
        for (int i = 0; i < length; i++) {
            newarray[i] = ran.nextInt ( 100 ) + 0;
        }
        return newarray;
    }

}
