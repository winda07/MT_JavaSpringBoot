public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float sisi;

    // @override
    float luas(){
        float luas=  (alas*tinggi)/2;
        System.out.println("luas segitiga: "+ luas);
        return luas;
    }

    // @override
    float keliling(){
        float keliling= 3*sisi;
        System.out.println("keliling segitiga: "+keliling);
        return keliling;
    }
}
