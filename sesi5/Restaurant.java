public class Restaurant {
    private String menu;
    private double harga;
    private boolean special;

    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setSpecial(boolean special){
        this.special = special;
    }

    public String getMenu(){
        return menu;
    }
    public double getHarga(){
        return harga;
    }
    public boolean getSpecial(){
        return special;
    }
}
