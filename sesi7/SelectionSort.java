import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int jumlahData;
        Scanner scan = new Scanner (System.in);

        System.out.print("Masukan jumlah data: ");
        jumlahData= scan.nextInt();

        int[] data = new int[jumlahData];
        System.out.println();
        for(int x=0; x<jumlahData;x++){
            System.out.format("input nilai data ke-%d: ", x+1);
            data[x]=scan.nextInt();
        }

        System.out.println();
        System.out.println("DATA SEBELUM DI SORTING ");
        for(int x=0; x<jumlahData;x++){
            System.out.print(data[x]+ " ");
        }

        System.out.println();
        System.out.println("PROSES SELECTION SORT ");
        for(int x=0; x<jumlahData-1;x++){
            System.out.format("Iterasi ke-%d : ",(x+1));
            System.out.println();
            for(int y=0; y<jumlahData;y++)
                System.out.println(data[y]+ " ");

            System.out.println("Apakah data "+ data[x]+ " sudah benar urutannya ?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak ada pertukaran";
            for(int y=x+1; y<jumlahData; y++){
                if(min > data[y]){
                    tukar= true;
                    index= y;
                    min= data[y];
                }
            }
            if(tukar==true){
                pesan= "Data "+ data[x]+ " ditukar dengan data " + data[index];
                int temp = data[x];
                data[x]= data[index];
                data[index]= temp;
            }
            for(int y=0;y <jumlahData;y++){
                System.out.println(data[y]+" ");
            }
            System.out.println(pesan+ "\n");
            
        }

        System.out.println("DATA SETELAH DI SORTING");
        for(int x=0; x<jumlahData; x++){
            System.out.println(data[x]);
        }
    }
}
