public class Lingkaran extends BangunDatar {
    float r;

    // @override
    float luas(){
        float luas= (float)(Math.PI * r * r);
        System.out.println("luas lingkaran: " + luas);
        return luas;
    }

    // @override
    float keliling(){
        float keliling =(float)(2 * Math.PI * r);
        System.out.println("keliling lingkaran: "+ keliling);
        return keliling;
    }
}
