import java.util.Scanner;

public class ProgramHadiah {
    public static void main(String[] args) {
        int belanja =0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Total Belanjaan: Rp");
        belanja = scan.nextInt();

        if(belanja > 100000) System.out.println("selamat, anda mendapatkan hadiah!");
        System.out.println("Terima kasih...");
    }
}
