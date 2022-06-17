public class OperatorPembanding {
    public static void main(String[] args) {
        // int nilaiA=12;
        // int nilaiB=4;
        // boolean hasil;

        // hasil= nilaiA > nilaiB;
        // System.out.println(hasil);
        // // true

        // hasil= nilaiA < nilaiB;
        // System.out.println(hasil);
        // // false

        // hasil= nilaiA >= nilaiB;
        // System.out.println(hasil);
        // // true

        // hasil= nilaiA <= nilaiB;
        // System.out.println(hasil);
        // // false

        // hasil= nilaiA == nilaiB;
        // System.out.println(hasil);
        // // false

        // hasil= nilaiA != nilaiB;
        // System.out.println(hasil);
        // // true

        int x=10;
        int y=15;
        int hasil=0;

        hasil = x & y;
        System.out.println("x & y =" + hasil);
        // 10

        hasil = x | y;
        System.out.println("x | y =" + hasil);
        // 15

        hasil = x ^ y;
        System.out.println(" x ^ y =" + hasil);
        // 5

        hasil = ~x;
        System.out.println(" ~x =" + hasil);
        // -11

        hasil = x << 2;
        System.out.println("x << 2" + hasil);
        // 240

        hasil = x >> 2;
        System.out.println("x >> 2 =" + hasil);
        // 2

        hasil = x >>> 2;
        System.out.println("x >>> 2 =" + hasil);
        // 2

    }
}
