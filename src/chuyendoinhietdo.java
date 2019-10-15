import java.util.Scanner;

public class chuyendoinhietdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int choose;
        double ketqua;
        do {
            System.out.println ( "Chon kieu chuyen doi" );
            System.out.println ( "1-T sang F" );
            System.out.println ( "2-F sang T" );
            System.out.println ( "3-Exit" );
            choose = scanner.nextInt ();
            switch (choose) {
                case 1:
                    System.out.println ( "Nhap vao nhiet do T" );
                    ketqua = tToF ( scanner.nextDouble () );
                    System.out.println ( "Ket qua la:" + ketqua + " do F" );

                    break;
                case 2:
                    System.out.println ( "Nhap vao nhiet do F" );
                    ketqua = fToT (scanner.nextDouble ());
                    System.out.println ( "Ket qua la:" + ketqua + " do T" );
                    break;
                case 3:
                    System.exit ( 0 );
            }
        } while (choose <= 0 || choose > 3);
    }

    public static double tToF(double nhietdoT) {
        double nhietdoF = (9.0 / 5) * nhietdoT + 32;
        return nhietdoF;
    }

    public static double fToT(double nhietdoF) {
        double nhietdoT = (5.0 / 9) * (nhietdoF - 32);
        return nhietdoT;
    }
}

