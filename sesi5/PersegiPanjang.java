public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    // @override
    float luas(){
        float luas= panjang * lebar;
        System.out.println("Luas persegi panjang:"  + luas );
        return luas;
    }

    // @override
    float keliling(){
        float keliling= 2* panjang+ 2*lebar;
        System.out.println("keliling persegi panjang: "+ keliling);
        return keliling;
    }
}
