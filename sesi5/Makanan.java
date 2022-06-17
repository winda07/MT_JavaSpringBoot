public class Makanan {
    public static void main(String[] args) {
        Restaurant data = new Restaurant();

        data.setMenu("Ayam goreng");
        data.setHarga(17.000);
        data.setSpecial(true);

        System.out.println("Menu makanan: "+ data.getMenu());
        System.out.println("Harga makanan: "+ data.getHarga());
        System.out.println("Menu Special: "+ data.getSpecial());
    }
}
