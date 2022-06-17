import java.util.Scanner;

public class CheckGraduation {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("Nilai: ");
        nilai = scan.nextInt();

        if(nilai >= 70){
            System.out.println("selamat " + nama + ", anda lulus");
        }else {
            System.out.println("Maaf " + nama + ", anda tidak lulus");
        }
    }
}
