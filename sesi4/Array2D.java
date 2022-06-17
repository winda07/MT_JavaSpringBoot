public class Array2D {
    public static void main(String[] args) {
        String[][] framework={{"java","kotlin"},{"React","ReactNative"},{"Php","Laravel"}};

        for(int x=0; x<framework.length;x++){
            System.out.println("bahasa: "+ framework[x][0]);
            System.out.println("framework: "+ framework[x][1]);
            System.out.println("=========================");
        }
    }
}
