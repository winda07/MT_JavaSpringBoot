import java.util.Scanner;

public class OperationAritmatika {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        
        Scanner keyboard = new Scanner(System.in);

        // // penjumlahan
        // System.out.println("Input angka-1: ");
        // angka1 = keyboard.nextInt();
        // System.out.println("Input angka-2: ");
        // angka2 = keyboard.nextInt();
        // hasil=angka1+angka2;
        // System.out.println("hasil: "+ hasil);

        // // pengurangan
        // System.out.println("Input angka-1: ");
        // angka1 = keyboard.nextInt();
        // System.out.println("Input angka-2: ");
        // angka2 = keyboard.nextInt();
        // hasil=angka1-angka2;
        // System.out.println("hasil: "+ hasil);

        // // perkalian
        // System.out.println("Input angka-1: ");
        // angka1 = keyboard.nextInt();
        // System.out.println("Input angka-2: ");
        // angka2 = keyboard.nextInt();
        // hasil=angka1*angka2;
        // System.out.println("hasil: "+ hasil);

        // // pembagian
        // System.out.println("Input angka-1: ");
        // angka1 = keyboard.nextInt();
        // System.out.println("Input angka-2: ");
        // angka2 = keyboard.nextInt();
        // hasil=angka1/angka2;
        // System.out.println("hasil: "+ hasil);

        // // hasil bagi
        // System.out.println("Input angka-1: ");
        // angka1 = keyboard.nextInt();
        // System.out.println("Input angka-2: ");
        // angka2 = keyboard.nextInt();
        // hasil=angka1%angka2;
        // System.out.println("hasil: "+ hasil);

        int x =20;
        int y=40;

        System.out.println("x + y = "+(x+y));
        // 60
        System.out.println("x - y = "+(x-y));
        // -20
        System.out.println("x * y = "+(x*y));
        // 800
        System.out.println("x / y = "+(x/y));
        // 0
        System.out.println("x % y = "+(x%y));
        // 20
        System.out.println("x++ = "+(x++));
        // 20
        System.out.println("x-- = "+(x--));
        // 21

        // perbedaan x++ dengan ++x
        System.out.println("x++ = "+(x++));
        // 20
        System.out.println("++x = "+(++x));
        // 22
    }
}
