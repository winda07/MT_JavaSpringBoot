import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inputkan nama warna");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("berenti");
                break;
            case "kuning":
                System.out.println("hati-hati");
                break;
            case "Hijau":
                System.out.println("jalan");
                break;
            default:
                System.out.println("salah warna");
        }
    }
}
