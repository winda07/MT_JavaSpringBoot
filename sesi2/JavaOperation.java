public class JavaOperation {
    public static void main(String[] args) {
        boolean x= true;
        boolean y = false;

        System.out.println("x && y = "+(x&&y));
        // false
        System.out.println("x || y = "+(x||y));
        // true
        System.out.println("!(x && y) = "+!(x&&y));
        // true
    }
}
