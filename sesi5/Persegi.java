public class Persegi extends BangunDatar {
    float sisi;
    
    // @override
    float luas(){
        float luas = (sisi*sisi);
        System.out.println("luas persegi: "+ luas);
        return luas;
    }

    // @override
     float keliling(){
        float keliling= (4*sisi);
        System.out.println("keliling persegi" + keliling);
        return keliling;
    }
}
